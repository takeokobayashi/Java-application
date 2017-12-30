class Car {
  private String name;
  private String color;
  private int distance = 0;
  private int fuel = 100;

Car(String name, String color) {
    this.name = name;
    this.color = color;
  }

   public void printData() {
    System.out.println("名前：" + this.name);
    System.out.println("色：" + this.color);
    System.out.println("走行距離：" + this.distance + "km");
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
  
  public void run(int distance) {
    System.out.println(distance + "km走ります");
    
    if (distance <= this.fuel) {
    // distanceフィールドに「走る距離」を足す
      this.distance += distance;    
    // fuelフィールドの値から「走る距離」を引く
      this.fuel -= distance;   
  } else {
    // 「ガソリンが足りません」と出力
    System.out.println("ガソリンが足りません");
  }
  // 「走行距離：○○km」と出力
    System.out.println("走行距離：" + this.distance + "km");
  // 「ガソリン量：○○L」と出力
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
    
    public void charge(int litre) {
  // 「○○L給油します」と出力
    System.out.println(litre + "L給油します");
  if (litre <= 0) {
    // 「給油できません」と出力
    System.out.println("給油できません");
  } else if (litre + this.fuel >= 100) {
    // 「満タンまで給油します」と出力
    System.out.println("満タンまで給油します");
    // fuelフィールドに100を代入
    this.fuel = 100;
  } else {
    // fuelフィールドの値を更新
    this.fuel += litre;
  }
  // 「ガソリン量：○○L」と出力
    System.out.println("ガソリン量：" + this.fuel + "L");
  }
}
