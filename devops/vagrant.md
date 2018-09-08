# Vagrant

> Vagrant is a tool for building complete development environments, sandboxed
> in a virtual machine.

Vagrant is a Swiss Army knife for development environments. It does everything
you need to create and manage development environments inside virtual machines. 
It helps enforce good practices by encouraging the use of automation and an
environment that more closely resembles production.

There are various ways to achieve what Vagrant does using other technologies.
ou could directly use the virtualization solution of your choice (VirtualBox)
r use a partial virtualization solution like **containers**.

## Up and running

You can get started by simply running the following two commands.

```bash
vagrant init precise64 http://files.vagrantup.com/precise64.box
vagrant up
```

After these commands finish running, you will have a fully featured Ubuntu 12.04
LTS virtual machine running in the background. Now you can access this virtual
machine with ssh by simply running `vagrant ssh`.

When you have finished with this virtual machine you can run `vagrant destroy`
and delete any resources.

## Vagrantfile

> The Vagrantfile is a simple text file that Vagrant reads in order to
> determine what need to be done to create your working environment.

The Vagrant configuration file is written in Ruby but can be easily modified
without any knowledge of the language. A very basic Vagrantfile looks like the
following:

```ruby
Vagrant::Config.run do |config|
	config.vm.box = "precise64"
	config.vm.share_folder "v-root", "/vagrant", "."
	config.vm.provision "shell" do |s|
	s.path = "script.sh"
	end
end
```
