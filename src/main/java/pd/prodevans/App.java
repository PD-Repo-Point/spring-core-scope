package pd.prodevans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pd.prodevans.service.EmailService;

public class App 
{
    public static void main( String[] args )
    {
        // USED SPRING-WEB.XML
        // Singleton Scope - per instance per IOC Container (Application Context)
        /*ApplicationContext context1 = new ClassPathXmlApplicationContext("spring-web.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-web.xml");

        EmailService emailService1 = context1.getBean("emailService", EmailService.class);
        System.out.println(emailService1);

        EmailService emailService2 = context2.getBean("emailService", EmailService.class);
        System.out.println(emailService2);
         */

        // Prototype Scope - per instance per bean request
        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring-web.xml");

        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService1);

        EmailService emailService2 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService2);*/

        // ANNOTATION CONFIGURATION - Java Config
        // Singleton Scope -
        /*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean("emailService", EmailService.class);
        System.out.println(emailService);

        EmailService emailService1 = context.getBean("emailService", EmailService.class);
        System.out.println(emailService1);*/

        //Prototype Scope
        //prototypeEmailService
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmailService emailService = context.getBean("prototypeEmailService", EmailService.class);
        System.out.println(emailService);

        EmailService emailService1 = context.getBean("prototypeEmailService", EmailService.class);
        System.out.println(emailService1);



    }
}
