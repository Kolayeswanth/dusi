#power shell commands

$name = "Irfan"
$age = 21
Write-Output $name
Write-Output $age

# if statement
if($age -gt 18)
{
    Write-Output "You are an adult."
}
else
{
    Write-Output "You are a minor."
}

# while loop
$count = 1
while($count -le 5) 
{
    Write-Output "Count: $count"
    $count++
}

# for loop
for($i = 1; $i -le 5; $i++)
{
    Write-Output "Iteration: $i"
}

#foreach loop
$names = "Alice", "Bob", "Charlie"
foreach($n in $names)
{
    Write-Output "Name: $n"
}

Get-Process | Select-Object Name, Id, CPU