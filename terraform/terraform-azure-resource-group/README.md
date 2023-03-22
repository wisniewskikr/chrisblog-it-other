USAGE
-----

> **NOTE** This usage assumes that you have **Azure Account**. It also assums that following tools are installed on your PC: **Azure Cli** and **Terraform**.

Steps:
1. Login to Azure with `az login`
1. Init Terraform with `terraform init`
1. Check Terraform configuration with `terraform plan`
1. Run Terraform configuration with `terraform apply`
1. Delete Terraform configuration with `terraform destroy`


DESCRIPTION
-----------

##### Goal
The goal of this project is to present how to create **Azure Resource Group** using **Terraform**. All configuration is defined in file **main.tf**.

##### Terminology
Terminology explanation:
* **Azure Resource Group**: service which groups resources in Azure Cloud Platrofm
* **Terraform**: it's a tool for creating and managing Cloud infrastructure.

##### Flow
The following flow takes place in this project:
1. User logs in to Azure
1. User installs Azure Resource Group configured in file **main.tf** using Terraform
1. User destroys Azure Resource Group configured in file **main.tf** using Terraform

##### Launch
To launch this application please make sure that the **Preconditions** are met and then follow instructions from **Usage** section.

##### Technologies
This project uses following technologies:
* **Azure**: `https://docs.google.com/document/d/1HaL4gve9FyrSS2Zi7NrhHN4Y2siD_sXJugnOuGhjhCc/edit?usp=sharing`
* **Terraform**: `https://docs.google.com/document/d/1GdF9nnI4GWZce6d_8K7Xl5Ffi4VGgSxTEDV-BCjQRk4/edit?usp=sharing`


PRECONDITIONS
-------------

##### Preconditions - Tools
* Installed **Operating System** (tested on Windows 10)

##### Preconditions - Actions
* Installed **Azure Cli**
* Installed **Terraform**