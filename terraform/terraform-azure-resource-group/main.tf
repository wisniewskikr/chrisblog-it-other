provider "azurerm" {
    
    version = "~>2.58.0"
    features {}
}

variable "prefix" {
  default = "helloworld"
}

resource "azurerm_resource_group" "main" {
  name     = "${var.prefix}-resources"
  location = "East US"
}