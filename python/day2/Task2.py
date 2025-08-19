def isScoreAndGrade(scoreOne, scoreTwo, scoreThree):
	average = (scoreOne + scoreTwo + scoreThree)// 3
	if average >= 90 and average < 100:
		return 'A'
	elif average >= 80 and average < 90:
		return 'B'
	elif average >= 70 and average < 80:
		return 'C'
	elif average >= 60 and average < 70:
		return 'D'
	else:
		return 'F'


print(isScoreAndGrade(10,20,90))