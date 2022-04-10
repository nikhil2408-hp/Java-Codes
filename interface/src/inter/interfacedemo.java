package inter;
interface writer
{
	void write();
}
class pen implements writer
{
	public void write()
	{
		System.out.println("in a pen");
	}
}
class pencil implements writer
{
	public void write()
	{
		System.out.println("in a peincil");
	}
}
class kit
{
	public void dosomething(writer p)
	{
		p.write();
	}
}
public class interfacedemo {
	public static void main(String args[])
	{
		kit k=new kit();
		pencil ps=new pencil();
		pen p=new pen();
		k.dosomething(ps);
		k.dosomething(p);
	}

}
