import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanSecond =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat oneBeanCat =
                (Cat) applicationContext.getBean("cat");

        Cat twoBeanCat =
                (Cat) applicationContext.getBean("cat");
    }
}
