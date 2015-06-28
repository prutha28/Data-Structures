package sorted.arrays;

public class ScoreCardTest {

	public static void main( String[] args ){
		ScoreCard scores = new ScoreCard() ;
		scores.add(new GameEntry("Jon Snow", 50)) ;
		scores.add(new GameEntry("Arya Stark", 80)) ;
		scores.add(new GameEntry("Robb Stark", 40)) ;
		scores.add(new GameEntry("Sansa stark", 20)) ;
		scores.display();
	}
}
