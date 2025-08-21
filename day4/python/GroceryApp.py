grocery_list = []

def isAddItem(user_input):
    grocery_list.append(user_input)
    return "Added Successfully"

def isRemoveItem(user_input):
    if user_input in grocery_list:
        grocery_list.remove(user_input)
        return "Removed Successfully"
    else:
        return "Not available in list"

def isShowAvailableItem():
    if len(grocery_list) < 1:
        return "List is empty"
    else:
        return grocery_list

while True:
    menu = """
    1. Add item
    2. Remove item
    3. Show all items
    
	Input 0 to exit
    """
    print(menu)
    user_input = input()

    if user_input == '1':
        item = input("Add an item ")
        print(isAddItem(item))
    elif user_input == '2':
        item = input("Remove an item ")
        print(isRemoveItem(item))
    elif user_input == '0':
        print("Goodbye!")
        break
    else:
        print(isShowAvailableItem())