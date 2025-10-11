class parent
{
    String name;
    int age;
    public void info(String n, int a)
    {
        name=n;
        age=a;
    }
  public void display()
  {
    System.out.println("this is the parent class\nhere name and age is given\n\n");
  }
}

class child extends parent
{
    String cname;
    void information(String c)
    {
        cname=c;
    }
  public void show()
  {
      System.out.println("inside child class");
      System.out.println("the name of the child is:"+cname);
      System.out.println("Parent Name: " + name + ", Parent Age: " + age);

  }
  
}
class toys extends child
{
  String toys;
  toys(String t)
  {
    this.toys=t;
  }
  public void see()
  {
    System.out.println("inside toy class");
    System.out.println("the name of the toy is:"+toys);
    System.out.println("Parent Name: " + name + ", Parent Age: " + age + "Child Name: " + cname);
  }
}
    
public class MInheritance
{
  public static void main(String[] args)
  {
    System.out.println("inside main class");
    toys obj = new toys("xyz");
    obj.info("ABCD",45);
    obj.display();
    obj.information("abcd");
    obj.show();
    obj.see();
  }
}
