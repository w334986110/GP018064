import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.abstr.GreeAppliancesFactory;
import com.gupao.homework.factory.abstr.HaierAppliancesFactory;
import com.gupao.homework.factory.function.GreeFactory;
import com.gupao.homework.factory.function.IAppliancesFactory;
import com.gupao.homework.factory.model.Gree;
import com.gupao.homework.factory.sample.WorkshopFactory;
import com.gupao.homework.proxy.ITrustee;
import com.gupao.homework.proxy.MyAgency;
import com.gupao.homework.proxy.Target;

public class Main {

    public static void main(String[] args) {
        // 简单工厂
        //testSample();

        // 方法工厂
        //testFunction();

        // 抽象工厂
        //testAbstract();

        // JDK动态代理
        testMyProxy();
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
        GreeAppliancesFactory factory = new GreeAppliancesFactory();
        factory.createColdAir().cold();

        HaierAppliancesFactory haierAppliancesFactory = new HaierAppliancesFactory();
        haierAppliancesFactory.createFreezing().freezing();
    }

    public static void testMyProxy(){
        try {

            ITrustee obj = (ITrustee) new MyAgency().getInstance(new Target());
            System.out.println(obj.getClass());
            obj.goodJob();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
