#print in same line

for i in range(1,10):
    print(10-i,end=" ") # 9 8 7 6 5 4 3 2 1
print()
print( 'a', 'b', 'c', sep='-', end = '$')
print()
for i in range(1,10):
    print(i+i-1,end=" ") # 1 3 5 7 9 11 13 15 17
print()


#amicable number (the sum of divisor of A is equal to B and the sum of divisor of B is equal to A)


number1=220  #int(input("enter the number1:"))

number2=284   #int(input("enter the number2:"))

def sum(num):
    sum=int(0)
    for i in range(1,num):
        if ( num % i == 0 ):
            sum = sum + i
    return sum

sum1=int(sum(number1))
sum2=int(sum(number2))

print("sum1:",sum1," sum2:",sum2)

if ( sum2 == number1 and sum1 == number2 ):
    print(True)
else:
    print(False)