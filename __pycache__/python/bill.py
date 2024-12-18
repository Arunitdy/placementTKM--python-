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