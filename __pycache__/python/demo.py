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

sum1=int(0)
sum2=int(0)

number1=220  #int(input("enter the number1:"))

number2=284   #int(input("enter the number2:"))

for i in range(1,number1):
    if ( number1 % i == 0 ):
        sum1 = sum1 + i

for i in range(1,number2):
    if ( number2 % i == 0 ):
        sum2 = sum2 + i

print("sum1:",sum1," sum2:",sum2)

if ( sum2 == number1 and sum1 == number2 ):
    print(True)
else:
    print(False)