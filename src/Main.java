import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.abstr.AbstractFactory;
import com.gupao.homework.factory.abstr.AppliancesFactory;
import com.gupao.homework.factory.function.GreeFactory;
import com.gupao.homework.factory.function.IAppliancesFactory;
import com.gupao.homework.factory.model.Gree;
import com.gupao.homework.factory.sample.WorkshopFactory;

public class Main {

    public static void main(String[] args) {
        // 简单工厂
        testSample();

        // 方法工厂
        testFunction();

        // 抽象工厂
        testAbstract();
    }

    public static void testSample(){
        WorkshopFactory factory = new WorkshopFactory();
        IAppliances IAppliances = factory.productAppliances("格力");
        System.out.println(IAppliances.getFactoryName());

        WorkshopFactory factory2 = new WorkshopFactory();
        IAppliances IAppliances2 = factory2.appliancesClass(Gree.class);
        System.out.println(IAppliances2.getFactoryName());
    }

    public static void testFunction(){
        IAppliancesFactory factory = new GreeFactory();
        IAppliances iAppliances = factory.getWorkshopName();
        System.out.println(iAppliances.getFactoryName());
    }

    public static void testAbstract(){
        AppliancesFactory factory = new AppliancesFactory();
        IAppliances iAppliances = factory.getGree();
        System.out.println(iAppliances.getFactoryName());
    }
}
