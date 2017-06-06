package Factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Concrete Class
 * @author Saul
 */
public class DecodedImage{
    
    private String mImage;
    
    public DecodedImage (String image) {
        this.mImage = image;
    }
    
    @Override
    public String toString() {
        return mImage + ": is decoded";
    }
}
