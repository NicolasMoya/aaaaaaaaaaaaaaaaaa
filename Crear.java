/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author NicolasMoyaa
 */
public class Crear {
    
    
        public void CrearBancos(){
            
            
            Banco banc1 = new Banco(01,"Banco1","Direccion 1",112559);
            Banco banc2 = new Banco(02,"Banco2","Direccion 2",121989);
            Banco banc3 = new Banco(01,"Banco3","Direccion 3",887976);    
            
            
            
        }
        
        public void CrearClientes() throws ParseException{
            
            
            String date_s = " 2020-08-31"; 
            SimpleDateFormat dt = new SimpleDateFormat("yy-mm-dd"); 
            Date date = dt.parse(date_s); 
            ArrayList<Cuenta> arraycu = new ArrayList<>();
            ArrayList<Tarjeta> arraytarj = new ArrayList<>();
            ArrayList<Cliente> arrcli = new ArrayList<>();
            

            //Creacion clientes,cuentas y tarjetas
            Cliente cli1 = new Cliente(01,001,"Cliente1","Direccion1",1122);
            Cuenta cuen1 = new Cuenta(123,cli1.getNum_Cliente(),"vista",2598);
            Tarjeta tar1 = new Tarjeta(1,cuen1.getNumCuenta(),cli1.getNum_Cliente(),date);
            arraytarj.add(tar1);
            arraycu.add(cuen1);
            cli1.setCuenta(arraycu);
            cli1.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli2 = new Cliente(02,002,"Cliente2","Direccion2",11226);
            Cuenta cuen2 = new Cuenta(122,cli2.getNum_Cliente(),"vista",987765);
            Tarjeta tar2 = new Tarjeta(2,cuen2.getNumCuenta(),cli2.getNum_Cliente(),date);
            Cuenta cuen3 = new Cuenta(124,cli2.getNum_Cliente(),"vista",98877252);
            Tarjeta tar3 = new Tarjeta(3,cuen3.getNumCuenta(),cli2.getNum_Cliente(),date);
            arraytarj.add(tar2);
            arraytarj.add(tar3);
            arraycu.add(cuen1);
            arraycu.add(cuen2);
            cli2.setCuenta(arraycu);
            cli2.setTarjeta(arraytarj);
            
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli3 = new Cliente(03,003,"Cliente3","Direccion3",112267);
            Cuenta cuen4 = new Cuenta(1254,cli3.getNum_Cliente(),"vista",26598);
            Tarjeta tar4 = new Tarjeta(4,cuen4.getNumCuenta(),cli3.getNum_Cliente(),date);
            arraytarj.add(tar4);
            arraycu.add(cuen4);
            cli3.setCuenta(arraycu);
            cli3.setTarjeta(arraytarj);
            
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli4 = new Cliente(04,004,"Cliente4","Direccion4",1122698);
            Cuenta cuen5 = new Cuenta(1254,cli4.getNum_Cliente(),"vista",98765);
            Tarjeta tar5 = new Tarjeta(5,cuen5.getNumCuenta(),cli4.getNum_Cliente(),date);
            arraytarj.add(tar5);
            arraycu.add(cuen5);
            cli4.setCuenta(arraycu);
            cli4.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli5 = new Cliente(05,005,"Cliente5","Direccion5",1122699);
            Cuenta cuen6 = new Cuenta(11,cli5.getNum_Cliente(),"vista",987665);
            Tarjeta tar6 = new Tarjeta(6,cuen6.getNumCuenta(),cli5.getNum_Cliente(),date);
            arraytarj.add(tar6);
            arraycu.add(cuen6);
            cli5.setCuenta(arraycu);
            cli5.setTarjeta(arraytarj);
            
            
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli6 = new Cliente(06,006,"Cliente6","Direccion6",1122699);
            Cuenta cuen7 = new Cuenta(111,cli6.getNum_Cliente(),"vista",98776);
            Tarjeta tar7 = new Tarjeta(7,cuen7.getNumCuenta(),cli6.getNum_Cliente(),date);
            arraytarj.add(tar7);
            arraycu.add(cuen7);
            cli6.setCuenta(arraycu);
            cli6.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli7 = new Cliente(07,007,"Cliente7","Direccion7",1122699);
            Cuenta cuen8 = new Cuenta(1111,cli7.getNum_Cliente(),"vista",897774);
            Tarjeta tar8 = new Tarjeta(8,cuen8.getNumCuenta(),cli7.getNum_Cliente(),date);
            arraytarj.add(tar8);
            arraycu.add(cuen8);
            cli7.setCuenta(arraycu);
            cli7.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli8 = new Cliente(8,118,"Cliente8","Direccion8",1122699);
            Cuenta cuen9 = new Cuenta(1111,cli8.getNum_Cliente(),"vista",987765);
            Tarjeta tar9 = new Tarjeta(9,cuen9.getNumCuenta(),cli8.getNum_Cliente(),date);
            arraytarj.add(tar9);
            arraycu.add(cuen9);
            cli8.setCuenta(arraycu);
            cli8.setTarjeta(arraytarj);
            
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli9 = new Cliente(9,489,"Cliente9","Direccion9",1122699);
            Cuenta cuen10 = new Cuenta(11111,cli9.getNum_Cliente(),"vista",897765);
            Tarjeta tar10 = new Tarjeta(10,cuen10.getNumCuenta(),cli9.getNum_Cliente(),date);
            arraytarj.add(tar10);
            arraycu.add(cuen10);
            cli9.setCuenta(arraycu);
            cli9.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli10 = new Cliente(10,010,"Cliente10","Direccion10",11226997);
            Cuenta cuen11 = new Cuenta(111111,cli10.getNum_Cliente(),"vista",98776);
            Tarjeta tar11 = new Tarjeta(11,cuen11.getNumCuenta(),cli10.getNum_Cliente(),date);
            arraytarj.add(tar11);
            arraycu.add(cuen11);
            cli10.setCuenta(arraycu);
            cli10.setTarjeta(arraytarj);
            
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli11 = new Cliente(11,011,"Cliente11","Direccion11",112269988);
            Cuenta cuen12 = new Cuenta(1111111,cli11.getNum_Cliente(),"vista",897866);
            Tarjeta tar12 = new Tarjeta(12,cuen12.getNumCuenta(),cli11.getNum_Cliente(),date);
            arraytarj.add(tar12);
            arraycu.add(cuen12);
            cli11.setCuenta(arraycu);
            cli11.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli12 = new Cliente(12,012,"Cliente12","Direccion12",11226996);
            Cuenta cuen13 = new Cuenta(11111111,cli12.getNum_Cliente(),"vista",987774);
            Tarjeta tar13 = new Tarjeta(13,cuen13.getNumCuenta(),cli12.getNum_Cliente(),date);
            arraytarj.add(tar13);
            arraycu.add(cuen13);
            cli12.setCuenta(arraycu);
            cli12.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli13 = new Cliente(13,013,"Cliente1","Direccion",1122699);
            Cuenta cuen14 = new Cuenta(111111111,cli13.getNum_Cliente(),"vista",9998233);
            Tarjeta tar14 = new Tarjeta(14,cuen14.getNumCuenta(),cli13.getNum_Cliente(),date);
            arraytarj.add(tar14);
            arraycu.add(cuen14);
            cli13.setCuenta(arraycu);
            cli13.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli14 = new Cliente(14,014,"Cliente1","Direccion",1122699);
            Cuenta cuen15 = new Cuenta(1111111111,cli14.getNum_Cliente(),"vista",9988213);
            Tarjeta tar15 = new Tarjeta(15,cuen15.getNumCuenta(),cli14.getNum_Cliente(),date);
            arraytarj.add(tar15);
            arraycu.add(cuen15);
            cli14.setCuenta(arraycu);
            cli14.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli15 = new Cliente(15,015,"Cliente1","Direccion",1122699);
            Cuenta cuen16 = new Cuenta(11113111,cli15.getNum_Cliente(),"vista",10000);
            Tarjeta tar16 = new Tarjeta(16,cuen16.getNumCuenta(),cli15.getNum_Cliente(),date);
            arraytarj.add(tar16);
            arraycu.add(cuen16);
            cli15.setCuenta(arraycu);
            cli15.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli16 = new Cliente(16,016,"Cliente1","Direccion",1122699);
            Cuenta cuen17 = new Cuenta(1451111,cli16.getNum_Cliente(),"vista",411988);
            Tarjeta tar17 = new Tarjeta(17,cuen17.getNumCuenta(),cli6.getNum_Cliente(),date);
            arraytarj.add(tar17);
            arraycu.add(cuen17);
            cli16.setCuenta(arraycu);
            cli16.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli17 = new Cliente(17,017,"Cliente1","Direccion",1122699);
            Cuenta cuen18 = new Cuenta(116589111,cli17.getNum_Cliente(),"vista",9987776);
            Tarjeta tar18 = new Tarjeta(18,cuen18.getNumCuenta(),cli17.getNum_Cliente(),date);
            arraytarj.add(tar18);
            arraycu.add(cuen18);
            cli17.setCuenta(arraycu);
            cli17.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli18 = new Cliente(18,108,"Cliente1","Direccion",1122699);
            Cuenta cuen19 = new Cuenta(11115681,cli18.getNum_Cliente(),"vista",8787765);
            Tarjeta tar19 = new Tarjeta(19,cuen19.getNumCuenta(),cli18.getNum_Cliente(),date);
            arraytarj.add(tar19);
            arraycu.add(cuen19);
            cli18.setCuenta(arraycu);
            cli18.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli19 = new Cliente(19,109,"Cliente1","Direccion",1122699);
            Cuenta cuen20 = new Cuenta(116588111,cli19.getNum_Cliente(),"vista",9877764);
            Tarjeta tar20 = new Tarjeta(20,cuen20.getNumCuenta(),cli19.getNum_Cliente(),date);
            arraytarj.add(tar20);
            arraycu.add(cuen20);
            cli19.setCuenta(arraycu);
            cli19.setTarjeta(arraytarj);
            
            arraycu.clear();
            arraytarj.clear();
            Cliente cli20 = new Cliente(20,020,"Cliente20","Direccion20",11822699);
            Cuenta cuen21 = new Cuenta(1118995311,cli20.getNum_Cliente(),"vista",987776);
            Tarjeta tar21 = new Tarjeta(21,cuen21.getNumCuenta(),cli20.getNum_Cliente(),date);
            arraytarj.add(tar21);
            arraycu.add(cuen21);
            cli20.setCuenta(arraycu);
            cli20.setTarjeta(arraytarj);
            
            arrcli.add(cli1);
            arrcli.add(cli2);
            arrcli.add(cli3);
            arrcli.add(cli4);
            arrcli.add(cli5);
            arrcli.add(cli6);
            arrcli.add(cli7);
            arrcli.add(cli8);
            arrcli.add(cli9);
            arrcli.add(cli10);
            arrcli.add(cli11);
            arrcli.add(cli12);
            arrcli.add(cli13);
            arrcli.add(cli14);
            arrcli.add(cli15);
            arrcli.add(cli16);
            arrcli.add(cli17);
            arrcli.add(cli18);
            arrcli.add(cli19);
            arrcli.add(cli20);
            
            
            
        
        }
        
        
        
}
