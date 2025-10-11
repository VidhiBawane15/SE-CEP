#include <stdio.h>
struct Account 
{ 
  int acc; 
  float bal; 
};
int main()
{
  struct Account a={101,5000};
  FILE *f=fopen("acc.txt","w"); 
  fwrite(&a,sizeof(a),1,f);   
  fclose(f);
  printf("Deposit successful for Acc No: %d\n",a.acc);
}
