# vim

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
