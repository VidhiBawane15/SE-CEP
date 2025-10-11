#include <stdio.h>
int fact(int n)
{ 
  return n<=1?1:n*fact(n-1); 
}
int fib(int n)
{ 
return n<=1?n:fib(n-1)+fib(n-2); 
}
int sum(int n)
{ 
return n==0?0:n%10+sum(n/10); 
}
int main()
{ 
printf("Fact=%d Fib=%d Sum=%d",fact(5),fib(5),sum(123)); 
}
