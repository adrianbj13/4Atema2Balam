package tema2;
import java.util.ArrayList;

public class csMetodos {
    
    public ArrayList<csFilaBiseccion> Biseccion(double xi,double xs, double errorDeseado, int iteraciones){
        double fxi,fxs;
        fxi= this.funcion(xi);
        fxs= this.funcion(xs);
        double errorCalculado=1;
        double xanterior;
        
        ArrayList<csFilaBiseccion> lista;
        int i=1;
        
        if(fxi*fxs<0)
        { //hay solución
            lista = new ArrayList<csFilaBiseccion>();
            
            while(i<iteraciones && errorCalculado>errorDeseado){
                csFilaBiseccion fila = new csFilaBiseccion();
                fila.setI(i);
                fila.setXi(xi);
                fila.setXs(xs);
                fila.setXr((xi+xs)/2);
                
                fila.setFxr(this.funcion(fila.getXr()));
                fila.setFxi(this.funcion(fila.getXi()));
                
                fila.setSigno(fila.getFxi()*fila.getFxr());
                
                if(fila.getSigno()>0){
                  //mayor cambia xi
                  xanterior=xi;
                  xi=fila.getXr();
                }
                else
                {
                    //menor cambia xs;
                   xanterior=xs;
                   xs=fila.getXr();
                }
                if(i>1)
                {
                 errorCalculado= Math.abs((fila.getXr()
                            -xanterior)/fila.getXr());
                    fila.setError(errorCalculado);
                }
                else
                {
                    fila.setError(errorCalculado);
                    
                }
                lista.add(fila);
                //System.out.println(fila.toString());
                i++;
                
            }//fin del while
        }//fin del if
        else
        {
         lista=null;
        }
        
        return lista;
        
    }
    
    private double funcion(double x){
     //return Math.pow(x, 3)+4*Math.pow(x, 2)-10;
        return Math.pow(x, 2)-0.9*x-1.52;
    }
}
    
    
