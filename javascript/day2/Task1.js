function isTwiceOfAge(fatherAge, sonAge){
	let son = fatherAge - (sonAge * 2);
	return son;
}


let fatherAge = 50;
let sonAge = 10;
console.log(isTwiceOfAge(fatherAge, sonAge));