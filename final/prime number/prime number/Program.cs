
class Solution
{

    //static void findPrimeNumber2(int n)
    //{
    //    bool []visited = new bool[n];
    //    visited[0] = false;
    //    visited[1] = false;        

    //    for (int i = 2; i < n; i++)
    //    {
    //        if (!visited[i])
    //        {
    //            for (int j = 2; i * j < n; j++) {
    //                if(!visited[i * j])
    //                    visited[i * j] = true;
    //            }
    //        }
    //    }
    //    for (int i = 1; i < n; i++)
    //    {
    //        if (visited[i]==false)
    //        {
    //            Console.WriteLine(i + " ");
    //        }
    //    }

    //}


    //static void findPrimeNumber1(int n)
    //{
    //    Console.WriteLine("1 ");
    //    for (int i = 2; i < n; i++)
    //    {
    //        if(checkPrimeNumer(i)) Console.WriteLine(i+" ");
    //    }


    //}
    //static bool checkPrimeNumer(int a)
    //{
    //    for (int j = 2;  j*j <= a; j++)
    //    {
    //        if (a % j == 0) return false;             
    //    }
    //    return true;
    //}

    static void Main(string[] args)
    {
        int a = 10;
        Console.WriteLine("a={0}", a);
    }
}