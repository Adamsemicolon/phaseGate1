def isAddItem(userInput):
	list = []
	list.append(userInput);
	return "Added Successfully"

def isRemoveItem(userInput):
	list = []
	list.remove(userInput)
	if groceryList.contains(userInput):
		return "Not available in list"
	else:
		return "Removed Successfully"

def isShowAvailableItem():
	if len(list) < 1:
		return "Is empty"
	else:
		return list

while(True):
	menu = """
		1. Add item
		2. Remove item
		3. Show all item
		
		Input 0 to exit
		"""
	print(menu);
	userInput = str(input())
	if userInput == 1:
		userInput = str(input('Add an item'))
		print(isAddItem(userInput))
	elif userInput == 2:
		userInput = str(input('Remove an item'))
		print(isRemoveItem(userInput))
	elif 0 == userInput :
		break
	else:
		print(isShowAvailableItem())




