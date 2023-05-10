package HWClass18;

public class Math {


    class square{
        void calculateArea(int side){
            System.out.println("Area the square: "+side+side);
        }
    }

    class rectangle{
       void area(int a, int b) {
           System.out.println("Area of rectangle : "+a*b);
       }
    }

    public static void main(String[] args) {

       square obj=new square();
       obj.calculateArea(10);

       rectangle obj=new rectangle();
       obj.area(10,5);





        





    }
}
