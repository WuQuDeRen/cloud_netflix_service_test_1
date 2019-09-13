package com.fj.boot.app.test;

/**
 * 延迟加载   利用内部枚举实现单例
 */
public class BeanContainer {
    /**
     * 获取Bean容器实例
     */
    public static BeanContainer getInstance() {
        return ContainerHolder.HOLDER.instance;
    }

    private enum ContainerHolder {
        HOLDER, B;
        private BeanContainer instance;

        ContainerHolder() {
            instance = new BeanContainer();
        }
    }


    public static void main(String[] args) {
        BeanContainer bean = new BeanContainer();
        System.out.println(ContainerHolder.class);
        System.out.println();

//        System.out.println(BeanContainer.getInstance());
//        System.out.println(BeanContainer.getInstance());
    }

}
