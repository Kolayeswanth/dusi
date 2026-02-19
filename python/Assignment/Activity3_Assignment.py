def activity_1_sum_array():
    # Activity 1: sum of 10 integers
    nums = []
    print("Enter 10 integers:")
    for i in range(10):
        nums.append(int(input(f"Value {i + 1}: ")))
    print(f"Sum = {sum(nums)}")


def activity_2_max_min_three():
    # Activity 2: max 3 and min 3 from 20 integers (no sorting)
    nums = []
    print("Enter 20 integers:")
    for i in range(20):
        nums.append(int(input(f"Value {i + 1}: ")))
    max1 = max2 = max3 = float("-inf")
    min1 = min2 = min3 = float("inf")
    for n in nums:
        if n > max1:
            max1, max2, max3 = n, max1, max2
        elif n > max2:
            max2, max3 = n, max2
        elif n > max3:
            max3 = n
        if n < min1:
            min1, min2, min3 = n, min1, min2
        elif n < min2:
            min2, min3 = n, min2
        elif n < min3:
            min3 = n
    print(f"Max 3: {max1}, {max2}, {max3}")
    print(f"Min 3: {min1}, {min2}, {min3}")


def activity_3_reverse_array():
    # Activity 3: reverse 10 integers
    nums = []
    print("Enter 10 integers:")
    for i in range(10):
        nums.append(int(input(f"Value {i + 1}: ")))
    nums.reverse()
    print("Reversed array:")
    print(nums)


def activity_4_marks_frequency():
    # Activity 4: count frequency of marks for N students (N=30)
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


def activity_5_marks_ranges():
    # Activity 5: counts in ranges 0-10, 11-20, ..., 91-100
    ranges = [(0, 10), (11, 20), (21, 30), (31, 40), (41, 50),
              (51, 60), (61, 70), (71, 80), (81, 90), (91, 100)]
    counts = [0] * len(ranges)
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
                break
            print("Out of range. Enter 0-100.")
        for idx, (low, high) in enumerate(ranges):
            if low <= mark <= high:
                counts[idx] += 1
                break
    for (low, high), count in zip(ranges, counts):
        print(f"{low}-{high}: {count}")


def activity_6_factorial():
    # Activity 6: factorial of N
    n = int(input("Enter N: "))
    if n < 0:
        print("Factorial is not defined for negative numbers.")
        return
    result = 1
    for i in range(2, n + 1):
        result *= i
    print(f"Factorial of {n} is {result}")


def activity_7_average():
    # Activity 7: average of 10 integers
    nums = []
    print("Enter 10 integers:")
    for i in range(10):
        nums.append(int(input(f"Value {i + 1}: ")))
    avg = sum(nums) / 10
    print(f"Average = {avg}")


def activity_8_train_length():
    # Activity 8: length of train from speed and time
    x = float(input("Enter speed (km/hr): "))
    y = float(input("Enter time to cross pole (seconds): "))
    if x <= 0 or y <= 0:
        print("Values must be positive and non-zero.")
        return
    speed_mps = x * 1000 / 3600
    length = speed_mps * y
    print(f"Length of train = {length} meters")


def activity_9_train_speed():
    # Activity 9: train speed when passing man running 5 km/hr
    x = float(input("Enter train length X (meters): "))
    y = float(input("Enter time Y (seconds): "))
    if x <= 0 or y <= 0:
        print("Values must be positive and non-zero.")
        return
    relative_speed_mps = x / y
    relative_speed_kmph = relative_speed_mps * 3600 / 1000
    train_speed = relative_speed_kmph + 5
    print(f"Speed of train = {train_speed} km/hr")


def activity_10_train_cross_time():
    # Activity 10: time for slower train to pass driver of faster train
    x = float(input("Enter speed of train X (km/hr): "))
    y = float(input("Enter speed of train Y (km/hr): "))
    if x <= 0 or y <= 0:
        print("Values must be positive and non-zero.")
        return
    faster = max(x, y)
    slower = min(x, y)
    relative_speed_mps = (faster + slower) * 1000 / 3600
    distance = 500  # length of slower train to clear driver
    time_seconds = distance / relative_speed_mps
    print(f"Time taken = {time_seconds} seconds")


print("Activity 1")
activity_1_sum_array()
print("\nActivity 2")
activity_2_max_min_three()
print("\nActivity 3")
activity_3_reverse_array()
print("\nActivity 4")
activity_4_marks_frequency()
print("\nActivity 5")
activity_5_marks_ranges()
print("\nActivity 6")
activity_6_factorial()
print("\nActivity 7")
activity_7_average()
print("\nActivity 8")
activity_8_train_length()
print("\nActivity 9")
activity_9_train_speed()
print("\nActivity 10")
activity_10_train_cross_time()