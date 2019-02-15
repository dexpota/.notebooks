# Location Services

The location APIs available in Google Play services facilitate adding location
awareness to your app with automated location tracking, geofencing, and
activity recognition.

## Receive location updates

- Your app can request periodic updates from the fused location provider;
- The API updates your app periodically with the best available location, based
  on the currently-available location providers
- The accuracy of the location is determined by the providers, the location
  permissions you've requested, and the options you set in the location
  request.

### Example

- The last known location of the device provides a handy base from which to
  start, ensuring that the app has a known location before starting the
  periodic location updates.


## References

- https://developer.android.com/training/location/
