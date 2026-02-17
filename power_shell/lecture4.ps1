# Pipelins in PowerShell
# SELECT + FORMAT

# Custom Colomns
Get-Process | Select-Object Name, Id, CPU

# Table Format
Get-Process | Format-Table Name, Id, CPU