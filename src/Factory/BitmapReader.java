/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 * Concrete class that the factory will make.
 * @author Saul
 */
public class BitmapReader implements ImageReader {
    private DecodedImage mDecodeImage;
    
    public BitmapReader(String Image) {
        this.mDecodeImage = new DecodedImage(Image);
    }
    @Override
    public DecodedImage getDecodeImage() {
        return  this.mDecodeImage;
    }
}
