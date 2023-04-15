int i, n, x = 0, k, b;
n = int.Parse(Console.ReadLine()!);
k = int.Parse(Console.ReadLine()!);
for (int i = 1; i < n - 1; i++)
{
    b = int.Parse(Console.ReadLine()!);
    while (b != 0)
    {
        x = b;
        b = k % b;
        k = x;
    }
    k = x;
}
Console.WriteLine(k);