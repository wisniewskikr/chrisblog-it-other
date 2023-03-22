USAGE
-----

> **NOTE** This usage assumes that user possesses **Github** and **Docker Hub** accounts. It also assumes that following tools are installed on local computer: **Git**. 

Steps:
1. User creates new remote repository via Github portal `https://github.com/`
1. User creates new secrets via Github portal (**project -> Settings -> Secrets and Variables -> Actions -> New Repository Secret**):
     * **DOCKER_HUB_USERNAME**: Docker Hub username
     * **DOCKER_HUB_ACCESS_TOKEN**: Docker Hub access token
1. User clones remote repository to local computer
1. User copies current project to new cloned repository
1. User updates variable **tag** in file **.github/workflows/github-actions.yml**
1. User commits changes and pushed then to remote repository
1. User verifies published Docker Image via Docker Hub portal `https://hub.docker.com/`
1. Clean up
     * User removes new project from Github portal
     * User removes cloned repository from local computer
     * User removes new Docker Image from Docker Hub portal


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to use **Github Actions** for automatic **build** and **push** Docker Images to **Docker Hub**. Changes should be automatically deployed after every push to **main** branch in **Github** repository. This example project is **simple** application that displays **Hello World** message, **port** and **UUID**. It's **Java** application with usage **Spring Boot** framework.

##### Terminology
Terminology explanation:
* **Github Actions**: it's is a continuous integration and continuous delivery (CI/CD) platform that allows you to automate your build, test, and deployment pipeline
* **Github repository**: it's remote storage system
* **Docker Hub**: it's repository for Docker Images
* **Docker**: it's platform for providing applications as Docker Containers based on some Docker Images
* **Java**: programming language
* **Spring Boot**: framework for Java

##### Flow
The following flow takes place in this project:
1. User creates remote repository using Github portal
1. User configures Docker Hub secrets in Github portal
1. User updates "tags" in *.yml file
1. User copies current project to cloned repository
1. User commits and pushes changes
1. User verifies result
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
* Created **Docker Hub Account**
* Generated **Docker Hub Access Token**
* Created **Github Account**
* **Download** source code using Git 
* Open any **Command Line** (for instance "Windonw PowerShell" on Windows OS) tool on **project's folder** (exact localization of project you can check in GIT repositories on page `https://github.com/wisniewskikr/java-chrisblog-it-cicd`)