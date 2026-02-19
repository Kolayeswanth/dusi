def activity_6_count_digits():
    # Activity 6: count digits in a given number
    n = input("Enter a number: ").strip()
    if n.startswith("-"):
        n = n[1:]
    n = n.lstrip("0") or "0"
    print(f"The output is {len(n)} digits")


def activity_7_marks_frequency():
    # Activity 7: count frequency of marks for N students (N=30)
    counts = [0] * 101
    n = 30
    print("Enter 30 marks (0-100):")
    for i in range(n):
        while True:
            try:
                mark = int(input(f"Mark {i + 1}: "))
            except ValueError:
                print("Invalid input. Enter an integer 0-100.")
                continue
            if 0 <= mark <= 100:
                counts[mark] += 1
                break
            print("Out of range. Enter 0-100.")
    for mark, count in enumerate(counts):
        print(f"{mark}: {count}")


def activity_8_decimal_to_binary():
    # Activity 8: decimal to binary
    n = int(input("Enter a decimal integer: "))
    if n == 0:
        print("0")
        return
    sign = "-" if n < 0 else ""
    n = abs(n)
    bits = []
    while n > 0:
        bits.append(str(n % 2))
        n //= 2
    print(sign + "".join(reversed(bits)))


def activity_9_binary_to_decimal():
    # Activity 9: binary to decimal
    b = input("Enter a binary number: ").strip()
    if b.startswith("-"):
        sign = -1
        b = b[1:]
    else:
        sign = 1
    if not b or any(ch not in "01" for ch in b):
        print("Invalid binary input.")
        return
    value = 0
    for ch in b:
        value = value * 2 + (1 if ch == "1" else 0)
    print(sign * value)


def activity_10_smallest_divisor():
    # Activity 10: smallest exact divisor other than one
    n = int(input("Enter a number (>1): "))
    if n <= 1:
        print("No divisor other than 1 for numbers <= 1.")
        return
    divisor = None
    d = 2
    while d * d <= n:
        if n % d == 0:
            divisor = d
            break
        d += 1
    if divisor is None:
        print(f"{n} is prime; smallest divisor other than 1 is {n}.")
    else:
        print(f"Smallest divisor other than 1 is {divisor}.")


print("Activity 6")
activity_6_count_digits()
print("\nActivity 7")
activity_7_marks_frequency()
print("\nActivity 8")
activity_8_decimal_to_binary()
print("\nActivity 9")
activity_9_binary_to_decimal()
print("\nActivity 10")
activity_10_smallest_divisor()
