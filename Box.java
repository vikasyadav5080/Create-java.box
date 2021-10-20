class Box
{
double length,width, height;

Box()
{
length=width=height=-1;
}
Box(double d)
{
length=width=height=d;
}
Box (double length, double width, double height)
{
this.length=length;
this.width=width;
this.height=height;
}
Box( Box b)
{
this.length=b.length;
this.width= b.width;
this.height= b.height+5;
}

double volume()
{
return(length*width*height);
}

Box getBox()
{
return this;
}
Box getBox1()
{
Box t= new Box(19);
return t;
}
public static void main(String[] args) {

Box b1= new Box();
Box b2= new Box(12);
Box b3= new Box(11,15,23);
Box b4= new Box(b3);
Box b5= b2.getBox();
Box b6= b3.getBox1();
System.out.println("Volume is : "+b1.volume());
System.out.println("Volume is : "+b2.volume());
System.out.println("Volume is : "+b3.volume());
System.out.println("Volume is : "+b4.volume());
System.out.println("Volume is : "+b5.volume());
System.out.println("Volume is : "+b6.volume());

System.out.println("b2 and b5 are same : "+(b2==b5));


System.out.println("b3 and b6 are same: "+(b3==b6));

}
}

