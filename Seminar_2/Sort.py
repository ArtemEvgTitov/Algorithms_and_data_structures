from math import log
from random import randint
from datetime import datetime


def directSort(array):  # Сортировка выбором
    for i in range(len(array)):
        minIndex = i
        for j in range(i+1, len(array)):
            if array[j] < array[minIndex]:
                minIndex = j
        if minIndex != i:
            temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp


def insertSort(array):  # Сортировка вставками
    for i in range(1, len(array)):
        temp = array[i]
        j = i - 1
        while j >= 0 and temp < array[j]:
            array[j + 1] = array[j]
            j = j - 1
        array[j+1] = temp


def bubleSort(array):  # Пузырьковая сортировка
    for i in range(len(array)):
        for j in range(len(array) - 1):
            if array[j] > array[j + 1]:
                temp = array[j]
                array[j] = array[j+1]
                array[j+1] = temp


array1 = [randint(1, 100000) for i in range(9000)]
array2 = [randint(1, 100000) for i in range(9000)]
array3 = [randint(1, 100000) for i in range(9000)]

# start_time = datetime.now()
# directSort(array1)
# end_time = datetime.now()

# print(f"Сортировка выбором выполнена за {end_time - start_time}")

# start_time = datetime.now()
# insertSort(array2)
# end_time = datetime.now()

# print(f"Сортировка вставками выполнена за {end_time - start_time}")

# start_time = datetime.now()
# bubleSort(array3)
# end_time = datetime.now()

# print(f"Сортировка пузырьком выполнена за {end_time - start_time}")


array = [randint(1, 9) for i in range(5)]
insertSort(array)
print(array)

n = int(input("Какой элемент нужно найти? "))


def binarySearch(array, n):  # Бинарный поиск
    count = 0
    left = 0
    right = len(array) - 1
    flag = True
    mid = 0
    while left <= right and flag:
        mid = (right + left) // 2
        if n < array[mid]:
            right = mid - 1
        else:
            left = mid + 1
        count += 1
    if count > log(2, n):
        flag = False

    if not flag:
        print('No search')
    else:
        print(mid)


def binarySearch2(arr, n):
    left = 0
    right = len(arr) - 1
    mid = 0
    while left <= right:
        mid = (right + left) // 2
        if arr[mid] < n:
            left = mid + 1
        elif arr[mid] > n:
            right = mid - 1
        else:
            return mid
    return -1


binarySearch(array, n)
