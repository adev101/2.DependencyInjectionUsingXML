package demoExam;

public class AnnualExam implements Exam {

	private static Horroscope horoscope;
	
	public AnnualExam(Horroscope hr) {
		 horoscope = hr;
	}
	
	
	@Override
	public String getExamResult() {
		// TODO Auto-generated method stub
		return "You passed";
	}




	@Override
	public String getFuture() {
		// TODO Auto-generated method stub
		return horoscope.getHorroscope();
	}

}
