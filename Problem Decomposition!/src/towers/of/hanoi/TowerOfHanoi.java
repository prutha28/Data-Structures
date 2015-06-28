package towers.of.hanoi;

import java.util.List;

import list.implementation.of.stacks.Stack;

public class TowerOfHanoi {

	/**
	 * Mine..
	 * @param discNum
	 * @param from
	 * @param to
	 * @param via
	 */
	public static void move( int discNum, Stack from, Stack to, Stack via ){

		if( discNum == 0 )
			return ;

		else if ( discNum == 1){
			to.push(from.pop()) ;
		}
		else{
			move(discNum - 1, from, via, to) ;	// 3 steps
			move( 1, from, to, via ) ;			// 1 step
			move( discNum -1 , via, to, from ) ;	// 3 steps
		}
	}

	/**
	 * This Function just prints the moves.
	 * @param discNum
	 * @param from
	 * @param to
	 * @param via
	 */
	public static void towers( int discNum, char from, char to, char via ){

		if( discNum == 1)
		{
			System.out.printf("\nMove from %c to %c", from , to);	// BASE
			return ;
		}
		else{
			towers( discNum -1 , from, via, to ) ;
			System.out.printf("\nMove from %c to %c", from , to); 
			// OR
			//			towers( 1 , from, to , via) ;
			towers( discNum -1 , via, to, from) ;
		}
	}
}
