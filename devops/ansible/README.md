# Ansible

## What is it good for?

Ansible as a **configuration management** tool can be used to describe and enforce the state for our machines: the right
packages are installed, configuration files contain the expected values and have the expected permissions, the right services
are running, and so on.

Ansible as a **deployment** tool can generate binaries or static assets, copy the required files to the servers and then
starting up the services.

Ansible as a tool for **orchestration** of deployment can perform actions on multiple servers and enforce a specific order
between these actions.

Ansible as a tool for **provisioning** new servers can interact with different cloud providers (EC2, Azure, Digital Ocean,
Google Compute Engine, Linode, and ackspace) to spin up new virtual machines.

## Installation

You can install Ansible using your system package manager, or by using pip:

```
# Ubuntu
sudo apt install ansible
```

```
# OSX
brew install ansible
```

```
# pip
sudo pip install ansible
```

## Getting Started

### Vagrant

You need to have SSH access and root privileges on a Linux server to follow along with the examples. You can use Vagrant to
boot a Linux virtual machine inside your laptop, and you can use that as a test server.

```bash
mkdir playbooks
cd playbooks
vagrant init ubuntu/trusty64
vagrant up
```

Ansible needs to connect to the virtual machine by using the regular SSH client. Tell Vagrant to output the SSH connection
details by typing the following command: `vagran ssh-config`. Confirm that you can start an SSH session from the command line
by using the information from the previous command.

```bash
ssh vagrant@127.0.0.1 -p 2222 -i /path/to/private/key/used/by/vagrant
```
