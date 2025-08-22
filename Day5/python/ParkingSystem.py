Array = [] 

def isValuesGiven():
	value = 0;
	for counter in len(array):
		Array[value] = counter;
		value+=1

def isGiveParkingSpace(userInput):
		if Array[userInput] < 1:
			Array[userInput] == 1
			return 'Car parked successfully and you are parked at spot ' + userInput
		elif Array[userInput] > 0:
			return 'Choose another spot, the spot is currently obtained '
		else:
			return 'Parking space filled up'

def isRemoveCarSlot(userInput):
	if Array[userInput] == 1:
		Array[userInput] = 0
		return 'Customer left with car and space freed up'
	else:
		return 'You have no car parked here, malo'



while(True):
	display = """
		1. Park your car
		2. Take your car out of parking lot

			input 0 to exit
		"""
	print(display)
	userInput = int(input())
	if 1 == userInput:
		print('Choose a spot from 0 to 19')
		userInput = int(input())
		print(isGiveParkingSpace(userInput))
	elif 2 == userInput:
		print('Input yout car spot number')
		userInput = int(input())
		print(isRemoveCarSlot(userInput))
	else:
		print('GoodBye')
		break
