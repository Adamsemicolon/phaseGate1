function isLike(array){
	let count = Number(0);
	let together = "";
	let space = " ";
	let conjuct = 'and '
	let add = 'like this';
	let value = Number(0);
	let gether = "";
	let comma = ',';
	let second = '';
	let other = ' others like this';
	let spare = Number(0);
		for(let counter = 0; counter < array.length;counter++){
		if(count === 1)together += conjuct;
		together += array[counter];
		together += space;
		if(value === 1)gether += comma;
		if(value === 2)gether += conjuct;
		gether += array[counter];
		if(value >= 1)gether += space;
			count++;
			value++;
		while(spare < 2){
		second += array[spare];
		second += comma;
		spare ++;}
	}
	if(count === 1)return together += add;
	else if(count === 2)return together += add;
	else if(value === 3)return gether += add;
	else if(value > 3){
		value -= 2;
		conjuct += value;
		conjuct += other;
	return second += conjuct;}
	else{
		return 'No one likes this'}
}

let list = ['Adam','emma','eloka','sun','fourty','musk'];
console.log(isLike(list));