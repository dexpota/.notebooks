# Memory Leaks

> [Reference](https://android.jlelse.eu/9-ways-to-avoid-memory-leaks-in-android-b6d81648e35e)

> A non-complete list of memory leaks error characteristic to Android

## BroadcastReceiver

> Unregistered BroadcastReceiver

The `BroadcastReceiver` keeps a reference to the registered Activity. If you
don't unregister the BroadcastReceiver this will leak memory. To solve this
issue always unregister the BroadcastReceiver when the Activity stops.

```java
class MainActivity extends AppCompatActivity{
    ...

    @Override
    protected void onStart() {
        super.onStart();
        registerReceiver(broadcastReceiver, ...);
    }


    @Override
    protected void onStop() {
        super.onStop();

        if(broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
    }
}
```

## Static references to your Activity or Views

> Static reference to an Activity or View

If you reference an activity or view directly or indirectly from a static
reference, the activity would not be garbage collected after it is destroyed.

```java

public class LeakingActivity extends AppCompatActivity {
  // do not do this
  private static TextView textView;
  private static Activity activity;

  // more code
}
```

## Singleton

> Singleton with a static reference to an Activity

If you have a Singleton class which needs the context or the activity in order
to accomplish some tasks, the activity will not be garbage collected. There are
two possible solutions: instead of passing the activity context, pass the
application context. If you need to use the activity context, then ensure that
it will be set to null when the activity is destroyed.

```java
public class Singleton {
  // this context will stay alive as long as the application
  private Context context;
  private static Singleton instance;

  // more code
}
```

## Inner Classes (non-static nested classes) and Anonymous Inner Classes

> Static reference to an inner class.

When you declare a static reference to an instance of an inner class inside an
Activity, the Activity will not be garbage collected. Remember that an inner
class holds a reference to its outer class regardless of the reference being
declared or not.

```java

class LeakyActivity {
  private static InnerClass inner;


  class InnterClass {
    // this attribute is always declared, by the programmer or the compiler.
    private LeakyActivity activity;
  }
}
```

This problem could be avoided by simply not declaring a static references to
the inner classes. Another solution is to use static nested classes without
references to acitivities or views, in fact, these classes doesn't declare a
reference to the outer class.

If you need references to the outer class and a static reference to the inner
class, consider using WeakReference to the activity. The garbage collector can
safely collect the memory if only weak references are pointing to it.

These same issues are present when declaring an anonymous inner class and are
common when declaring AsyncTask, Handlers, Threads and TimerTask.
