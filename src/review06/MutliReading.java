package review06;

public class MutliReading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.out.println("Starting the download");
	        downloadTheGame();
	        System.out.println("Waiting for the download ");
	        extractTheGame();
	        System.out.println("Done");

	    }

	    public  static void downloadTheGame() throws InterruptedException {
	        Thread.sleep(10000);
	        System.out.println("Game downloaded");
	    }
	    public static void extractTheGame() throws InterruptedException {
	        Thread.sleep(5000);
	        System.out.println("Extracting the Game");
	}

}
