# Memory Leaks

> [Reference](https://android.jlelse.eu/9-ways-to-avoid-memory-leaks-in-android-b6d81648e35e)

> A non-complete list of memory leaks error characteristic to Android

## BroadcastReceiver

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

If you reference an activity or view directly or indirectly from a static
reference, the activity would not be garbage collected after it is destroyed.
