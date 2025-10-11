#include <stdio.h>
int main()
{
  int a=5,b=10,*p=&a,*q=&b,t;
  t=*p; 
  *p=*q; 
  *q=t;
  printf("After swap: a=%d b=%d\n",a,b);
}
