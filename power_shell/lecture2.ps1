# pipelines

# List processes and select only Name + Id
Get-Process | Select-Object Name, Id

# Sort processes by CPU
Get-Process | Sort-Object CPU -Descending 

# Get top 5 processes by CPU
Get-Process | Sort-Object CPU -Descending | Select-Object -First 5

# Count Running processes
Get-Process | Where-Object { $_.Status -eq "Running" } | Measure-Object