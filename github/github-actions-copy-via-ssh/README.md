USAGE
-----

> **NOTE** This usage assumes that user possesses **Remote Server** with configured **SSH** communication secured by **Private Key**. User has to have **Github Account** too. It also assumes that following tools are installed on local computer: **Git**. 

Steps:
1. User creates new remote repository via Github portal `https://github.com/`
1. User creates new secrets via Github portal (**project -> Settings -> Secrets and Variables -> Actions -> New Repository Secret**):
     * **SSH_URL**: URL of remote server
     * **SSH_KEY**: Private Key of remote server
     * **SSH_USERNAME**: Username of remote serve
     * **SSH_TARGET**: location where items from repository should be copied. **Attention!** Sometimes target can be only **user folder** but not **root folder** - it's connected with security
1. User clones remote repository to local computer
1. User creates folder **.github/workflows** in cloned repository and copies there file **github-actions.yml**
1. User commits changes and pushed then to remote repository
1. User verified if files **github-actions.yml** and **README.md** were copied to Remote Server
1. Clean up
     * User removes target folder from Remote Server
     * User removes secrets from Github portal
     * User removes new project from Github portal
     * User removes cloned repository from local computer


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create **Github Actions** for coping **Github repository** to **Remote Server** via **SSH**. 

##### Terminology
Terminology explanation:
* **Github Actions**: it's is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline
* **Github repository**: it's remote storage system
* **Remote Server**: it's remote computer with RAM, Disc etc.
* **SSH**: it is a network communication protocol that enables two computers to communicate

##### Flow
The following flow takes place in this project:
1. User creates remote repository using Githput portal
1. User configures SSH secrets
1. User clones remote repository and configures Github Actions in *.yml file
1. User commits and pushes changes
1. User verifies result
1. User removes all changes

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Git**: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Git** (tested on 2.33.0.windows.2)


##### Preconditions - Actions
* Created **Github Account**
* Created **Remote Server** - for instance AWS EC2