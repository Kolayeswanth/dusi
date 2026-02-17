# Pipeline with ForEach
Get-Service | ForEach-Object {
   $_.Name
}

# Create folders using pipeline
"Folder1", "Folder2", "Folder3" | ForEach-Object {
    New-Item -Path "C:\Temp\$_" -ItemType Directory
}