menu ={}
with open("menu.txt") as file:
    for line in file:
        name,price=line.strip().split(",")
        menu[name]=price
print(menu)
