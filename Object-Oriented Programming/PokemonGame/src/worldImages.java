public class worldImages {
 
    String filename;
        int xstart, ystart, xdim, ydim;
    public worldImages(String fn,int xs, int ys, int xd, int yd) {
        /** create getter and return methods*/
        filename = fn;
        xstart = xs;
        ystart = ys;
        xdim = xd;
        ydim = yd;
    }
    
    public int getXStart() {
        return xstart; }
    public int getYStart() {
        return ystart; }
    public int getXDim() {
        return xdim; }
    public int getYDim() {
        return ydim; }
    public String getFilename() {
        return filename; } 
       
       
    
        
}