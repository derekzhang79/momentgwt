package org.sgx.momentgwttest1.client;

import java.util.Date;

import org.sgx.momentgwt.client.Moment;
import org.sgx.momentgwttest1.client.tests.InternationalizationTest1;

import com.google.gwt.core.client.EntryPoint;

public class MomentGwtTest1EP implements EntryPoint {

	@Override
	public void onModuleLoad() {
		test1();
	} 
	private void test1() {
		System.out.println(Moment.moment());
		System.out.println(Moment.moment(new Date()).add(2, "days").format("MMMM Do YYYY, h:mm:ss a"));
		
		new InternationalizationTest1().test1(); 
	}

}
