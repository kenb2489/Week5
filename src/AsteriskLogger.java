



public class AsteriskLogger implements Logger{

public void log(String log){
  System.out.println("***" + log + "***");
  System.out.println();
  }

public void error(String error) {
  System.out.println("******************");
  System.out.println("*** ERROR:" + error+ "***");   
  System.out.println("******************");
  System.out.println();
  }

}
