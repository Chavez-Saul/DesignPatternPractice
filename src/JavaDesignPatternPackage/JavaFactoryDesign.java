package JavaDesignPatternPackage;

import Factory.JpegReader;
import Factory.ImageReader;
import Factory.BitmapReader;
import Factory.DecodedImage;
import AbstractFactory.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Saul
 */
public class JavaFactoryDesign {
/*
    public static void main(String[] args) {
     
        // is a concrete class
        DecodedImage decodedImage;
        // ImageReader is a Factory
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        
        if (format.equals("bit")) {
            reader = new BitmapReader(image);
        } 
        if (format.equals("jpeg")) {
            reader = new JpegReader(image);
        }
        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);

    


    }
*/
}

