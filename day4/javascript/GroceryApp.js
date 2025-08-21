const prompt = require('prompt-sync')();
let list = []; 
function isAddItem(userInput){
	list.push(userInput);
	return 'Added Successfully';
}

function isRemoveItem(userInput){
	if(list.includes(userInput)){
	let index = list.indexOf(userInput);
	list.splice(index,1);
	return "Removed Successfully";}
	else{
	return "Not available in list";}
}

function isShowAvailableItem(){
	if(list.length >= 1){
		return list;}
	else{
		return "List Is empty";}
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
	else if("0" === userInput){
		console.log("Goodbye!");
		break;}

	else{
		console.log(isShowAvailableItem());}
}