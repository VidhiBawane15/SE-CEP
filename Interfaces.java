interface Playable {
  void play();
}
class Cricket implements Playable {
  public void play() { System.out.println("Playing Cricket"); }
}
class Football implements Playable {
  public void play() { System.out.println("Playing Football"); }
}

class InterfaceDemo {
  public static void main(String[] args) {
    Playable p = new Cricket();
    p.play();
    p = new Football();
    p.play();
  }
}
