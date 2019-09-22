# Android IDE Template Format

## Steps

1. create a directory for your template;
2. create the `template.xml` file;
3. create the `global.xml.ftl` file;
4. create template files inside `root/src/app_package`;
5. create the `recipe.xml.ftl` file;

## Directories
> Where to place your templates.

- `$HOME/.android/templates`
- It doesn't seem possible to save the template files inside Android Studio's preferences directory;

For more information on how the templates are loaded see [here](https://github.com/JetBrains/android/blob/master/android/src/com/android/tools/idea/templates/TemplateManager.java).

## References

- http://newandroidbook.com/code/android-6.0.0_r1/sdk/templates/docs/
- https://robusttechhouse.com/tutorial-how-to-create-custom-android-code-templates/
- https://robots.thoughtbot.com/breezing-through-android-boilerplate-with-custom-activity-templates
