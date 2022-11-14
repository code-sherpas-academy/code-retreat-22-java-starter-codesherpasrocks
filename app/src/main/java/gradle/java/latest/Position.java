package gradle.java.latest;

class Position {


  private final int y;
  private final int x;
  //TODO: Make heading an enum
  private final String heading;

  public Position(int x, int y, String heading) {
    this.x = x;
    this.y = y;
    this.heading = heading;
  }
}
