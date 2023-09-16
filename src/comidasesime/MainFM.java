/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidasesime;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ObjectToStringConverter;
import javax.swing.JOptionPane;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Francisco J
 */
public class MainFM extends javax.swing.JFrame 
{
    Comidasesime obj1 = new Comidasesime();
    public String acomodada;
    public String ST;
    public String comida;
    public String hora;
    public int horanum;
    public int preciomin;
    public int calif;
    public int trasn;
    public String datosel;
    private String ruta_txt = "C://Users//Francisco J//Documents//NetBeansProjects//comidasesime//comidas.txt";

    /**
     * Creates new form MainFM
     */
    public MainFM() {
        
        initComponents();
        listacombos();
        AutoCompleteDecorator.decorate(tipo);
        AutoCompleteDecorator.decorate(horaini);
        AutoCompleteDecorator.decorate(minini);
        abrirreg();
        
    }
    
    public void abrirreg()
    {
        File ruta = new File("C://Users//Francisco J//Documents//NetBeansProjects//comidasesime//comidas.txt");
        try 
        {
            ST = new String(Files.readAllBytes(ruta.toPath()));
            String separada[] = ST.split(",");
            acomodada = "";
            int i = 0;
            for(int j = 0 ; j < separada.length ; j++ )
            {
               acomodada = acomodada + separada[j] + " , ";
               i = j + 1;
               if(i%6==0)
               {
                   acomodada = acomodada + "\n";
               }
            
            }
            resul.setText(acomodada);
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(MainFM.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex)
        {
            Logger.getLogger(MainFM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void listacombos()
    {
        //tipo de comida
        tipo.addItem("pescados y mariscos");
        tipo.addItem("comida corrida");
        tipo.addItem("pizza");
        tipo.addItem("comida a la carta");
        tipo.addItem("antojos mexicanos");
        tipo.addItem("hamburguesas");
        tipo.addItem("tortas");
        tipo.addItem("comida japonesa");
        tipo.addItem("comida china");
        tipo.addItem("alitas");
        tipo.addItem("tacos");
        tipo.addItem("postres");
        tipo.addItem("cafe");
        tipo.addItem("cerveza");
        tipo.addItem("comida rapida");
        tipo.addItem("esquites");
        /*horas*/
        horaini.addItem("6");
        horaini.addItem("7");
        horaini.addItem("8");
        horaini.addItem("9");
        horaini.addItem("10");
        horaini.addItem("11");
        horaini.addItem("12");
        horaini.addItem("13");
        horaini.addItem("14");
        horaini.addItem("15");
        horaini.addItem("16");
        horaini.addItem("17");
        horaini.addItem("18");
        horaini.addItem("19");
        horaini.addItem("20");
        horaini.addItem("21");
        horaini.addItem("22");
        horaini.addItem("23");
        //minutos
        minini.addItem("00");
        minini.addItem("01");
        minini.addItem("02");
        minini.addItem("03");
        minini.addItem("04");
        minini.addItem("05");
        minini.addItem("06");
        minini.addItem("07");
        minini.addItem("08");
        minini.addItem("09");
        minini.addItem("10");
        minini.addItem("11");
        minini.addItem("12");
        minini.addItem("13");
        minini.addItem("14");
        minini.addItem("15");
        minini.addItem("16");
        minini.addItem("17");
        minini.addItem("18");
        minini.addItem("19");
        minini.addItem("20");
        minini.addItem("21");
        minini.addItem("22");
        minini.addItem("23");
        minini.addItem("24");
        minini.addItem("25");
        minini.addItem("26");
        minini.addItem("27");
        minini.addItem("28");
        minini.addItem("29");
        minini.addItem("30");
        minini.addItem("31");
        minini.addItem("32");
        minini.addItem("33");
        minini.addItem("34");
        minini.addItem("35");
        minini.addItem("36");
        minini.addItem("37");
        minini.addItem("38");
        minini.addItem("39");
        minini.addItem("40");
        minini.addItem("41");
        minini.addItem("42");
        minini.addItem("43");
        minini.addItem("44");
        minini.addItem("45");
        minini.addItem("46");
        minini.addItem("47");
        minini.addItem("48");
        minini.addItem("49");
        minini.addItem("50");
        minini.addItem("51");
        minini.addItem("52");
        minini.addItem("53");
        minini.addItem("54");
        minini.addItem("55");
        minini.addItem("56");
        minini.addItem("57");
        minini.addItem("58");
        minini.addItem("59");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        horaini = new javax.swing.JComboBox<>();
        minini = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pie = new javax.swing.JRadioButton();
        metro = new javax.swing.JRadioButton();
        aut = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        precio = new javax.swing.JSlider();
        btbuscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        calificacion = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resul = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recomendacion de comidas");
        setBackground(new java.awt.Color(102, 102, 255));
        setMaximizedBounds(jLabel21.getVisibleRect());
        setMinimumSize(new java.awt.Dimension(430, 530));
        setResizable(false);
        setSize(new java.awt.Dimension(430, 530));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ComidasESIMIAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 6, 392, 17);

        tipo.setEditable(true);
        tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "¿que se te antoja?" }));
        tipo.setOpaque(false);
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        getContentPane().add(tipo);
        tipo.setBounds(10, 90, 205, 29);

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de comida");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 120, 17);

        horaini.setEditable(true);
        horaini.setOpaque(false);
        horaini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horainiActionPerformed(evt);
            }
        });
        getContentPane().add(horaini);
        horaini.setBounds(260, 90, 60, 29);

        minini.setEditable(true);
        minini.setOpaque(false);
        minini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mininiActionPerformed(evt);
            }
        });
        getContentPane().add(minini);
        minini.setBounds(330, 90, 62, 29);

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 60, 50, 17);

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 130, 50, 17);

        buttonGroup1.add(pie);
        pie.setSelected(true);
        pie.setText("A pie");
        pie.setOpaque(false);
        pie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pieActionPerformed(evt);
            }
        });
        getContentPane().add(pie);
        pie.setBounds(30, 290, 49, 23);

        buttonGroup1.add(metro);
        metro.setText("En metro");
        metro.setOpaque(false);
        metro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metroActionPerformed(evt);
            }
        });
        getContentPane().add(metro);
        metro.setBounds(100, 290, 69, 23);

        buttonGroup1.add(aut);
        aut.setText("En auto");
        aut.setOpaque(false);
        aut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autActionPerformed(evt);
            }
        });
        getContentPane().add(aut);
        aut.setBounds(190, 290, 63, 23);

        jLabel6.setText("Forma de llegar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 270, 100, 14);

        precio.setMajorTickSpacing(1);
        precio.setMaximum(6);
        precio.setPaintTicks(true);
        precio.setSnapToTicks(true);
        precio.setValue(0);
        precio.setName(""); // NOI18N
        precio.setOpaque(false);
        getContentPane().add(precio);
        precio.setBounds(10, 150, 400, 33);

        btbuscar.setText("Buscar");
        btbuscar.setOpaque(false);
        btbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btbuscar);
        btbuscar.setBounds(270, 270, 135, 40);

        jLabel8.setText("0--59");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 190, 40, 14);

        jLabel9.setText("60-119");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 190, 50, 14);

        jLabel10.setText("120-179");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 190, 60, 14);

        jLabel11.setText("180-229");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 190, 60, 14);

        jLabel12.setText("230-289");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(250, 190, 60, 14);

        jLabel13.setText("290-349");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 190, 60, 14);

        jLabel14.setText(">350");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(390, 190, 26, 14);

        jLabel15.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText(":");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 90, 20, 29);

        calificacion.setMajorTickSpacing(1);
        calificacion.setMaximum(4);
        calificacion.setPaintTicks(true);
        calificacion.setSnapToTicks(true);
        calificacion.setValue(0);
        calificacion.setOpaque(false);
        getContentPane().add(calificacion);
        calificacion.setBounds(10, 210, 400, 31);

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel5.setText("Calificación");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 200, 90, 17);

        jLabel7.setText("★");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 240, 30, 14);

        jLabel16.setText("★★");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(100, 240, 50, 14);

        jLabel17.setText("★★★");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(190, 240, 60, 14);

        jLabel18.setText("★★★★");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(270, 240, 60, 14);

        jLabel19.setText("★★★★★");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(350, 240, 70, 14);

        limpiar.setText("Limpiar datos");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar);
        limpiar.setBounds(285, 469, 125, 23);

        agregar.setText("agregar un registro");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar);
        agregar.setBounds(10, 469, 149, 23);

        resul.setEditable(false);
        resul.setColumns(20);
        resul.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        resul.setRows(5);
        resul.setAutoscrolls(false);
        jScrollPane1.setViewportView(resul);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 320, 400, 140);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco J\\Documents\\NetBeansProjects\\comidasesime\\fondo.png")); // NOI18N
        jLabel21.setInheritsPopupMenu(false);
        jLabel21.setOpaque(true);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 0, 420, 500);
        jLabel21.getAccessibleContext().setAccessibleName("fondo");
        jLabel21.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

    private void horainiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horainiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horainiActionPerformed

    private void mininiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mininiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mininiActionPerformed

    private void pieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pieActionPerformed

    private void btbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscarActionPerformed
        // TODO add your handling code here:
        //obtiene la cadena en el combobox "tipo"
        comida = tipo.getSelectedItem().toString();
        //verifica que sea una opcion valida
        if(comida == "pescados y mariscos" || comida == "comida corrida" || comida == "pizza" || comida == "comida a la carta" || comida == "antojos mexicanos" || comida == "hamburguesas" || comida == "tortas" || comida == "comida japonesa" || comida == "comida china" || comida == "tienda de abarrotes" || comida == "alitas" || comida == "tacos" || comida == "postres" || comida == "cafe" || comida == "cerveza" || comida == "comida rapida" || comida == "esquites" )
        {
            //obtiene la cadena en el combobox "horaini" y "minini" y las concatena
            hora = horaini.getSelectedItem().toString() + minini.getSelectedItem().toString();
            //canviete la cadena hora en un numero entero
            horanum = Integer.parseInt(hora);
            //verifica que la hora este dentro del rango para poder continuar
            if (horanum < 600 || horanum > 2359)
            {
            JOptionPane.showMessageDialog(null,"ingrese valores dentro del intervalo : 6:00 a 23:59");
            }
            else//si la hora esta en los valores correctos mostramos los datos ingresados
            {
                //obtiene el valor del slider de precio
                preciomin = precio.getValue();
                //verifica el valor del slider "precio" y asigna el valor correcto
                if (preciomin == 0)
                {
                    datosel = comida + ", " + hora + ", " + "0-59$";
                }
                else
                {
                    if (preciomin == 1)
                    {
                        datosel = comida + ", " + hora + ", " + "60-119$";
                    }
                    else
                    {
                        if (preciomin == 2)
                        {
                            datosel = comida + ", " + hora + ", " + "120-179$";
                        }
                        else
                        {
                            if (preciomin == 3)
                            {
                                datosel = comida + ", " + hora + ", " + "180-229$";
                            }
                            else
                            {
                                if (preciomin == 4)
                                {
                                    datosel = comida + ", " + hora + ", " + "230-289$";
                                
                                }
                                else
                                {
                                    if (preciomin == 5)
                                    {
                                        datosel = comida + ", " + hora + ", " + "290-349$";
                                    }
                                    else
                                    {
                                        datosel = comida + ", " + hora + ", " + ">350$";
                                    }
                                }
                            }
                        }
                    }
                }
                //obtiener el valor de slider de calificacion
                calif = calificacion.getValue();
                //verifica el valor del slider "calificacion" para asegnar el caracter correcto
                if (calif == 0)
                {
                    datosel = datosel + ", " + "★";
                }
                else
                {
                    if (calif == 1)
                    {
                        datosel = datosel + ", " + "★★";
                    }
                    else
                    {
                        if (calif == 2)
                        {
                            datosel = datosel + ", " + "★★★";
                        }
                        else
                        {
                            if (calif == 3)
                            {
                                datosel = datosel + ", " + "★★★★";
                            }
                            else
                            {
                                datosel = datosel + ", " + "★★★★★";
                            }
                        }
                    }
                }
            
        //este conjunto if verifica en que boton se encuenra     
        if(pie.isSelected()==true)
        {
           trasn = 1;
           datosel = datosel + ", a pie";
        }
        else
        {
            if (metro.isSelected()==true)
            {
                trasn = 2;
                datosel = datosel + ", en metro";
            }
            else 
            {
                if( aut.isSelected()==true)
                    {
                        trasn = 3;
                        datosel = datosel + ", en auto";
                    }
            }
        }
        JOptionPane.showMessageDialog(null,"los datos ingresados son: \n"+datosel);
        obj1.buscar(ST, comida, horanum, preciomin, calif, trasn);
        }
      }
        else
        {
            JOptionPane.showMessageDialog(null,"ingrese un tipo de comida valido");
        }
    }//GEN-LAST:event_btbuscarActionPerformed

    private void metroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_metroActionPerformed

    private void autActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
        resul.setText(null);
        tipo.setSelectedItem("¿que se te antoja?");
        horaini.setSelectedItem("06");
        minini.setSelectedItem("00");
        precio.setValue(0);
        calificacion.setValue(0);
        resul.setText(acomodada);
    }//GEN-LAST:event_limpiarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        String np = "";
        String nc = "";
        String nuevotrans = "";
        String nuevoreg = "";
        String nuevonombre = "";
        
        int resp = JOptionPane.showConfirmDialog(null, "Para agregar un nuevo registro se tomaran los datos de la pantalla principal \n ¿desea continuar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        
        if( resp == JOptionPane.YES_OPTION)
        {
            nuevonombre = JOptionPane.showInputDialog("ingrese el nombre del restaurant");
            comida = tipo.getSelectedItem().toString();
            if(comida == "pescados y mariscos" || comida == "comida corrida" || comida == "pizza" || comida == "comida a la carta" || comida == "antojos mexicanos" || comida == "hamburguesas" || comida == "tortas" || comida == "comida japonesa" || comida == "comida china" || comida == "tienda de abarrotes" || comida == "alitas" || comida == "tacos" || comida == "postres" || comida == "cafe" || comida == "cerveza" || comida == "comida rapida" || comida == "esquites" )
            {
            hora = horaini.getSelectedItem().toString() + minini.getSelectedItem().toString();
            preciomin = precio.getValue();
            if (preciomin == 0)
                {
                    np = "0-59$";
                }
                else
                {
                    if (preciomin == 1)
                    {
                        np = "60-119$";
                    }
                    else
                    {
                        if (preciomin == 2)
                        {
                            np = "120-179$";
                        }
                        else
                        {
                            if (preciomin == 3)
                            {
                                np = "180-229$";
                            }
                            else
                            {
                                if (preciomin == 4)
                                {
                                    np = "230-289$";
                                
                                }
                                else
                                {
                                    if (preciomin == 5)
                                    {
                                        np =  "290-349$";
                                    }
                                    else
                                    {
                                        np = ">350$";
                                    }
                                }
                            }
                        }
                    }
                }

            calif = calificacion.getValue();
                if (calif == 0)
                {
                    nc = "*";
                }
                else
                {
                    if (calif == 1)
                    {
                        nc = "**";
                    }
                    else
                    {
                        if (calif == 2)
                        {
                            nc = "***";
                        }
                        else
                        {
                            if (calif == 3)
                            {
                                nc = "****";
                            }
                            else
                            {
                                nc = "*****";
                            }
                        }
                    }
                }
            
            
            if(pie.isSelected()==true)
            {
                nuevotrans = "a pie";
            }
            else
            {
                if (metro.isSelected()==true)
                {
                    nuevotrans = "en metro";
                }
                else 
                {
                    if( aut.isSelected()==true)
                    {
                        nuevotrans = "en auto";
                    }
                }
            }
            nuevoreg = comida + "," + nuevonombre + "," + np + "," + nc + "," + nuevotrans + "," + hora + ",";
            JOptionPane.showMessageDialog(null,nuevoreg);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"no es un tipo de comida seleccionable");
            }
        ST = ST + nuevoreg;
        String separada[] = ST.split(",");
        int i = 0;
        acomodada = "";
            for(int j = 0 ; j < separada.length ; j++ )
            {
               acomodada = acomodada + separada[j] + " , ";
               i = j + 1;
               if(i%6==0)
               {
                   acomodada = acomodada + "\n";
               }
            
            }
        resul.setText(acomodada);
        BufferedWriter bw;
            try {
                bw = new BufferedWriter(new FileWriter(ruta_txt));
                bw.write(ST);
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFM.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Nuevo registro cancelado");
        }
        
        
    }//GEN-LAST:event_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JRadioButton aut;
    private javax.swing.JButton btbuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JSlider calificacion;
    private javax.swing.JComboBox<String> horaini;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiar;
    private javax.swing.JRadioButton metro;
    private javax.swing.JComboBox<String> minini;
    private javax.swing.JRadioButton pie;
    private javax.swing.JSlider precio;
    private javax.swing.JTextArea resul;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
