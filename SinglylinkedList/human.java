public class human {
  public human(int age, String name, String adress) {
    this.age = age;
    this.name = name;
    Adress = adress;
  }
  private int age;
  private String name;
  private String Adress;
  
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getAdress() {
    return Adress;
  }
  public void setAdress(String adress) {
    Adress = adress;
  }
}
