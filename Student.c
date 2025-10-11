#include <stdio.h>
struct Student { char name[20]; int marks; };
int main() {
  struct Student s[3];
  for(int i=0;i<3;i++){ printf("Name & Marks: "); scanf("%s%d",s[i].name,&s[i].marks); }
  for(int i=0;i<3;i++) printf("%s got %d marks\n",s[i].name,s[i].marks);
}
