# git

For start you should with the following definitions, and explains that git is distribuited

The development environment with:
- Working directory
- Staging area or index
- Local repository (.git directory)

Three states of file:
- modified;
- committed;
- staged;

A server with:
- Remote repository

By using the structure just defined you should explain some basic commands like *clone*, making changes and *updating* the remote server.

- cloning a repository: the files are downloaded and moved to two places: the working directory and the local repository;

There are two types of files inside the working directory: *tracked* (known by git) and *untracked* (unkown by git).

- updated a remote repository by following these steps:
	- add changed or untracked files to the staging area (modified);
		- you can see the differences by using git diff;
	- create a commit in the local repository (staged);
		- differences: git diff --staged;
	- push the commits to the remote repository (committed);
		- differences: git diff [^REF]

- fetch data to the local repository;

- pull data to the local repository and merge with the working directory;
	- if you want you can merge without bubble by using git pull --rebase, the local changes will be replayed on top 

## Cookbook

- adding files:
	- `git add -N` express the intention to add file;
	- `git add -P` add interactively;

- checkout:
	- `git checkout -p` interactive checkout;

- `git rebase -x <command>` execute the command after each rebase;

- revisions:
	- different types of identifier for each revision: sha1, branch_name, symbolic_name(HEAD), HEAD@{yesterday}

- branch:
	- `git branch --merged [-r|--remote]` show a list of merged branches

- `git reflog` show a list of all local activities;

- configuration:
	- `git config --global user.email <value>` set the user email, this value is saved inside `~/.gitconfig`;
	- `git config --global user.name <value>` set the user name, this value is saved inside `~/.gitconfig`;
	- without the `--global` flag the values are saved inside the current repository configuration file `.git/config`;
	- `git config --global --add alias.st status`;
		- aliases can execute shell command;

- Change the remote URI;
```bash
git remote set-url <name> <uri>
```

- List the currente remotes;
```bash
git remote -v
```

- Remove files from stage area;
```bash
git rm --cached
```

## submodule

A submodule allows you to keep another Git repository in a subdirectory of your
repository. This can be used to include external dependencies.

### add

Add the given repository as a submodule at the given path. 

```bash
git submodule [--quiet] add [-b <branch>] [-f|--force] [--name <name>]
	      [--reference <repository>] [--depth <depth>] [--] <repository> [<path>]
```

The optional argument `<path>` is the relative location for the cloned
submodule. If `<path>` is not given, the "humanish" part of the source
repository is used. The `<path>` is also used as the submodule’s logical name
in its configuration entries unless `--name` is used to specify a logical name.

The optional argument `<branch>` set which remote branch the submodule should
track.  A special value of . is used to indicate that the name of the branch in
the submodule should be the same name as the current branch in the current
repository.

A new file named `.gitmodules` will be generated, this file contains the
mapping between the module's uri and the local directory;

- To clone a project with submoodule you can use this command:
```bash
git submodule init && git submodule update
# or
git clone --recursive <uri>
```
- Update the submodule with a new version;
```bash
# inside the submodule directory
git fetch && git merge
# or
git submodule update --remote
```

# Glossary

- The .git directory is where Git stores the metadata and object database for the project;

- The working directory is a single checkout of one version of the project, placed on disk to use or modify;

- The staging area, or index, is a file that stores information about what will go into your next commit
