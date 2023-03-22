USAGE
-----

> **NOTE** This usage assumes that user possesses **AWS EC2** with configured **Java**, **Maven**, **Docker** and **Docker Compose** there. User has to have **Github** and **Dockerhub** accounts too. It also assumes that following tools are installed on local computer: **Git**. 

Steps:
1. User creates new remote repository via Github portal `https://github.com/`
1. User creates new secrets via Github portal (**project -> Settings -> Secrets and Variables -> Actions -> New Repository Secret**):
     * **DOCKER_HUB_USERNAME**: username of Dockerhub
     * **DOCKER_HUB_ACCESS_TOKEN**: access token of Dockerhub
     * **SSH_URL**: public ip of EC2
     * **SSH_KEY**: Private Key of EC2
     * **SSH_USERNAME**: Username of EC2
     * **SSH_TARGET**: location where items from repository should be copied. In this case: **/home/ec2-user/app** (if you want to change it please update also file **github-actions.yml** - script part)
1. User clones remote repository to local computer
1. User copies current project to new cloned repository
1. User commits changes and pushed then to remote repository
1. User verifies application via `http://{ec2-public-ip}:8080`
1. User makes some change on remote repository - for instance update "message" in HelloWorldController
1. User commits changes and pushed then to remote repository
1. User again verifies application via `http://{ec2-public-ip}:8080`
1. Clean up
     * User removes new project from Github portal
     * User removes new project from Dockerhub portal
     * User removes cloned repository from local computer


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to use **Github Actions** for automatic deployment **Docker Compose** project on **AWS EC2** service using Docker Images from **Dockerhub**. Changes should be automatically deployed after every push to **main** branch in **Github** repository. This project displays **Hello World** message, **port** and **UUID** and consists of **Java** application with usage **Spring Boot** framework.

##### Terminology
Terminology explanation:
* **Github Actions**: it's is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline
* **Github**: it's remote storage system for code
* **Dockerhub**: it's remote storage system for Docker Images
* **Docker Compose**: it's tool for Docker orchestration - management of many Docker containers
* **AWS**: it's bunch of services provided by Amazon for cloud computing
* **AWS EC2**: it's service with Virtual Machine provided by Amazon
* **Java**: programming language
* **Spring Boot**: framework for Java

##### Flow
The following flow takes place in this project:
1. User creates remote repository using Githput portal
1. User configures SSH secrets
1. User copies current project to cloned repository
1. User commits and pushes changes
1. User verifies result
1. User makes some change in local repository, commits and pushes changes
1. User verifies resultf
1. User removes all changes

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Spring Boot** framework: `https://docs.google.com/document/d/1mvrJT5clbkr9yTj-AQ7YOXcqr2eHSEw2J8n9BMZIZKY/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)
* Installed **Git** (tested on version 2.33.0.windows.2). Tool details: `https://docs.google.com/document/d/1Iyxy5DYfsrEZK5fxZJnYy5a1saARxd5LyMEscJKSHn0/edit?usp=sharing`


##### Preconditions - Actions
* Created **AWS Account**
* Created **AWS EC2** with **Java Stack**: `https://github.com/wisniewskikr/chrisblog-it-aws/tree/main/ec2/aws-ec2-amazon-linux-create-userdata-javastack-create`
* Created **Github** account
* Created **Dockerhub** account with Access Token: `https://github.com/wisniewskikr/chrisblog-it-other/tree/main/dockerhub-access-token`
* **Download** source code using Git 
* Open any **Command Line** (for instance "Windonw PowerShell" on Windows OS) tool on **project's folder** (exact localization of project you can check in GIT repositories on page `https://github.com/wisniewskikr/java-chrisblog-it-cicd`)