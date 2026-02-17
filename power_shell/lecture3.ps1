# pipelines in power shell
# pipelines allow you to chain commands together, passing the output of one command as input to the next command. This is a powerful feature that allows you to perform complex operations in a simple and efficient way.

# Only running services
Get-Service | Where-Object { $_.Status -eq "Running" }

# Processes using more than 100 MB of memory
Get-Process | Where-Object { $_.WorkingSet -gt 100MB }

# Files larger than 1 GB in the C:\ drive
Get-ChildItem C:\ -Recurse | Where-Object { $_.Length -gt 1GB }

