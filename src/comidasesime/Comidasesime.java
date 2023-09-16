/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comidasesime;

import javax.swing.JOptionPane;

/**
 *
 * @author Francisco J
 */
public class Comidasesime 
{
    public void buscar(String st, String c, int h, int p, int cal, int trans)
    { 
        String check[] = st.split(",");//separa la cadena deltxt y la guarda en un arreglo de Strings
        String sresul = "";//cadena donde se concatena el resultado
        int aux = 0;
        int i = 0;//contador para leer check[] y comparar dentro del if principal
        int numresul = 0;//contador para indicar cuantos resultados se encuentra con el mismo tipo de comida
        
        for(int j = 0; j < check.length; j=j+6)//for que salta todo el tamaño de un registro
        {
            if(check[j].contentEquals(c)==true)//verifica si el tipo de comida correponde
            {
                numresul++;//cuenta el numero de coincidencias
                i = j;//iguala el contador del for con el contar globlal
                sresul = sresul + check[i] + " , " + check[i+1] + " , "; //concatena los dos primeros elementos, tipo de comida y nombre del restauran
                i = i + 2;//se salta 2 lugares de check;
            switch(check[i])//verifica la cadena contenida y verifica si son igual dependiende del valor que tenga el slider de precios
            {
                case "0-59$"://verifica el caso cuendo check[] sea igal a "0-59"
                    if(p==0)//si el valor del slider precio (p) es igual a 0 significa que la cadena corresponde el caso
                    {    
                        sresul = sresul + "en presupuesto" + " , ";//concatena con la cadena resultado
                        i++;//aumenta el contador i
                    }
                    else//si la cadena no correponde 
                    {
                        sresul = sresul + "fuera de presupuesto"  + " , "; 
                        i++;
                    }
                break;
                case "60-119$":
                    if(p==1)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                          sresul = sresul + "fuera de presupuesto"  + " , ";
                          i++;
                    }
                break;
                case "120-179$":
                    if(p==2)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "fuera de presupuesto"  + " , ";
                        i++;
                    }
                break;
                case "180-229$":
                    if(p==3)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "fuera de presupuesto"  + " , ";
                        i++;
                    }
                break;
                case "230-289$":
                    if(p==4)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "fuera de presupuesto"  + " , ";
                        i++;
                    }
                break;
                case "290-349$":
                    if(p==5)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "fuera de presupuesto"  + " , ";
                        i++;
                    }
                break;
                case ">350$":
                    if(p==6)
                    {
                        sresul = sresul + "en presupuesto" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "fuera de presupuesto" + " , ";
                        i++;
                    }
                break;
                default:
                    JOptionPane.showMessageDialog(null,"no existen");
                    i++;
                break;
            }
            
            switch(check[i])
            {
                case "*":
                    if(cal==0)
                    {
                        sresul = sresul + "★" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "no califica" + " , ";
                        i++;
                    }
                break;
                case "**":
                    if(cal==1)
                    {
                        sresul = sresul + "★★" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "no califica" + " , ";
                        i++;
                    }
                break;
                case "***":
                    if(cal==2)
                    {
                        sresul = sresul + "★★★" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "no califica" + " , ";
                        i++;
                    }
                break;
                case "****":
                    if(cal==3)
                    {
                        sresul = sresul + "★★★★" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "no califica" + " , ";
                        i++;
                    }
                break;
                case "*****":
                    if(cal==4)
                    {
                        sresul = sresul + "★★★★★" + " , ";
                        i++;
                    }
                    else
                    {
                        sresul = sresul + "no califica" + " , ";
                        i++;
                    }
                break;                      
                default:
                    JOptionPane.showMessageDialog(null,"no esta en el rango de calificacion");
                    i++;
                break;
            }
            
            switch(check[i])
            {
                case "a pie":
                    if(trans==1||trans==2||trans==3)
                    {
                        sresul = sresul + "se puede llegar con el transporte seleccionado" + " , ";
                        i++;
                    }
                    else
                    {
                      sresul = sresul + "no se puede llegar con el transporte seleccionado" + " , ";
                      i++;  
                    }
                break;
                case "en metro":
                    if(trans==2||trans==3)
                    {
                        sresul = sresul + "se puede llegar con el transporte seleccionado" + " , ";
                        i++;
                    }
                    else
                    {
                      sresul = sresul + "no se puede llegar con el transporte seleccionado" + " , ";
                      i++;  
                    }
                break;
                case "en auto":
                    if(trans==3)
                    {
                        sresul = sresul + "se puede llegar con el transporte seleccionado" + " , ";
                        i++;
                    }
                    else
                    {
                      sresul = sresul + "no se puede llegar con el transporte seleccionado" + " , ";
                      i++;  
                    }
                break;                    
                default:
                    JOptionPane.showMessageDialog(null,"no disponible");
                    i++;
                break;
            }
            
            aux = Integer.parseInt(check[i]);
            if(h>=aux && h < 2359)
            {
               sresul = sresul + "disponible en el horario" + " , ";
               i++;
            }
            else
            {
                sresul = sresul + "no disponible en el horario" + " , ";
                i++;
            }
                
            }

        }

        if(numresul==0)
        {
            JOptionPane.showMessageDialog(null,"no hay restaurantes que sirvan eso");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"se obtubieron " + numresul + " resultados");
            //JOptionPane.showMessageDialog(null,sresul);
            acomodarresultado(sresul);
        }

    }
    
    public void acomodarresultado(String result)
    {
        String acomodada = "";
        int i = 0;
        String sinsal[] = result.split(" , ");
        for(int j = 0 ; j < sinsal.length ; j = j + 6 )
        {
            i = j;//primera vuelta = 0
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 0
            i++;//primera vuelta aumenta la pos a 1
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 1
            i++;//primera vuelta aumenta la posicion a 2
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 2
            i++;//primera vuelta aumenta la pos a 3
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 3
            i++;//primera vuelta aumenta la posicion a 4
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 4
            i++;//primera vuelta aumenta la pos a 5
            acomodada = acomodada + sinsal[i] + " , ";//primera vuelta pos = 5
            acomodada = acomodada + "\n";//agrega el salto de liena
            
        }
        JOptionPane.showMessageDialog(null,acomodada);
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
    }
    
}
