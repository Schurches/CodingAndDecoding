/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Imagenes.CargarImagenes;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**

 *

 * @author jdavi

 */

public class DeteccionView extends javax.swing.JFrame {

    private MainView previousView;
    private File inputFile;
    private boolean polinomioCorrecto;
    private int[] polinomioGenerador; 

    /**

     * Creates new form DeteccionView

     */

    public DeteccionView(MainView previousView) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);         
        this.previousView=previousView;
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Files TXT CRC","txt","crc");
        FilePicker.setFileFilter(filter);
        FilePicker.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FilePicker.setMultiSelectionEnabled(false);
        BotonAtras.setIcon(new ImageIcon(CargarImagenes.class.getResource("BackIcon.png")));
        inputFile=null;
        polinomioCorrecto=false;
       polinomioGenerador=null;
       TextBoxPolinomio.setEnabled(false);
    }

    /**

     * This method is called from within the constructor to initialize the form.

     * WARNING: Do NOT modify this code. The content of this method is always

     * regenerated by the Form Editor.

     */

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FilePicker = new javax.swing.JFileChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonAtras = new javax.swing.JButton();
        BotonAbrirArchivo = new javax.swing.JButton();
        LabelUrlSelectedFile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CheckCodificar = new javax.swing.JCheckBox();
        CheckDecodificar = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        labelErrorMessage = new javax.swing.JLabel();
        TextBoxPolinomio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        FilePicker.setDialogTitle("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 350));
        setMinimumSize(new java.awt.Dimension(700, 350));
        setType(java.awt.Window.Type.POPUP);

        jLabel4.setText("Steven Iglesias");
        jLabel4.setToolTipText("");

        jLabel3.setText("Jonathan ilias");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Deteccion de Errores ");

        BotonAtras.setToolTipText("");
        BotonAtras.setBorder(null);
        BotonAtras.setBorderPainted(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonAtras.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        BotonAtras.setFocusPainted(false);
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonAbrirArchivo.setText("Abrir Archivo");
        BotonAbrirArchivo.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        BotonAbrirArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirArchivoActionPerformed(evt);
            }
        });

        LabelUrlSelectedFile.setText("------------Url-------------");

        jLabel5.setText("Codificar/Decodificar");

        CheckCodificar.setText("Codificar");
        CheckCodificar.setToolTipText("");
        CheckCodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCodificarActionPerformed(evt);
            }
        });

        CheckDecodificar.setText("Decodificar");
        CheckDecodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDecodificarActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        labelErrorMessage.setText("*");

        TextBoxPolinomio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBoxPolinomioKeyReleased(evt);
            }
        });

        jLabel1.setText("Polinomio Generador:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(BotonAbrirArchivo))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelUrlSelectedFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(181, 181, 181))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckCodificar)
                                    .addComponent(CheckDecodificar))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(302, 302, 302)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TextBoxPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 95, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAbrirArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelUrlSelectedFile))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(CheckCodificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CheckDecodificar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelErrorMessage))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextBoxPolinomio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(130, 130, 130))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonAbrirArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirArchivoActionPerformed
        labelErrorMessage.setForeground(Color.BLACK);
        labelErrorMessage.setText("*");
        FilePicker.setFileSelectionMode( JFileChooser.FILES_ONLY );
        int seleccion = FilePicker.showOpenDialog( this );
        if( seleccion == JFileChooser.APPROVE_OPTION ){
           inputFile = FilePicker.getSelectedFile();
            LabelUrlSelectedFile.setText(inputFile.getPath());
        }else{
            inputFile=null;
            LabelUrlSelectedFile.setText("------------Url-------------");
        }

    }//GEN-LAST:event_BotonAbrirArchivoActionPerformed
    private void CheckCodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCodificarActionPerformed
        labelErrorMessage.setForeground(Color.BLACK);
        labelErrorMessage.setText("*");
        if(CheckCodificar.isSelected()){
            CheckDecodificar.setEnabled(false);
        }else{
            CheckDecodificar.setEnabled(true);    
        }
        TextBoxPolinomio.setEnabled(false);
    }//GEN-LAST:event_CheckCodificarActionPerformed
    private void CheckDecodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDecodificarActionPerformed
        labelErrorMessage.setForeground(Color.BLACK);
        labelErrorMessage.setText("*");
        if(CheckDecodificar.isSelected()){
            CheckCodificar.setEnabled(false);
        }else{
            CheckCodificar.setEnabled(true);    
        }
        TextBoxPolinomio.setEnabled(true);
    }//GEN-LAST:event_CheckDecodificarActionPerformed
    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        labelErrorMessage.setForeground(Color.BLACK);
        labelErrorMessage.setText("*");
        CheckCodificar.setSelected(false);
        CheckCodificar.setEnabled(true);  
        CheckDecodificar.setSelected(false);
        CheckDecodificar.setEnabled(true);
        LabelUrlSelectedFile.setText("------------Url-------------");
        previousView.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAtrasActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(inputFile!=null){
           if(CheckCodificar.isSelected() || CheckDecodificar.isSelected()){

                    int index = inputFile.getName().lastIndexOf('.');
                    String extencion = inputFile.getName().substring(index + 1);
                    if(CheckCodificar.isSelected()){                          
                        if (polinomioCorrecto) {
                            //Obtener el polinomio Generador ingresado
                            TextBoxPolinomio.setEnabled(false);
                            String Gdx=TextBoxPolinomio.getText();
                            polinomioGenerador= new int[Gdx.length()];
                            for (int i = 0; i < Gdx.length(); i++) {
                               polinomioGenerador[i]=Integer.parseInt(Gdx.substring(i, i+1));
                            }
                            if(extencion.equalsIgnoreCase("txt")){
                                Decodificar(getDataWords(leerArchivoTXT()));
                                labelErrorMessage.setForeground(Color.GREEN);
                                labelErrorMessage.setText("Operaccion exitosa");
                            }else{                 
                                labelErrorMessage.setForeground(Color.GREEN);
                                labelErrorMessage.setText("Para codificar se necesita un archivo con extencion .txt");
                            }
                        }else{
                            labelErrorMessage.setForeground(Color.RED);
                            labelErrorMessage.setText("El polinomio es incorrecto");
                        }
                     }else if(CheckDecodificar.isSelected()){
                        if(extencion.equalsIgnoreCase("crc")){
                            Codificar(leerArchivoCRC());
                            labelErrorMessage.setForeground(Color.GREEN);
                            labelErrorMessage.setText("Operaccion exitosa");
                        }else{
                            labelErrorMessage.setForeground(Color.GREEN);
                            labelErrorMessage.setText("Para dECODIFICAR se necesita un archivo con extencion .crc");
                         }
                     }      

           }else{
               labelErrorMessage.setForeground(Color.RED);
               labelErrorMessage.setText("Seleccione alguan opcion en \"Codificar/Decodificar\"");
           } 
       }else{
            labelErrorMessage.setForeground(Color.RED);
            labelErrorMessage.setText("Seleccione un archivo en \"Abrir Archivo\"");
       }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void TextBoxPolinomioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBoxPolinomioKeyReleased
        if (!Pattern.matches("[01]*", TextBoxPolinomio.getText())){
            polinomioCorrecto=false;
            labelErrorMessage.setForeground(Color.RED);
            labelErrorMessage.setText("El polinomio se debe digitar como una sucesión de 1 y 0s solamente.");
        }else{
            polinomioCorrecto=true;
            labelErrorMessage.setForeground(Color.BLACK);
            labelErrorMessage.setText("*");
        } 
    }//GEN-LAST:event_TextBoxPolinomioKeyReleased

static int operationXor(int a, int b) {
        if(a == b) {
                return 0;
        }
        return 1;
}
private String cerosRestantes(String word,int totalBits){
    String ceros="";
    if(word.length()<totalBits){
        for (int j = 0; j <totalBits-word.length(); j++) {
           ceros=ceros+"0";
        }      
    }
    return ceros;
}
private String leerArchivoTXT(){
    FileReader f = null;
    String Contenido="";
        try {
            String cadena;
            f = new FileReader(inputFile);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                Contenido=Contenido+cadena;
            }     
            b.close();    
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return Contenido;
}
private String[] getDataWords(String inputFileContent){
    int numberDataWords=(inputFileContent.length()/16);
    if(inputFileContent.length()%16>0)
        numberDataWords++;
    String[] DataWords = new String[numberDataWords];
    int bitsCount, dataWordCount;
        bitsCount=1;
        dataWordCount=0;
        String tempDataWord="";
        for (int i = 0; i < inputFileContent.length() ; i++) {
            String letra = inputFileContent.substring(i, i+1);
            String ascii= previousView.charAsciiHashMap.get(letra);
            String BinaryWord=BigInteger.valueOf(Integer.parseInt(ascii)).toString(2);
            String wordBinary = cerosRestantes(BinaryWord,8)+BinaryWord;
            tempDataWord=tempDataWord+wordBinary;
            if(bitsCount==16 || (bitsCount>0 && i==inputFileContent.length()-1)){
              DataWords[dataWordCount]=tempDataWord;
              tempDataWord="";
              dataWordCount++;
              bitsCount=0;
            }
            bitsCount++;
        }
    return DataWords;
}
private String getReminder(String DataWordS) {
    int[] DataWord=new int[DataWordS.length()];
    for (int i = 0; i < DataWordS.length(); i++) {
        DataWord[i]=Integer.parseInt(DataWordS.substring(i, i+1));
    }
    int remainder[];
    int data[] = new int[DataWord.length + polinomioGenerador.length];
    System.arraycopy(DataWord, 0, data, 0, DataWord.length);
    remainder = new int[polinomioGenerador.length];
    System.arraycopy(data, 0, remainder, 0, polinomioGenerador.length);
    for(int i=0 ; i < DataWord.length ; i++){
        if(remainder[0] == 1) {
            for(int j=1 ; j < polinomioGenerador.length ; j++) {
                remainder[j-1] = operationXor(remainder[j], polinomioGenerador[j]);
            }
        }else{
            for(int j=1 ; j < polinomioGenerador.length ; j++) {
                remainder[j-1] = operationXor(remainder[j], 0);
            }
        }
        remainder[polinomioGenerador.length-1] = data[i+polinomioGenerador.length];
    }
    String resto="";
    for (int i = 0; i <  remainder.length-1; i++) {
        resto=resto+remainder[i];
    }
    return resto;
}   
private void Decodificar(String[] dataWords){
    String[] codeWords = new String[dataWords.length];
    int k=0;
    for (String dataWord : dataWords) {
        codeWords[k]=dataWord+getReminder(dataWord);
        k++;
    }
        String ruta = inputFile.getPath();
        ruta=ruta.replaceAll(inputFile.getName(),"");
        String nombre=inputFile.getName().substring(0,inputFile.getName().indexOf("."));
        ruta=ruta+nombre+".crc";
        File archivo = new File(ruta);
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(TextBoxPolinomio.getText()+"\n");
            for (String codeWord : codeWords) {
                bw.write(codeWord+"\n");
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(DeteccionView.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private String[] leerArchivoCRC(){
    FileReader f = null;
    String Contenido="";
        try {
            String cadena;
            f = new FileReader(inputFile);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                Contenido=Contenido+cadena+"/";
                
            }     
            b.close();    
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        Contenido=Contenido.substring(0,Contenido.length()-1);
        return Contenido.split("/");
}    
private void Codificar(String[] codeWords){
    boolean ignoreOne=false;
    for (String codeWord : codeWords) {
        if(ignoreOne){
            if(!isCorrect(codeWord)){
                JOptionPane.showMessageDialog(null,"Mensaje Incorrecto, se detectaron errores en la transmision", "Operaccion Fallida", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            String polinomio = codeWord;
            polinomioGenerador=new int[polinomio.length()];
            for (int i = 0; i < polinomio.length(); i++) {
                polinomioGenerador[i]=Integer.parseInt(polinomio.substring(i,i+1));
            }
            ignoreOne=true;
        }   
    }
    String Mensaje="";
    ignoreOne=false;
    for (String codeWord : codeWords) {
        if(ignoreOne){
            codeWord = codeWord.substring(0,codeWord.length()-polinomioGenerador.length-1);
            for(int i =0;i<codeWord.length(); i=i+8){
                String BinaryWord="";
                if(i+8>=codeWord.length()){
                    BinaryWord = codeWord.substring(i);
                }else{
                    BinaryWord = codeWord.substring(i,i+8);
                }
                BigInteger number = new BigInteger(BinaryWord,2);
                String letter = previousView.asciiCharHashMap.get(number.toString(10));
                Mensaje=Mensaje+letter;
            }
        }
        ignoreOne=true;
    }
    
    String ruta = inputFile.getPath();
    ruta=ruta.replaceAll(inputFile.getName(),"");
    String nombre=inputFile.getName().substring(0,inputFile.getName().indexOf("."));
    ruta=ruta+nombre+".txt";
    File archivo = new File(ruta);
    BufferedWriter bw;
    try {
        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(Mensaje+"\n");
        bw.close();
    } catch (IOException ex) {
        Logger.getLogger(DeteccionView.class.getName()).log(Level.SEVERE, null, ex);
    }
}
private boolean isCorrect(String dataS) { 
    String remainder = getReminder(dataS);
    for(int i=0;i < remainder.length(); i++){
        if(!remainder.substring(i,i+1).equals("0")) {
                return false;
        }
    }
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbrirArchivo;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JCheckBox CheckCodificar;
    private javax.swing.JCheckBox CheckDecodificar;
    private javax.swing.JFileChooser FilePicker;
    private javax.swing.JLabel LabelUrlSelectedFile;
    private javax.swing.JTextField TextBoxPolinomio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelErrorMessage;
    // End of variables declaration//GEN-END:variables
}

