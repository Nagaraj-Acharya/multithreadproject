package TEST;
class simple implements Runnable
{

	@Override
	public void run() {
    System.out.println("Thread :" +Thread.currentThread().getId());		
	}
}


public class Multidemo {

	public static void main(String[] args) {
     int i=10;//threads
     
     for(i=0;i<10;i++)
     {
     Thread t1=new Thread(new simple());
     Thread t2=new Thread(new simple());
     t1.start();
     }
     //training:
   //https://l.facebook.com/l.php?u=https%3A%2F%2Fonedrive.live.com%2Fview.aspx%3Fresid%3DCC8E3A9C8E305767!16781%26ithint%3Dfile%252Cxlsx%26app%3DExcel%26authkey%3D!AFM5i2Y78xDoWjU&h=AT2H31k5d4_nBWOTbVqNeOosTfmU1Sg3NflMJzXxfITnEOqFOE_uvZp01TuNxE7Jshop71nYXGa6TgN8bH0LguHxn6KkBUEkqbV1NjMg-Q2iYJQDwzktyYI2MnVGDfHCrWV2IwYezGBdYAjw


	}
}
