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
