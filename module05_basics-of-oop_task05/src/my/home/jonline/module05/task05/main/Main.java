package my.home.jonline.module05.task05.main;

import my.home.jonline.module05.task05.service.CompositionMaker;

public class Main {

	public static void main(String[] args) {
		/*
		 * App uses builder pattern to construct flower composition object
		 * and factory pattern to produce flower objects
		 */
		String request1 = "flower1=camomile+white+1&wrapping=paper+white";//flower camomile is not available
		String request2 = "flower1=rose+red+-20&wrapping=none+none";//quantity -20 is unacceptable
		String request3 = "flower1=tulip+yellow+15&flower2=lily+white+10&wrapping=basket+yellow";
		String request4 = "flower1=rose+teal+101&&wrapping=paper+white";

		CompositionMaker maker = new CompositionMaker();
		maker.getRequest(request1);
		System.out.println();
		maker.getRequest(request2);
		System.out.println();
		maker.getRequest(request3);
		System.out.println();
		maker.getRequest(request4);
	}

}
