#amicable number (the sum of divisor of A is equal to B and the sum of divisor of B is equal to A)

number1=220  #int(input("enter the number1:"))

number2=284   #int(input("enter the number2:"))

def sum(num):
    sum=int(0)
    for i in range(1,num):
        if ( num % i == 0 ):
            sum = sum + i
            
    #print("sum:",sum)
    return sum

sum1=int(sum(number1))
sum2=int(sum(number2)) 

print(True) if (sum2 == number1 and sum1 == number2) else print(False)

# first  5 amicable number

a = 2  # Start checking from 2 (smallest possible amicable candidate)

print("First 5 Amicable Numbers:")
while True:
    b = sum(a)  
    if b != a and sum(b) == a:  # Check if 'a' and 'b' are amicable
        print(f"({a}, {b})")
    a += 1
