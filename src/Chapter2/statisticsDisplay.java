package Chapter2;

public class statisticsDisplay extends Display implements Observer{

	@Override
	public void display() {
		System.out.printf("statitics Display: \ntemp :%s ,pressure: %s ,humidity:%s \n",getTemp(),getPressure(),getHumidity());
		
	}
	@Override
	public void update() {
		float temp=weatherdata.getTemp();
		float pressure=weatherdata.getPressure();
		float humditiy=weatherdata.getHumidity();
		
		this.setHumidity(humditiy);
		this.setPressure(pressure);
		this.setTemp(temp);
		
		display();
		
		
	}
}
