package moving;
public class Moved{
	
	public static void main(String[] args){

		int local= 34;
		int cap_camion = 9;
		int appart = 0;
		int camion = 0;

		while (local>0){
	          //Charger
			while ((camion<cap_camion)&&(local>0)){
				local--;
				camion++;
			}
				System.out.println("un voyage de " + camion + " cartons ");
			   //decharger
			while (camion>0){
				camion--;
				appart++;  
			}
		}
		
	}

}