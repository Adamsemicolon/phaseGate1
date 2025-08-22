let Array = [];
const prompt = require('prompt-sync')();
while(true){
let display = ['1. Park your car', '2. Take your car out of parking lot', 'input 0 to exit'];
//console.log(isValuesGiven());
console.log(display);
let userInput = prompt('');
if(userInput == 1){
	console.log("Choose a spot from 0 to 19");
	userInput = prompt('');
	console.log(isGiveParkingSpace(userInput));}
else if(2 == userInput){
	console.log("Input yout car spot number");
	userInput = prompt('')
	console.log(isRemoveCarSlot(userInput));}
else if(0 == userInput){
		console.log("GoodBye");
		break;}
}
function isValuesGiven(){
for(let counter = 0,value = 0;value < Array.length;value++){
	Array[value] = counter;
}
}

function isGiveParkingSpace(userInput){
	if(Array[userInput] < 1){
		Array[userInput] == 1;
	return "Car parked successfully and you are parked at spot " + userInput;}
	else if(Array[userInput] > 0){
		return "Choose another spot, the spot is currently obtained ";}
	else{
				return "Parking space filled up";}
	}

function isRemoveCarSlot(userInput){
	if(Array[userInput] === 1){
		Array[userInput] = 0;
		return "Customer left with car and space freed up";}
	else{
		return "You have no car parked here, malo";}
}