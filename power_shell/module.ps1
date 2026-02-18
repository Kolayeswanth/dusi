# Importing module
Import-Module -Name .\module\module.ps1
# Using functions from the module
$name = Get-MyName
$age = Get-MyAge
Write-Output $name
Write-Output $age