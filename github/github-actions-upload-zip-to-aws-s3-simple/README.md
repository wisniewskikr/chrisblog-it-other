USAGE
-----

> **NOTE** This usage assumes that user possesses **AWS Account** and AWS user with permissions to service **AWS S3**. User has to have **Github Account** too. It also assumes that following tools are installed on local computer: **Git**. 

Steps:
1. User creates new remote repository via Github portal `https://github.com/`
1. User creates new secrets via Github portal (**project -> Settings -> Secrets and Variables -> Actions -> New Repository Secret**):
     * **AWS_S3_BUCKET**
     * **AWS_ACCESS_KEY_ID**
     * **AWS_SECRET_ACCESS_KEY**
1. User clones remote repository to local computer
1. User creates folder **.github/workflows** in cloned repository and copies there file **github-actions.yml**
1. User commits changes and pushed then to remote repository
1. User verified if zip file was pushed to AWS S3
1. Clean up
     * User removes zip file from AWS S3
     * User removes secrets from Github portal
     * User removes new project from Github portal
     * User removes cloned repository from local computer


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create **Github Actions** for zipping and coping **Github repository** to **AWS S3**. 

##### Terminology
Terminology explanation:
* **Github Actions**: it's is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline
* **Github repository**: it's remote storage system
* **AWS S3**: cloud service provided by AWs for storing files

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
* Created **AWS Account**