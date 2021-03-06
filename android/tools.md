[1]: https://developer.android.com/studio/write/tool-attributes
[2]: https://github.com/JetBrains/android

[3]: https://github.com/JetBrains/android/blob/40ee31fa0b3d6733aa364c6f1561354433f523e1/android/src/com/android/tools/idea/res/SampleDataResourceRepository.java
[4]: https://github.com/JetBrains/android/blob/40ee31fa0b3d6733aa364c6f1561354433f523e1/android/src/com/android/tools/idea/res/SampleDataResourceItem.java
[5]: https://github.com/JetBrains/android/blob/2af3571e22ba72b5d1a70493e023608fe80fc0f8/android/src/com/android/tools/idea/sampledata/datasource/LoremIpsumGenerator.java

# Tools Attributes

Attributes in the tools namespace enable design-time features or compile-time
behaviors. Start using these attributes by adding the namespace to your `xml`
file, see the following example:

```xml
<root xmlns="http://http://schemas.android.com/tools"></root>
```

## Attributes

### Lint warnings suppression

| Attribute         | Apply to | Description | Example |
|-------------------|----------|-------------|---------|
| `tools:ignore`    |          |             |         |
| `tools:targetApi` |          |             |         |
| `locale`          |          |             |         |

### Design-time attributes overriding

| Attribute          | Apply to | Description | Example |
|--------------------|----------|-------------|---------|
| `tools:*`          |          |             |         |
| `tools:context`    |          |             |         |
| `tools:itemCount`  |          |             |         |
| `tools:layout`     |          |             |         |
| `tools:listitem`   |          |             |         |
| `tools:listheader` |          |             |         |
| `tools:listfooter` |          |             |         |
| `tools:showIn`     |          |             |         |
| `tools:menu`       |          |             |         |
| `tools:minValue`   |          |             |         |
| `tools:maxValue`   |          |             |         |
| `tools:openDrawer` |          |             |         |

### Resource shrinking

## Tools Resources and Sample Data

The tools library defines a set of resources, text and images, that can be used
as placeholder to test how your layout behaves with data in it. These
attributes are defined inside the `tools` package and can be referenced with
`@tools:sample/*.` The followings are all predefined resources in the package:

| Attribute value                    | Description                                                                                                                |
|------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| `@tools:sample/full_names`         | Full names that are randomly generated from the combination of `@tools:sample/first_names` and `@tools:sample/last_names`. |
| `@tools:sample/first_names`        | Common first names.                                                                                                        |
| `@tools:sample/last_names`         | Common last names.                                                                                                         |
| `@tools:sample/cities`             | Names of cities from across the world.                                                                                     |
| `@tools:sample/us_zipcodes`        | Randomly generated US zip codes.                                                                                           |
| `@tools:sample/us_phones`          | Randomly generated phone numbers with the following format: (800) 555-xxxx.                                                |
| `@tools:sample/lorem`              | Placeholder text that is derived from Latin.                                                                               |
| `@tools:sample/date/day_of_week`   | Randomized dates and times for the specified format.                                                                       |
| `@tools:sample/date/ddmmyy`        |                                                                                                                            |
| `@tools:sample/date/mmddyy`        |                                                                                                                            |
| `@tools:sample/date/hhmm`          |                                                                                                                            |
| `@tools:sample/date/hhmmss`        |                                                                                                                            |
| `@tools:sample/avatars`            | Vector drawables that you can use as profile avatars.                                                                      |
| `@tools:sample/backgrounds/scenic` | Images that you can use as backgrounds.                                                                                    |

### Custom sample data

### Source code

You can have a look at the code used to provide the sample data [here][3]. The
class [SampleDataRepository][3] defines the set of predefined sources and allows
to define new data sources. A sample data source is defined by an instance of
[SampleDataResourceItem][4]. [LoremImpsumGenerator][5] is an example of data
generator used by SampleDataResourceItem.

# References

- [Tools attributes on developer.android.com][1];
