# Top 5 CPU consuming processes
Get-Process | Sort-Object CPU -Descending | Select-Object -First 5

# Restart all stopped services (demo only!)
Get-Service | Where-Object { $_.Status -eq "Stopped" } | Restart-Service

# Find large files recursively
Get-ChildItem C:\ -Recurse | Where-Object { $_.Length -gt 1GB }

# Export process list to CSV
Get-Process | Select-Object Name, Id, CPU | Export-Csv -Path "processes.csv" -NoTypeInformation

# Kill Notepad (example)    
Get-Process notepad | Stop-Process