package moving;
public class Moving{
	public String sayMoved(){
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
		   //decharger
			while (camion>0){
				camion--;
				appart++;  
			}
		}
		return "un voyage de " + camion + " cartons ";
	}
}
