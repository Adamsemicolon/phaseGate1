def isLike(array):
	count = 0
	together = ""
	space = " "
	conjuct = 'and '
	add = 'like this'
	value = Number(0)
	gether = ""
	comma = ','
	second = ''
	other = ' others like this';
	spare = 0;
	for counter in range(0,len(array)):
		if count == 1:
			together += conjuct;
			together += array[counter];
			together += space;
		if value == 1:
			gether += comma;
		if value == 2:
			gether += conjuct;
			gether += array[counter];
		if value >= 1:
			gether += space;
			count++
			value++
		while(spare < 2):
			second += array[spare];
			second += comma;
			spare ++
	if count == 1:
		return together += add;
	elif count == 2:
		return together += add;
	elif value == 3:
		return gether += add;
	elif value > 3:
		value -= 2;
		conjuct += value;
		conjuct += other;
	return second += conjuct;
	else:
		return 'No one likes this'

list = ['Adam','emma','eloka','sun','fourty','musk']
print(isLike(list))