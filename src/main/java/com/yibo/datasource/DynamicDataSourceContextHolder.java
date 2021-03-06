package com.yibo.datasource;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: huangyibo
 * @Date: 2020/6/10 22:25
 * @Description: 动态数据源上下文管理
 */
public class DynamicDataSourceContextHolder {

    //存放当前线程使用的数据源类型信息
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    //存放数据源id
    public static List<String> dataSourceIds = new ArrayList<String>();

    //设置数据源
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    //获取数据源
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    //清除数据源
    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId
     * @return
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}
