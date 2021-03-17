/* properties of circle
# any point with X and Y coordinates and a,b as the center of the circle
-> (X-a)^2 + (Y-b)^2 = R*R (then X,Y on the circle)
-> (X-a)^2 + (Y-b)^2 > R*R (then X,Y outside the circle)
-> (X-a)^2 + (Y-b)^2 < R*R (then X,Y inside the circle)
*/

class Solution {
    double r;
    double x;
    double y;

    public Solution(double radius, double x_center, double y_center) {
        this.r=radius;
        this.x=x_center;
        this.y=y_center;
    }
    
    public double[] randPoint() {
        double minx = x-r;
        double maxx = x+r;
        double miny = y-r;
        double maxy = y+r;
        
        double[] result = new double[2];
        result[0] = ((Math.random()*(maxx-minx))+minx);
        result[1] = ((Math.random()*(maxy-miny))+miny);
        
        while((result[0]-x)*(result[0]-x) + (result[1]-y)*(result[1]-y)>=r*r)
        {
            result[0] = ((Math.random()*(maxx-minx))+minx);
            result[1] = ((Math.random()*(maxy-miny))+miny);
        }
        
        return result;
    }
}
/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */
