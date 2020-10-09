/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.standard.ColorSupported;
import javax.print.attribute.standard.PrinterName;

/**
 *
 * @author agus_
 */
public class PruebaImprimir {
    public static void main(String args[]) throws FileNotFoundException, IOException, PrintException {
 
    //Archivo que se desea imprimir
    FileInputStream inputStream = new FileInputStream("c:/capturas/archivo.txt");
String initialString = "text";
    InputStream targetStream = new ByteArrayInputStream(initialString.getBytes());
 String prueba = "        Dulceria Alexito \n"
               + "     Fecha: 2020 Agosto 6 \n"
               + "        Hora: 12:00:00 \n"
         +       "     Num. de Ticket: 100 \n"
         +       "============================== \n"
         +       "Cant.   Descripcion    Importe  \n"
         +       "2    Producto de pru 1  $100.50   \n"
         +       "10   Producto de pru 2  $100.50   \n"
         +       "6    Producto de pru 3  $100.50   \n"
         +       "7    Producto de pru 4  $100.50   \n"
         +       "3    Producto de pru 5  $100.50   \n"
         +       "1    Producto de pru 6  $100.50   \n"
         +       "20   Producto de pru 7  $100.50   \n"
          +       "============================== \n"
         +        "       Total : $703.5           \n"
         +        "   Gracias por su preferencia  \n\n\n";
       
 byte[] bytes = prueba.getBytes();
 //Formato de Documento
//    DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
  DocFlavor docFormat = DocFlavor.BYTE_ARRAY.AUTOSENSE;
        
//Lectura de Documento
    Doc document = new SimpleDoc(bytes, docFormat, null);
 
    //Nombre de la impresora
    String printerName = "58mm Series Printer";
 
    //Inclusion del nombre de impresora y sus atributos
    AttributeSet attributeSet = new HashAttributeSet();
    attributeSet.add(new PrinterName(printerName, null));
    attributeSet = new HashAttributeSet();
    //Soporte de color o no
    attributeSet.add(ColorSupported.NOT_SUPPORTED);
    
 
    //Busqueda de la impresora por el nombre asignado en attributeSet
    PrintService[] services = PrintServiceLookup.lookupPrintServices(docFormat, attributeSet);
 
    System.out.println("Imprimiendo en : " + services[0].getName());
 
    DocPrintJob printJob = services[0].createPrintJob();
    //Envio a la impresora
    printJob.print(document, new HashPrintRequestAttributeSet());
 
    inputStream.close();
 
}
}
