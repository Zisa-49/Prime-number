#include<stdio.h>
int main()
{
    int i,n,count=0;
    printf("Enter a positive integer:")
    scanf("%d",&n);

    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            count++;
            break;
        }
    }
    if(count=0)
        printf("%d is prime number:",n);
    else
        printf("%d is not prime number.",n);

    return 0;
}
