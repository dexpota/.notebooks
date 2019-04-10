# Tips and tricks

## Tips

### Deprecated Functions and Alternatives

The function `getColor()` is deprecated and should be substituted with
`ContextCompat.getColor()`;

### Data Binding

#### Spannable Text

If you are going to use spannable text with format string within a data-binding
expression you will loose the style information. The following is an example
which illustrates the problem and gives two possible solutions. The first
solution use `TextUtils.concat` to concatenate multiple strings together. While
the second one uses `TextUtils.expandTemplate` together with a template string
to build the string.

```xml
<!-- layout file -->

<!-- This will style the text bold, but it's not using a format string. -->
<TextView android:layout_width="wrap_content" android:layout_height="wrap_content"
          android:text="@{SpannableUtils.bold(user.nickname)}"/>

<!-- This will loose the styling information. -->
<TextView android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:text="@{@string/hello_nickname(SpannableUtils.bold(user.nickname))}"/>

<!-- This concatenates multiples strings together and will keep are styling information. -->
<!-- Watch out for null values! -->
<TextView android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:text="@{TextUtils.concat(@string/hello, SpannableUtils.bold(user.nickname))}"/>

<!-- This use the template specified to build a string, while keeping all styling information.  -->
<!-- Watch out for null values! -->
<TextView android:layout_width="wrap_content"
          android:layout_height="wrap_content"
          android:text="@{TextUtils.expandTemplate(@string/hello_nickname_template, SpannableUtils.bold(user.nickname))}"/>
```

```xml
<!-- resource file -->

<string name="hello_nickname">Hello %s!</string>
<string name="hello">Hello </string>
<string name="hello_nickname_template">Hello ^1!</string>
```

The basic idea behind the solution is to format each entity individually and
then combine them either with `TextUtils.concat` or with
`TextUtils.expandTemplate`.
