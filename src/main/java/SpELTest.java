import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.bean.Address;
import com.bean.UID;

public class SpELTest {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expHello = parser.parseExpression("'Hello World'");
		System.out.println("Literal Example= " +(String) expHello.getValue());

		Expression expSubString = parser.parseExpression("'Hello World'.substring(4, 7)");
		System.out.println("Literal SubString Example= " +(String) expSubString.getValue());

		Expression expBooExpression = parser.parseExpression("'Hello'.equals('World')");
		System.out.println("Relational Example= " +expBooExpression.getValue());

		UID uid = new UID();
		uid.setFirstName("Pranshi");
		uid.setLastName("Dhingra");
		uid.setDob(new Date(2011 -1900, 10, 03)); // 1900 is for date adjustment
		System.out.println(uid.getDob());
		Address personAddress = new Address(947, "Pavani Enclave", "Marathahalli", "Bangalore", "Karnataka", 560037);
		StandardEvaluationContext uidContext = new StandardEvaluationContext(uid);
		parser.parseExpression("address").setValue(uidContext, personAddress);
		System.out.println("Assignment Test =" + uid.getAddress()); // equal to uid.setAddress( personAddress);
		uidContext.setVariable("newDOB", new Date(2011 -1900,10,15));
		uidContext.setVariable("randomUID", Math.ceil((Math.random()*100000)));
		parser.parseExpression("dob = #newDOB").getValue(uidContext);
		parser.parseExpression("uid = #randomUID").getValue(uidContext);
		System.out.println(uid.getDob());
		
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"services.xml"});
			UID uidBean = (UID)context.getBean("xmlUID");
			System.out.println(uidBean.getDob());
			
			System.out.println("Expression Language Test = " + uidBean.getAddress());
			uidBean = (UID)context.getBean("xmlUIDTest-2");
			System.out.println("xmlUIDTest-2 Ref Test = " + uidBean.getAddress());
			
			uidBean = (UID)context.getBean("uidBean");
			System.out.println("Office Address be Annotation Test = " + uidBean.getOfficeAddress());
		
	}

}
