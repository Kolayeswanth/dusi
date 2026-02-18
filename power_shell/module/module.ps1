# creating a module 
function Get-MyName {
    return "My name is PowerShell"
}
function Get-MyAge {
    return 5
}

Export-ModuleMember -Function Get-MyName, Get-MyAge