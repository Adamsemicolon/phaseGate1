const prompt = require('prompt-sync')();
function isAddItem(userInput){
	let list = []; 
	list.push(userInput);
	return 'Added Successfully';
}

function isRemoveItem(userInput){
	let list = []; 
	list.pop(userInput);
	for(let counter = 0; counter < list.length;counter++){
	if(list[counter] != userInput){
	return "Not available in list";}
	else{
		return "Removed Successfully";}
}}

function isShowAvailableItem(){
	list = []
	if(list.length > 1){
		return list;}
	else{
		return "Is empty";}
}
while(true){
let menu = ["1. Add item" , "2. Remove item" , "3. Show all item", "Input 0 to exit"];
	console.log(menu);
	let userInput = prompt('select an option');
	if("1" === userInput){
		userInput = prompt('Add an item');
		console.log(isAddItem(userInput));}
	else if("2" === userInput){
		userInput = prompt('Remove an item');
		console.log(isRemoveItem(userInput));}
	else if("0" === userInput)return;

	else{
		console.log(isShowAvailableItem());}
}