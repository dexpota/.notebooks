# vim

## Tabs
> [Reference](https://tedlogan.com/techblog3.html)

- `tabstop` or `ts` is a **local** **numeric** option: number of columns that a
  tab in the file counts for. This option tells vim how many columns a tab is;

- `expandtab` is a **local** **boolean** option: if set, when in insert mode,
  it will expanded each tab into spaces;

- `shiftwidth` is a **local** **numeric** option: number of spaces to use for
  each step of (auto)indent;

- `softtabstop` is a **local** **numeric** option: control how many columns vim
  uses when you hit tab in insert mode. If the value is less than *tabstop* it
  will use spaces, otherwise a mix of tabs and spaces. When *expandtab* is set
  it will always expand to spaces;

### Common configurations

```vim
" Tabs are four columns wide. Each indentation level is one tab.
:set tabstop=4 softtabstop=4 shiftwidth=4 noexpandtab
" Each indentation level is four spaces. Tabs are not used
:set softtabstop=4 shiftwidth=4 expandtab
```

### Visualizing tabs

If you want to be sure of what tab style is currently used in your file, you
can use syntax highlighting to show tabs. The following code will highlight
each matched tab in blue.

```vim
syntax match Tab /\t/
hi ctermbg=blue
```

This code cannot be pasted inside your configuration file, because the
highlighing rules are flushed each time a file is loaded. An alternative is to
put this code inside a syntax highlighting script in `.vim/syntax` directory.

## Filetype plugin
> `:help ftplugin`

A filetype plugin is like a global plugin, except that its settings are applied
based on the filetype of the buffer. The effects of the plugin should apply for
the current buffer only. But it is up to the author to ensure these
requirements are satisfied.


### Add a filetype plugin
> `:help add-filetype-plugin`

You can add a filetype plugin by creating a file with the right name and
dropping it in the right directory. The association between the plugin and the
filetype is based on the name of the plugin.  The `<filetype>` part of the name
identify the filetype the plugin is to be used for.

```vim
" plugin for <filetype>
.vim/ftplugin/<filetype>.vim
" if you already have a <filetype> plugin you can add another with by appending
" <name>
.vim/ftplugin/<filetype>_<name>.vim
.vim/ftplugin/<filetype>/<name>.vim
```

### References

- https://www.reddit.com/r/vim/wiki/where_to_put_filetype_specific_stuff
- http://vim.wikia.com/wiki/Keep_your_vimrc_file_clean
