

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{   //intersect equation from https://www.geeksforgeeks.org/check-two-given-circles-touch-intersect/
    
    double distSq =    ( center.x - other.center.x ) * ( center.x - other.center.x ) + 
                    ( center.y - other.center.y ) * ( center.y - other.center.y ); 
    double radSumSq =  ( radius + other.radius ) * ( radius + other.radius ); 
    if( radSumSq >= distSq ) return true;
    return false;
}

}

