 
/*hello program*********************************************/
class Adder{
int add(int a,int b){return a+b;}
int add(int a,int b,int c){return a+b+c;}
//int doubble(double a,double b){return a+b;}
}
class Test{
public static void main(String[]args){
Adder obj=new Adder();
System.out.println(obj.add(11,1));
System.out.println(obj.add(11,1,2));

//System.out.println(obj.double(0.5,0.2));
}
}
