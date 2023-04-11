import datetime

def fibonacci(n):
    if n in (1, 2):
        return 1
    return fibonacci(n-1) + fibonacci(n -2)

start_time = datetime.datetime.now()
print(fibonacci(40))
end_time = datetime.datetime.now()
print(end_time - start_time)

print("---------------------------------------")

start_time = datetime.datetime.now()

fib1, fib2 = 0, 1
n = 40
for i in range(n):
    x = fib1 + fib2
    fib1 = fib2
    fib2 = x
print(fib1)

end_time = datetime.datetime.now()
print(end_time - start_time)
