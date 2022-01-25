import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
/**
 * either shreds an image into lines horizontally or vertically or cuts an image into squares/rectangles.
 *
 * @author Circle Onyx
 * @version 1.0
 */
public class ImageShredder
{
	public static void main(){
		String args = "Shred_input/ugly.png";
		shredUpright
	}
    static BufferedImage source;
    public static void shredUpright(String args, int width) throws Exception{
        source = ImageIO.read(new File("./"+args));
        int y = 1;
        for(int x = 0; x < source.getWidth(); x+=width){
            ImageIO.write(source.getSubimage(x,0,width,source.getHeight()),"png",new File("./Shredding_Bin/Shredded_Verti_Part_"+ y +".png"));
            y++;
        }
    }
    public static void shredSideways(String args, int height) throws Exception{
        source = ImageIO.read(new File("./"+args));
        int x = 1;
        for(int y = 0; y < source.getWidth(); y+=height){
            ImageIO.write(source.getSubimage(0,y,source.getWidth(),height),"png",new File("./Shredding_Bin/Shredded_Hori_Part_"+ x +".png"));
            x++;
        }
    }

    public static void crop(String args, int width, int height) throws Exception{
        source = ImageIO.read(new File("./"+args));
        int imgNum = 0;
        for(int y = 1; y < source.getHeight(); y+=height){
            for(int x = 0; x < source.getWidth(); x+=width){
                ImageIO.write(source.getSubimage(x,y,width,source.getHeight()),"png",new File("./Shredding_Bin/Shredded_Square_Part_"+ imgNum +".png"));
                imgNum++;
            }
        }
    }
}
