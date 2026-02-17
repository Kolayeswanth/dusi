# Read file and filter lines
Get-Content "C:\Users\kolay\OneDrive\Desktop\dusi\power_shell\lecture1.ps1" | Where-Object { $_ -match "Write-Output" }

# Count words in file
Get-Content "C:\Users\kolay\OneDrive\Desktop\dusi\power_shell\lecture1.ps1" | Measure-Object -Word
