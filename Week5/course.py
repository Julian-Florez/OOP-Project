# -*- coding: utf-8 -*-
"""
@author: AEROJASH
"""

import numpy as np

# Constants
MAX_STUDENTS = 30

# Global variables to store course data
num_students = 0
names = []
surnames = []
dnis = []
grades = np.zeros((MAX_STUDENTS, 10), dtype=float)

def add_student(name, surname, dni, student_grades):
    """
    Add a new student to the course.

    Parameters:
    - name (str): The first name of the student.
    - surname (str): The last name of the student.
    - dni (str): The DNI (National Identity Document) of the student.
    - student_grades (list of float): List of grades for the student (up to 10 grades).

    Returns:
    - None
    """
    global num_students, names, surnames, dnis, grades
    if num_students < MAX_STUDENTS:
        names.append(name)
        surnames.append(surname)
        dnis.append(dni)
        grades[num_students, :] = student_grades
        num_students += 1
        print(f"Student {name} {surname} added successfully!")
    else:
        print("Maximum number of students reached!")

def get_course_list():
    """
    Get a list of all students in the course.

    Returns:
    - list of str: List containing the names and surnames of all students in the course.
    """
    return [f"{surnames[i]}, {names[i]}" for i in range(num_students)]

def calculate_course_average():
    """
    Calculate the average grade of the entire course.

    Returns:
    - float: The average grade of the course.
    """
    return np.mean(grades[:num_students])

def calculate_student_average(student_index):
    """
    Calculate the average grade of a specific student.

    Parameters:
    - student_index (int): Index of the student in the course.

    Returns:
    - float: The average grade of the student.
    """
    return np.mean(grades[student_index, :])

def get_student_with_highest_grade():
    """
    Get the name of the student with the highest overall grade in the course.

    Returns:
    - str: The name and surname of the student with the highest grade.
    """
    max_grade_index = np.argmax(np.sum(grades[:num_students], axis=1))
    return f"{names[max_grade_index]} {surnames[max_grade_index]}"

def get_student_with_lowest_grade():
    """
    Get the name of the student with the lowest overall grade in the course.

    Returns:
    - str: The name and surname of the student with the lowest grade.
    """
    min_grade_index = np.argmin(np.sum(grades[:num_students], axis=1))
    return f"{names[min_grade_index]} {surnames[min_grade_index]}"

# Example usage:
add_student("John", "Doe", "123456789", [80, 85, 90, 75, 95, 88, 92, 87, 84, 89])
add_student("Jane", "Smith", "987654321", [70, 75, 80, 65, 85, 78, 82, 77, 74, 79])

print("Course List:", get_course_list())
print("Course Average Grade:", calculate_course_average())
print("Average Grade for John Doe:", calculate_student_average(0))
print("Student with Highest Grade:", get_student_with_highest_grade())
print("Student with Lowest Grade:", get_student_with_lowest_grade())
