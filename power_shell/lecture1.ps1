#power shell commands

$name = "Irfan"
$age = 21
Write-Output $name
Write-Output $age

if($age -gt 18)
{
    Write-Output "You are an adult."
}
else
{
    Write-Output "You are a minor."
}