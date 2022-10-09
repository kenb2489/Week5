




public class SpacedLogger implements Logger{

  public void log(String log) {
    System.out.println(log.replace("", " ").trim());
    System.out.println();
  }

  public void error(String error) {
    System.out.println("Error: " + error.replace("", " ").trim());
  }
}


