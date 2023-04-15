int i, k1, k2, s, ans, j;
int[] b = { 5, 1, 2, 2, 3, 3, 3, 2, 2 };
int[] a = new int { b.Length };
k1 = 0;
ans = 0;
k2 = b.Length;
while (k1 != k2)
{
    for (i = 0; i < k2; i++)
        a[i] = b[i];
    k1 = k2;
    i = 0;
    s = 1;
    k2 = 0;
    while (i < k1 - 1)
    {
        if (a[i] == a[i + 1])
            s++;
        else
        {
            if (s > 2)
                ans += s;
            else
            {
                for (j = 0; j < s; j++)
                {
                    b[k2] = a[i];
                    k2++;
                }
            }
            s = 1;
        }
        i++;
    }
    if (s < 3)
    {
        for (int j = 0; j < s; j++)
        {
            b[k2] = a[i];
            k2++;
        }
    }
    else
        ans += s;
}
Console.WriteLine(ans);