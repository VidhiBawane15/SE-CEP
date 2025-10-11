#include <stdio.h>
#include <string.h>
int main(){
  char s[50]; printf("Enter string: "); gets(s);
  printf("Reverse: "); 
  for(int i=strlen(s)-1;i>=0;i--) 
  printf("%c",s[i]);
  printf("\nPalindrome: %s\n", strcmp(s,strrev(s))==0?"Yes":"No");
}
