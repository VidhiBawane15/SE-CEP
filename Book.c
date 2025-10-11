#include <stdio.h>
struct Book { int id; char name[20]; };
int main(){
  struct Book b={1,"C_Programming"};
  FILE *f=fopen("book.txt","w");
  fwrite(&b,sizeof(b),1,f); fclose(f);
  f=fopen("book.txt","r");
  fread(&b,sizeof(b),1,f);
  printf("Book: %d %s\n",b.id,b.name);
  fclose(f);
}
