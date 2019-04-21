[1]: https://developer.android.com/studio/write/tool-attributes

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

# References

- [Tools attributes on developer.android.com][1];
