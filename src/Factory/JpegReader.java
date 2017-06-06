/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.ImageReader;
import Factory.DecodedImage;

/**
 * Concrete Class
 * @author Saul
 */
public class JpegReader implements ImageReader{
    private DecodedImage mDecodedImage;

    public JpegReader(String image) {
        this.mDecodedImage = new DecodedImage(image);
    }
    
    @Override
    public DecodedImage getDecodeImage() {
        return this.mDecodedImage;
    }
    
    
    
}
