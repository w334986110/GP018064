package com.gupao.homework.factory.sample;

import com.gupao.homework.factory.IAppliances;
import com.gupao.homework.factory.model.Gree;
import com.gupao.homework.factory.model.Haier;
import com.gupao.homework.factory.model.Midea;

public class WorkshopFactory {

    /*
     * 这种入参不可控，对方可以传任何东西过来
     */
    public IAppliances productAppliances(String name ){
        if("海尔".equals(name)){
            return new Haier();
        }else if("格力".equals(name)){
            return new Gree();
        } else if("美的".equals(name)){
            return new Midea();
        } else {
            System.out.println("无效的品牌");
            return null;
        }
    }

    /**
     * 采用字节码的方式，直接接受类字节
     */
    public IAppliances appliancesClass(Class<? extends IAppliances> clazz){
        if(clazz != null){
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
