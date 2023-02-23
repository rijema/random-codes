import java.util.Date;
import java.time.Month;
import java.time.LocalDate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public class WorkingwithDates {
   	public static void getDayMonthYear(String date)
	{

		LocalDate dataRecebida
			= LocalDate.parse(date);

		int dia = dataRecebida.getDayOfMonth();

		Month mes = dataRecebida.getMonth();

		int ano = dataRecebida.getYear();

		System.out.print("Dia: " + dia);
		System.out.print("| Mes: " + mes);
		System.out.print(" | Ano: " + ano + "\n");
	}
	
	public static void getDMY(String dia,String mes, String ano){
		System.out.println(dia + "/" + mes + "/" + ano);
	}
	
	public static void getDMYTC(String dataResult){
	     SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyy/MM/dd");
      
              try {
                 Date dataFormatadaDois = dataFormatada.parse(dataResult);
                 
                 System.out.println(dataFormatadaDois.toString());
              }
                    catch (Exception e) {
                 System.out.println(e);
              }

	}
	
	public static void getDateUsingCalendar(){
	    Calendar c = Calendar.getInstance();
        		c.set(2023, Calendar.FEBRUARY, 23);
        		Date data = c.getTime();
        		System.out.println("Data atual sem formatação: "+ data);

		DateFormat formataData = DateFormat.getDateInstance();
		System.out.println("Data atual com formatação: "+ formataData.format(data));
	}
	

	public static void main(String args[])
	{
	    String date = "2020-07-18";
		String dateNF = "20230223";
		String dateF = "2021/02/23";
		
		getDayMonthYear(date);
		
		getDMY(dateNF.substring(0, 4),dateNF.substring(4, 6),dateNF.substring(6, 8));
		
		getDMYTC(dateF);
		
		getDateUsingCalendar();
	}
}