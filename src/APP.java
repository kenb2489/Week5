





public class APP {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    AsteriskLogger logger = new AsteriskLogger();
    logger.log("Hello");
    logger.error("Hello");
    
    SpacedLogger logger2 = new SpacedLogger();
    logger2.log("Hello");
    logger2.error("Hello");
  }

}
