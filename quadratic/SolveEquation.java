/* SolveEquation Class, Quadratic and ComplexPair Client
   Anderson, Franceschi
   Modified by Rosenthal
*/

public class SolveEquation
{
	public static void main( String [] args )
	{
  	  
		/* 0x^2 - 2x + 6 */
		Quadratic q1 = new Quadratic( 0, -2, 6 );
		System.out.printf( "Quadratic equation #1: %s\n", q1 );
		
		/* x = 3 / 0 */
		ComplexPair c1 = q1.solveQuadratic( );
		System.out.printf( "%s\n", q1.getComment( ) );
		System.out.printf( "Solutions: %s\n\n", c1 );
		
		/* -2x^2 + 4x - 2 */
		Quadratic q2 = new Quadratic( -2, 4, -2 );
		System.out.printf( "Quadratic equation #2: %s\n", q2 );
		ComplexPair c2 = q2.solveQuadratic( );
		System.out.printf( "%s\n", q2.getComment( ) );
		System.out.printf( "Solutions: %s\n\n", c2);
		
		/* 1x^2 + 4x + 3 */
		Quadratic q3 = new Quadratic( 1, 4, 3 );
		System.out.printf( "Quadratic equation #3: %s\n", q3);
		ComplexPair c3 = q3.solveQuadratic( );
		System.out.printf( "%s\n", q3.getComment( ) );
		System.out.printf( "Solutions: %s\n\n", c3);
		
		/* -1x^2 + 2x - 5 */
		Quadratic q4 = new Quadratic( -1, 2, -5 );
		System.out.printf( "Quadratic equation #4: %s\n", q4);
		ComplexPair c4 = q4.solveQuadratic( );
		System.out.printf( "%s\n", q4.getComment( ) );
		System.out.printf( "Solutions: %s\n\n", c4);
		
	}
}