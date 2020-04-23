
/***
* Example JUnit testing class for Circle1 (and Circle)
***/

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;

// 
// Stuff you want to do before each test case
//
@BeforeEach
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@AfterEach
public void teardown()
{
   System.out.println("\nTest finished.");
}


//
// // moveBy tests
//

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   assertTrue(p.x == 0 && p.y == 1);
}

//
// test movement into negative space
//
@Test
public void moveToNeg() {
   Point p;
   System.out.println("Running test moveToNeg.");
   p = circle1.moveBy(-11,-12);
   System.out.printf("x: %f, y: %f\n", p.x, p.y);
   assertTrue(p.x == -10 && p.y == -10);
}//end moveToNeg


//
// // scale tests
//

//
// Tests scale by doubling the radius
//
@Test
public void scaleTestDouble() {
    System.out.println("Running test scaleTest.");
    double newRadius = circle1.scale( 2.0 );
    assertTrue( newRadius == 6 );
}//end scaleTestDouble

//
// Tests scale by halving the radius
//
@Test
public void scaleTestHalf() {
    System.out.println("Running test scaleTestHalf.");
    double newRadius = circle1.scale( 0.5 );
    assertTrue( newRadius == 1.5 );
}//end scaleTestHalf

//
// Tests scale with negative param
//
@Test
public void scaleTestNegArg() {
    System.out.println("Running test scaleTestNegArg.");
    double newRadius = circle1.scale( -1.5 );
    assertTrue( newRadius == 3 );
}//end scaleTestNegArg


//
// // Intersect tests
//

//
// tests intersects in quadrant 1
//
@Test
public void intersectsQ1Test() {
    System.out.println("Running test intersectsQ1Test.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 q1Circle = new Circle1( 4, 4, 4 );
    assertTrue( circle1.intersects( q1Circle ) );
}//end intersectsQ1Test

//
// tests intersects in quadrant 2
//
@Test
public void intersectsQ2Test() {
    System.out.println("Running test intersectsQ2Test.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 q2Circle = new Circle1( -4, 4, 4 );
    assertTrue( circle1.intersects( q2Circle ) );
}//end intersectsQ2Test

//
// tests intersects in quadrant 3
//
@Test
public void intersectsQ3Test() {
    System.out.println("Running test intersectsQ3Test.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 q3Circle = new Circle1( -4, -4, 4 );
    assertTrue( circle1.intersects( q3Circle ) );
}//end intersectsQ3Test

//
// tests intersects in quadrant 4
//
@Test
public void intersectsQ4Test() {
    System.out.println("Running test intersectsQ4Test.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 q4Circle = new Circle1( 4, -4, 4 );
    assertTrue( circle1.intersects( q4Circle ) );
}//end intersectsQ4Test

//
// tests intersects with concentric circles
//
@Test
public void intersectsConcentricTest() {
    System.out.println("Running test intersectsConcentricTest.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 concentricCircle = new Circle1( 0, 0, 2 );
    assertTrue( circle1.intersects( concentricCircle ) );
}//end intersectsConcentricTest

//
// tests intersects with non intersecting circle
//
@Test
public void intersectsFalseTest() {
    System.out.println("Running test intersectsFalseTest.");
    //move circle to origin
    Point p = circle1.moveBy( -1, -2 );
    Circle1 farCircle = new Circle1( 7, 5, 2 );
    assertTrue( !circle1.intersects( farCircle ) );
}//end intersectsFalseTest



}//end Circle1Test

