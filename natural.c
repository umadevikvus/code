#include<stdio.h>
#include<conio.h>
void main()
{
    int i,num,sum=0;
    printf("enter the number:");
    scanf("%d",&num);
    for(i=1;i<=num;++i)
    {
        sum+=i;
        }
    printf("sum is %d",sum);
    getch();

}
