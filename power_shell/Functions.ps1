# functions in Powershell

# 1.Basic Function

function SayHello {
    Write-Output "Hello From Powershell!"
    
}

SayHello

# 2.Function with Parameters
function Greet {
    param($name,$age)
    Write-Output "Hello, $name! You are $age years old."
}   

Greet -name "Irfan" -age 25

# 3.TypeCasting in Functions
function add{
    param(
        [int]$num1,
        [int]$num2
    )
    return $num1 + $num2
}
$result = add -num1 5 -num2 10
Write-Output "The sum is: $result"

# 4.Try Catch in Functions
function Divide {
    param(
        [int]$numerator,
        [int]$denominator
    )
    try {
        if($denominator -eq 0) {
            throw "Denominator cannot be zero."
        }
        return $numerator / $denominator
    }
    catch {
        Write-Output "Error: $_"
    }
}
$result = Divide -numerator 10 -denominator 0
Write-Output "Result: $result"