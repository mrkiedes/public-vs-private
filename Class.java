public class Class{
  private int numComputers;
  private int roomNumber;
  private String className;
  private String subject;

  public Class(){
    numComputers = 20;
    roomNumber = 222;
    className = "Circus";
    subject = "Good Question";
  }

  public int getRoomNumber(){
    return roomNumber;
  }

  public void setRoomNumber(int num){
    roomNumber = num;
  }

}
