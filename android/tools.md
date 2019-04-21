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

## Tools Resources
