function isScoreAndGrade(scoreOne,scoreTwo,scoreThree){
let average = (scoreOne + scoreTwo + scoreThree)/ 3;
if(average >= 90 && average <= 100)return 'A';
else if(average >= 80 && average < 90)return 'B';
else if(average >= 70 && average < 80)return 'C';
else if(average >= 60 && average < 70)return 'D';
else{
	return 'F';}
}

console.log(isScoreAndGrade(30,67,10));
