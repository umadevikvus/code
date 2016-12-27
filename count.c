#include<stdio.h>
#include<conio.h>
void main()
{
    int num,i=0;
    printf("enter the integer:");
    scanf("%d",&num);
    while(num!=0)
 {
     num=num/10;
    ++i;
}
printf("count is %d",i);
}
