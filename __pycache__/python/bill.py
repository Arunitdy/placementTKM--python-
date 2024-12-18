#calculate the total price 
product=["Rice", "Dal", "Salt", "Suger", "oil"]
price=[63, 57, 25, 42, 125]
cart=[2.5, 0, 1, 1.6, 0.5]
#print(len(price))

def billing(product,price,cart):          
    bill=int(0)
    for i in range (len(price)):
        bill += price[i] * cart[i]
        print(product[i],":",price[i] * cart[i])
    return bill

print("bill:", billing( product, price, cart ))

#proper way
def bill2(product, price, cart):
    bill=[]
    for i in range(len(product)):
        bill.append(price[i] * cart[i])
    print(bill)
    return bill

print("total price:",sum(bill2(product, price, cart)))

#single line

bill=[price[i] * cart[i] for i in range(len(product))]
print(bill)

#to generate a sequense of number 1 to 10

a=list(range(1,11)) 

print("a:", a)

b=[n ** 2 for n in a]
print("b:",b)

#map in python

c=list(map(lambda n:n ** 2 ,a))

print("c", c)

#random
import random
nums=[random.randint(1,10) for i in range(0,10)]
print("nums:",nums)

#filter of even 
b=[num for num in nums if num % 2!=0]
print("odd:",b)

# or 

c=list(filter(lambda n:n % 2!= 0,nums))

print("odd c:",c)