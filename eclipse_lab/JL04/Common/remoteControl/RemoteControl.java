package remoteControl;

public interface RemoteControl
{
	public final boolean ON = true;
	public final boolean OFF = false;	
	public String clickPower();
	public String clickUp();
	public String clickDown();
	public String clickLeft();
	public String clickRight();
}
