class Grocery
{
private int weight;
public void weightNow()
{
weight=80;
}
public void checkWeight()
{
System.out.println("The weight is:"+weight);
}
public static void main(String ar[])
{
Grocery g= new Grocery();
g.weightNow();
g.checkWeight();
}
}