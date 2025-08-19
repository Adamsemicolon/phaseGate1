import unittest
import Task1

class TestingTask1(unittest.TestCase):
	def test_that_code_works(self):
	 	result = Task1.task_1(50, 10)
		self.assertEqual(result, 30)
	def test_that_code_works_for_zero(self):
		result = Task1.task_1(24,12)
		self.assertEqual(result, 0)
	def test_that_code_works_for_negative(self):
	 	result = Task1.task_1(23, 12)
		self.assertEqual(result, -1)