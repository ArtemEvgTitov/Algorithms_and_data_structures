# Реализовать алгоритм пирамидальной сортировки (сортировка кучей).


def stack(array, i, size):
    left = (2 * i + 1)
    right = (2 * i + 2)
    largest = i
    if left < size and array[left] > array[i]:
        largest = left
    if right < size and array[right] > array[largest]:
        largest = right
    if largest != i:
        temp = array[i]
        array[i] = array[largest]
        array[largest] = temp
        stack(array, largest, size)


def delete(array, size):
    if size <= 0:
        return -1
    top = array[0]
    array[0] = array[size - 1]
    stack(array, 0, size - 1)
    return top


def heapsort(array):
    n = len(array)
    i = int((n - 2) / 2)
    while i >= 0:
        stack(array, i, n)
        i -= 1
    while n > 0:
        array[n - 1] = delete(array, n)
        n -= 1


array = [8, 6, -7, -4, 6, -1, 3, 3, 4, -2, 1, 3]
heapsort(array)
print(array)
