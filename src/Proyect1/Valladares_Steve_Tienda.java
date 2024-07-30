package Proyect1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Valladares_Steve_Tienda {
    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        
        int Menu=0,ProductoCompra=0,ProductoVenta=0, CantidadProducto=0;
        String EstadoDeCaja="Abierto", TipoDeCliente="", Proveedor="", ContinuarComprando="",LlevarDeTodosModos="";
        double DineroBanco=0, DineroCaja=0, DineroRestante=0;
        int StockAzucar=0, StockAvena=0, StockTrigo=0, StockMaiz=0;
        boolean SePuedeComprar=true;
        double VentaMasAlta=0,CompraMasAlta=0, DescuentoLps=0;
        int NumeroDeCompras=0, NumeroDeVentas=0,TotalVentas=0,TotalCompras=0;
        int VentasAzucar=0, VentasAvena=0, VentasTrigo=0, VentasMaiz=0;
        
       
// En reportes, B y C, B es solo cuantas veces se ingreso al Menu?, c? explicacion de la diferencia entre ambas
   
       
        
        
        //Tipo Portadada
        System.out.println("|------------------------------------------------------|");
        System.out.println("|                 ****PORTADA****                      |");
        System.out.println("|PROGRAMA CREADO POR: Steve David Valladares Hernandez |");
        System.out.println("|Projecto Primer Parcial: Tienda                       |");
        System.out.println("|Numero de Cuenta: 22341344                            |");
        System.out.println("|Docente: Ing. Erick Amaya                             |");
        System.out.println("|Clase: Programacion I (CCC104)                        |");
        System.out.println("|Seccion: 106 (2:40pm)                                 |");
        System.out.println("|Fecha de Entrega: Semana:5 | 13/8/2024                |");
        System.out.println("|------------------------------------------------------|");
        
        do{
            System.out.println(""); //Los Sout indentados representan que estan ahi por estetica del Programa
        System.out.println("|----------------------|");
        System.out.println("|       **MENU**       |");
        System.out.println("| 1) Abir Caja         |");
        System.out.println("| 2) Ventas            |");
        System.out.println("| 3) Compras           |");
        System.out.println("| 4) Reportes          |");
        System.out.println("| 5) Cierre de Caja    |");
        System.out.println("| 6) Salir del Sistema |");
        System.out.println("|----------------------|");
            System.out.println("");
        System.out.println("Ingrese Un Numero Acorde a la Tabla");
        Menu=lea.nextInt();
            System.out.println("");
        while(Menu>=7 || Menu<=0){
            System.out.println("ERROR: ingrese un numero entre 1 y 6");
            Menu=lea.nextInt();
                System.out.println("");
        }

      
        if(Menu==1){ //Abir Caja
              if(EstadoDeCaja.equals("Abierto")){
                  System.out.println("Elija una Cantidad de Efectico (Lps.) para Agregar a la Caja");
                  DineroCaja=lea.nextInt();
              } 
               if(EstadoDeCaja.equals("Cerrado")){
                   //Si esta cerrado es el dinero restante de lo que le sobro despues de hacer el deposito
                   
              } 
               
               EstadoDeCaja="Abierto";
            
        }
        
        
        
        
        
         if(Menu==2 && EstadoDeCaja.equals("Abierto")){ //Ventas
             int CantidadAzucar=0, CantidadAvena=0, CantidadTrigo=0,CantidadMaiz=0; //Iniciar y reiniciar Variables
             String ProductoSalida="";
             double Subtotal=0,Total=0;
             double Descuento=0,Impuesto=0;
           
             
            System.out.println("Ingrese que Tipo de Cliente es Usted (A,B,C)");
            TipoDeCliente=lea.next().toUpperCase();
            while(!TipoDeCliente.equals("A")&& !TipoDeCliente.equals("B") && !TipoDeCliente.equals("C")){
                System.out.println("ERROR, elija un tipo de Cliente Correcto (A, B, C)");
                TipoDeCliente=lea.next().toUpperCase();
            }
             
           do{
               System.out.println("");
             System.out.println("| Codigo | Producto | Precio Venta |");
             System.out.println("|   1    | Azucar   |    Lps. 30   |"); 
             System.out.println("|   2    | Avena    |    Lps. 25   |");
             System.out.println("|   3    | Trigo    |    Lps.32    |");
             System.out.println("|   4    | Maiz     |    Lps.20    |");
                 System.out.println("");
               System.out.println("Elija el Producto que desea comprar acorde a Su Numero en la Tabla");
               ProductoVenta=lea.nextInt();
               
               while(ProductoVenta<=0 || ProductoVenta>=5){
                   System.out.println("ERROR, ingrese un producto Valido acorde a la Tabla");
                   ProductoVenta=lea.nextInt();
               }
               
               //Igualar el Codigo Numeral con un String el nombre del producto que le Corresponde
               if(ProductoVenta==1){ 
                   ProductoSalida="Azucar";
               }else if(ProductoVenta==2){
                   ProductoSalida="Avena";
               }else if(ProductoVenta==3){
                   ProductoSalida="Trigo";
               }else if(ProductoVenta==4){
                   ProductoSalida="Maiz";
               }
 
               if(TipoDeCliente.equals("A")){
                   SePuedeComprar=true;
                   //Se reinicia a ser True, en caso de que quede guardada la variable como "false" por una compra previa, ya que el Clietne tipo A puede comprar todos los Productos
               }
               
               if(TipoDeCliente.equals("B")){
                   if(ProductoVenta==1 || ProductoVenta==2 || ProductoVenta==3){
                       SePuedeComprar=true;
                       
                   }else{
                       if(ProductoVenta==4){
                           SePuedeComprar=false;
                       }
                       System.out.println("El tipo de Cliente: "+TipoDeCliente+" no puede Comprar el Producto: "+ProductoSalida);
                       
                   }
                  
   
               }
               
                 if(TipoDeCliente.equals("C")){
                    if(ProductoVenta==4){
                       SePuedeComprar=true;
                       
                   }else{
                       if(ProductoVenta==1 || ProductoVenta==2 || ProductoVenta==3){
                           SePuedeComprar=false;
                       }
                       System.out.println("El tipo de Cliente: "+TipoDeCliente+" no puede Comprar el Producto: "+ProductoSalida);
                       
                   }
                     
                     
                 }
                 
                 
                 //Pedir Cuanto va a Comprar
                 if(SePuedeComprar==true){
                     System.out.println("Ingrese la Cantidad en Kilogramos de "+ProductoSalida+ " que desea Comprar");
                     CantidadProducto=lea.nextInt();
                     while(CantidadProducto<1){
                         System.out.println("Seleccione un Numero Valido de Producto a Comprar");
                          CantidadProducto=lea.nextInt();
                     }
                     
                     
                     //COMPARAR lo pedido con el Usuario, con nuestro Inventario
                if(ProductoVenta==1){
                    if(StockAzucar==0){
                        System.out.println("No se tiene "+ProductoSalida+" en el Inventario");
                        SePuedeComprar=false;
                    }
                    if(CantidadProducto>StockAzucar && StockAzucar!=0){
                        System.out.println("En inventario hay unicamente: "+StockAzucar+" Kg de "+ProductoSalida);
                        System.out.println("Desea Llevar los "+StockAzucar+" Kg (Si), o desea no realizar la compra (No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
                            while(!LlevarDeTodosModos.equals("SI")&& !LlevarDeTodosModos.equals("NO")){
                        System.out.println("Porfavor Ingrese una opcion valida, (Si, o No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
               }
                            if(LlevarDeTodosModos.equals("SI")){
                                CantidadProducto=StockAzucar;
                                StockAzucar=0;
                            }else if(LlevarDeTodosModos.equals("No")){
                                 SePuedeComprar=false;
                                CantidadProducto=0;
                            }
                         
                        
                    }
                }
                
                
                if(ProductoVenta==2){
                     if(StockAvena==0){
                        System.out.println("No se tiene "+ProductoSalida+" en el Inventario");
                        SePuedeComprar=false;
                    }
                      if(CantidadProducto>StockAvena && StockAvena!=0){
                        System.out.println("En inventario hay unicamente: "+StockAvena+" Kg de "+ProductoSalida);
                        System.out.println("Desea Llevar los "+StockAvena+" Kg (Si), o desea no realizar la compra (No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
                            while(!LlevarDeTodosModos.equals("SI")&& !LlevarDeTodosModos.equals("NO")){
                        System.out.println("Porfavor Ingrese una opcion valida, (Si, o No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
               }
                            if(LlevarDeTodosModos.equals("SI")){
                                CantidadProducto=StockAvena;
                                StockAvena=0;
                            }else if(LlevarDeTodosModos.equals("No")){
                                 SePuedeComprar=false;
                                CantidadProducto=0;
                            }
                         
                        
                    }
                }  
                
                
                if(ProductoVenta==3){
                     if(StockTrigo==0){
                        System.out.println("No se tiene "+ProductoSalida+" en el Inventario");
                        SePuedeComprar=false;
                    }
                      if(CantidadProducto>StockTrigo && StockTrigo!=0){
                        System.out.println("En inventario hay unicamente: "+StockTrigo+" Kg de "+ProductoSalida);
                        System.out.println("Desea Llevar los "+StockTrigo+" Kg (Si), o desea no realizar la compra (No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
                            while(!LlevarDeTodosModos.equals("SI")&& !LlevarDeTodosModos.equals("NO")){
                        System.out.println("Porfavor Ingrese una opcion valida, (Si, o No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
               }
                            if(LlevarDeTodosModos.equals("SI")){
                                CantidadProducto=StockTrigo;
                                StockTrigo=0;
                            }else if(LlevarDeTodosModos.equals("No")){
                                SePuedeComprar=false;
                                CantidadProducto=0;
                            }
                         
                        
                    }
                     
                }  
                
                
                if(ProductoVenta==4){
                     if(StockMaiz==0){
                        System.out.println("No se tiene "+ProductoSalida+" en el Inventario");
                         SePuedeComprar=false;
                    }
                     if(CantidadProducto>StockMaiz && StockMaiz!=0){
                        System.out.println("En inventario hay unicamente: "+StockMaiz+" Kg de "+ProductoSalida);
                        System.out.println("Desea Llevar los "+StockMaiz+" Kg (Si), o desea no realizar la compra (No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
                            while(!LlevarDeTodosModos.equals("SI")&& !LlevarDeTodosModos.equals("NO")){
                        System.out.println("Porfavor Ingrese una opcion valida, (Si, o No)");
                        LlevarDeTodosModos=lea.next().toUpperCase();
               }
                            if(LlevarDeTodosModos.equals("SI")){
                                CantidadProducto=StockMaiz;
                                StockMaiz=0;
                            }else if(LlevarDeTodosModos.equals("No")){
                                SePuedeComprar=false;
                                CantidadProducto=0;
                                
                            }
                         
                        
                    } 
                }  
                     
                     
                     
                 }
                 
                 //Sumar la Cantidad de Productos Comprados para realizar Facturacion
                 //Sumar las veces que se compra cada Producto para Ranking (Unicamente si comprar=true, osea solo si se realiza la venta
                 if( SePuedeComprar==true){
                   if(ProductoVenta==1){ 
                   CantidadAzucar+=CantidadProducto;
                   VentasAzucar++;
               }else if(ProductoVenta==2){
                   CantidadAvena+=CantidadProducto;
                   VentasAvena++;
               }else if(ProductoVenta==3){
                   CantidadTrigo+=CantidadProducto;
                   VentasTrigo++;
               }else if(ProductoVenta==4){
                   CantidadMaiz+=CantidadProducto;
                   VentasMaiz++;
               }
             }
               
               System.out.println("Desea comprar otro producto? (si o no)");
               ContinuarComprando=lea.next().toUpperCase();
               while(!ContinuarComprando.equals("SI")&& !ContinuarComprando.equals("NO")){
                   System.out.println("Porfavor Ingrese una opcion valida, (Si, o No)");
                   ContinuarComprando=lea.next().toUpperCase();
               }
           }while(!ContinuarComprando.equals("NO"));
            
           
           //Calculos Subtotal - Impuestos - Etc
           Subtotal=(CantidadAzucar*30)+(CantidadAvena*25)+(CantidadTrigo*32)+(CantidadMaiz*20);    
           Impuesto=Subtotal*0.07;
           
           
           //Descuentos
           if(Subtotal>=1000){ //Si el subtotal es mayor o igual que 1000 lps  | Descuento: 5% 
               Descuento=0.05;
           } if(Subtotal>5000){ //Si el subtotal es mayor que 5000 lps         | Descuento: 10% 
               Descuento=0.1;
           }if(Subtotal<1000){ //Menor que 1000 lps                            | No aplica Descuento
               Descuento=0;
           }
           DescuentoLps=Subtotal*Descuento;
           
           Total=Subtotal+Impuesto-DescuentoLps;
           
           if(Total>0){ //Unicamente Muestra la factura si se compro algun producto (Si el total es 0, osea no compro, no lo muestra).
            //Facturacion
            NumeroDeVentas++;
             System.out.println("--------------------------------------");
             System.out.println("            ***FACTURA***");
             System.out.println("Tipo de Cliente: "+TipoDeCliente);
             System.out.println("");
             System.out.println("Azucar");
             System.out.println("   Cantidad: "+CantidadAzucar);
             System.out.println("   Precio Unitario: Lps. 30");
             System.out.println("Avena");
             System.out.println("   Cantidad: "+CantidadAvena);
             System.out.println("   Precio Unitario: Lps. 25");
             System.out.println("Trigo");
             System.out.println("   Cantidad: "+CantidadTrigo);
             System.out.println("   Precio Unitario: Lps. 32");
             System.out.println("Maiz");
             System.out.println("   Cantidad: "+CantidadMaiz);
             System.out.println("   Precio Unitario: Lps. 20");
             System.out.println("");
             System.out.println("Subtotal: Lps. "+Subtotal);
             System.out.println("Impuesto 7%: Lps. "+Impuesto);
             System.out.println("Descuento: "+Descuento*100+"%");
             System.out.println("Descuento en Lempiras: Lps. "+DescuentoLps);
             System.out.println("Total: "+Total);
             System.out.println("-------------------------------------");
            DineroCaja+=Total;
            NumeroDeVentas++;
            TotalVentas+=Total;
           }
             //Registro Para Ranking 
             
            if(Total>VentaMasAlta){
                VentaMasAlta=Total;
            }
                
        }
        
         
         
         
         if(Menu==3 && EstadoDeCaja.equals("Abierto")){ // Compras
             String ProductoSalida="";
             int PrecioCompra=0;
             int Total=0;
             
            System.out.println("| Codigo |   Producto   |  Precio Compra  |");
            System.out.println("|   1    | Azucar (A)   |     Lps. 25     |"); 
            System.out.println("|   2    | Avena  (B/C) | Lps.(B)20 (C)22 |");
            System.out.println("|   3    | Trigo  (B)   |     Lps.30      |");
            System.out.println("|   4    | Maiz   (A)   |     Lps.18      |");
                 System.out.println("");
            System.out.println("Ingrese a que Tipo de Proveedor desesa comprarle (A,B,C)");
            Proveedor=lea.next().toUpperCase();
            while(!Proveedor.equals("A")&& !Proveedor.equals("B") && !Proveedor.equals("C")){
                System.out.println("ERROR, elija un Proveedor Correcto (A, B, C)");
                Proveedor=lea.next().toUpperCase();
            }
            
             System.out.println("Seleccione que Producto desea comprar acorde su codigo");
             ProductoCompra=lea.nextInt();
             while(ProductoCompra<1 && ProductoCompra>4){
                 System.out.println("Seleccione un Codigo de Producto acorde a la tabla (del 1 al 4)");
                 ProductoCompra=lea.nextInt();
             }
            
               //Igualar el Codigo Numeral con un String el nombre del producto que le Corresponde
               if(ProductoCompra==1){ 
                   ProductoSalida="Azucar";
               }else if(ProductoCompra==2){
                   ProductoSalida="Avena";
               }else if(ProductoCompra==3){
                   ProductoSalida="Trigo";
               }else if(ProductoCompra==4){
                   ProductoSalida="Maiz";
               }
             
           //A - 1 4 | B 2 3 | C 2 | 
           if(Proveedor.equals("A")){
                if(ProductoCompra==1 || ProductoCompra==4){
                       SePuedeComprar=true;
                       
                   }else{
                       if(ProductoCompra==3 || ProductoCompra==2){
                           SePuedeComprar=false;
                       }
                       System.out.println("El Proveedor "+Proveedor+" no posee el Producto: "+ProductoSalida);
                }
           }
           
           else if(Proveedor.equals("B")){
                   if(ProductoCompra==2 || ProductoCompra==3){
                       SePuedeComprar=true;
                       
                   }else{
                       if(ProductoCompra==4 || ProductoCompra==1){
                           SePuedeComprar=false;
                       }
                       System.out.println("El Proveedor "+Proveedor+" no posee el Producto: "+ProductoSalida);
                }
           } 
           
           
           else if(Proveedor.equals("C")){
              if(ProductoCompra==2){
                       SePuedeComprar=true;
                       
                   }else{
                       if(ProductoCompra==4 || ProductoCompra==2 || ProductoCompra==1){
                           SePuedeComprar=false;
                       }
                       System.out.println("El Proveedor "+Proveedor+" no vende el producto: "+ProductoSalida);
                } 
           }
            
           if(SePuedeComprar==true){
                     System.out.println("Ingrese la Cantidad en Kilogramos de "+ProductoSalida+ " que desea comprarle al Proveedor: "+Proveedor);
                     CantidadProducto=lea.nextInt();
                      while(CantidadProducto<1){
                         System.out.println("Seleccione un Numero Valido de Producto a Comprar");
                          CantidadProducto=lea.nextInt();
                     }
                      
               
          
            //Calcular las Variables de las Compras
            if(ProductoCompra==1){ 
                   PrecioCompra=25;
               }else if(ProductoCompra==2 && Proveedor.equals("B")){
                   PrecioCompra=20;
               }else if(ProductoCompra==2 && Proveedor.equals("C")){
                   PrecioCompra=22;
               }else if(ProductoCompra==3){
                   PrecioCompra=30;
               }else if(ProductoCompra==4){
                   PrecioCompra=18;
               }
            
            Total=PrecioCompra*CantidadProducto;
               
            if(Total<=DineroCaja){
               System.out.println("-----------------------------");
               System.out.println("         **FACTURA**");
               System.out.println("Proveedor: "+Proveedor);
               System.out.println("   Producto: "+ProductoSalida);
               System.out.println("   Cantidad: "+CantidadProducto);
               System.out.println("   Precio Unitario: Lps. "+PrecioCompra);
               System.out.println("Total: "+Total);
               System.out.println("-----------------------------");
              
               DineroCaja-=Total;
               NumeroDeCompras++;
               TotalCompras+=Total;
               
                //Sumar lo comprado al Stock que tenemos
               if(ProductoCompra==1){ 
                   StockAzucar+=CantidadProducto;
              }if(ProductoCompra==2){
                   StockAvena+=CantidadProducto;
              }if(ProductoCompra==3){
                   StockTrigo+=CantidadProducto;
              }if(ProductoCompra==4){
                   StockMaiz+=CantidadProducto; 
              }     
               
            }else{
                System.out.println("No se puede Pagar la Compra");
            }
            
           }
         
             
       if(Total>CompraMasAlta){
                CompraMasAlta=Total;
            }      
            
        }
        
         
         

        
         if(Menu==4){ //Reportes
             
             String ProductoEstrella="Azucar";
             int CantidadEstrella=VentasAzucar;
             
             if(CantidadEstrella<VentasAvena){
                 CantidadEstrella=VentasAvena;
                 ProductoEstrella="Avena";
             }if(CantidadEstrella<VentasTrigo){
                 CantidadEstrella=VentasTrigo;
                 ProductoEstrella="Trigo";
             }if(CantidadEstrella<VentasMaiz){
                 CantidadEstrella=VentasMaiz;
                 ProductoEstrella="Maiz";
             }
             
             
             
                System.out.println("-------------------------------------------------------------");
                System.out.println("                  ***REPORTES***");
                System.out.println("------");
                System.out.println("DINERO");
                System.out.println("------");
                System.out.println("  Dinero Actual en Caja: "+DineroCaja+" Lps.");
                System.out.println("  Dinero Almacenado en el Banco: "+DineroBanco+" Lps.");
                
                System.out.println("");
                
                System.out.println("--------------------------");
                System.out.println("COMPRAS Y VENTAS EN EL DIA");
                System.out.println("--------------------------");
                
                System.out.println("");
                
                System.out.println("------------------------------");
                System.out.println("VOLUMEN TOTAL COMPRAS & VENTAS");
                System.out.println("------------------------------");
                
                System.out.println("");
                
                System.out.println("---------------");
                System.out.println("MAYORES TOTALES");
                System.out.println("---------------");
                System.out.println("  La venta con Mayor Ganancia recaudo: "+VentaMasAlta+" Lps.");
                System.out.println("  La compra con Mayor dinero invertido fue de: "+CompraMasAlta+" Lps.");
                
                System.out.println("");
                
                System.out.println("-----------------");
                System.out.println("PRODUCTO ESTRELLA"); 
                System.out.println("-----------------");
                System.out.println("  El Producto Estrella fue: "+ProductoEstrella);
                System.out.println("  Con: "+CantidadEstrella+" ventas realizadas en el dia.");
                
                System.out.println("");
                
                System.out.println("-------");
                System.out.println("RANKING");
                System.out.println("--------");
                
                System.out.println("-------------------------------------------------------------");
                
            
        }
         
         
            //En Caso de Tener Caja Cerrada
            //Colocado Arriba del Cierre de caja, para que al cerrar la caja no lea este codigo, y haga la salida de pantalla unicamente cuanto este previamente cerrada
        if(Menu==2 || Menu==3 || Menu==5){
            if(EstadoDeCaja.equals("Cerrado")){
            System.out.println("|--------------------------------------------------------|");
            System.out.println("| No se puede Realizar esta Accion, la Caja esta Cerrada |");
            System.out.println("|--------------------------------------------------------|");
            }
        }
         
         if(Menu==5 && EstadoDeCaja.equals("Abierto")){ //Cierre de Caja
            EstadoDeCaja="Cerrado"; //Cambiar el estado de Caja
            double DepositoBanco=0;
             NumeroDeCompras=0; NumeroDeVentas=0; TotalVentas=0; TotalCompras=0; //Reioniciar Variables de Reportes
             VentasAzucar=0; VentasAvena=0; VentasTrigo=0; VentasMaiz=0;
             VentaMasAlta=0; CompraMasAlta=0;
        
             System.out.println("Se posee: "+DineroCaja+" Lps. en caja");
             System.out.println("Se posee: "+DineroBanco+" Lps. en el Banco");
             System.out.println("");
             System.out.println("Ingrese la Cantidad que desea Depositar en el Banco");
             DepositoBanco=lea.nextDouble();
             while(DepositoBanco>DineroCaja*0.6){
                 System.out.println("*Lo maximo que puede ingresar es el 60% del Dinero en la Caja, lo cual representan: "+DineroCaja*0.6+" Lps*");
                  System.out.println("Ingrese una Cantidad permitida para depositar en el Banco");
                 DepositoBanco=lea.nextDouble();
             }
            DineroBanco+=DepositoBanco; 
             
             
             System.out.println("Se Ha Cerrado la Caja");
            
        }
         
         
         
          
         if(Menu==6){ //Salir del Sistema
              System.out.println("Fin del Dia, Cerrando el Sistema");
            
        }
         
         
         
        
     
           
        }while(Menu!=6);
    }
    
}
