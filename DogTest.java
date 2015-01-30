// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
		Labrador lab = new Labrador("Buddy", "Yellow");
		GetInfo.showMessage(lab.getName() + " says " + lab.speak());
		
		Yorkshire doge = new Yorkshire("Daisy");
		GetInfo.showMessage(doge.getName() + " says " + doge.speak());
		
		
		GetInfo.showMessage("Average Weight for labrador:" + lab.avgBreedWeight());
		GetInfo.showMessage("Average Weight for Yorkshire: " + doge.avgBreedWeight());

    }
}
