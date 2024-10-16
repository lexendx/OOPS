class Shape{
void draw(){

System.out.println("cannot say shape type");


}




}
class Square extends Shape{

void draw(){

System.out.println("square shape");

}


}
class Polymorphism1{
public static void main(String[] args){

Shape s= new Square();
s.draw();



}




}