# Only service names
Get-Service | Select-Object -ExpandProperty Name

# Just process IDs
Get-Process | Select-Object -ExpandProperty Id
