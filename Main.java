class Main {
  public static void main(String[] args) {
    // ExCar myCar = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");

    // System.out.printf("차량이름: %s\n",myCar.getName());
    // System.out.printf("현재위치: (%.2f,%.2f)\n", myCar.getX(), myCar.getY());
    // System.out.printf("남은연료: %.2f리터\n", myCar.getFuel());
    // System.out.printf("구 입 일: %s\n",myCar.getPurchaseDay());
    
    Car car1 = new ExCar("W140",1885,1490,5220,95.0,"2018,10,13");

    car1.move(10,10);

    //System.out.println("총 주행거리:"+car1.getTotalMileage());
    System.out.println("총 주행거리:"+((ExCar)car1).getTotalMileage());

    // ExCar car2 = new ExCar("W221",1845,1490,5205,90.0,"2015,12,24");
    
    // Car x;
    // x = car1;
    // //x = car2;

    // System.out.println("x구입일:"+x.getPurchaseDay());

    // ExCar y;
    // //y = car1;
    // y = car2;

    // System.out.println("y구입일:"+y.getPurchaseDay());
    // System.out.println("y의 총 주행거리:"+y.getTotalMileage());

  }
}