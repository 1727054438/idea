package test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 功能描述:
 *
 * @author 张森
 * @version 1.0
 * @date 2023/5/24 15:06
 */
//通用型------边缘实例类型      xlarge---一个边缘云  small--一个边缘云
//实例类型
public class InstanceType {
    public int id;//实例类型id
    public double storage;//存储能力
    public ArrayList<Price> prices;//数组大小为c+e 表示该实例类型在每个云中的价格 如果不在该云中则用无穷来表示
    public ArrayList<Integer> quantity;//数组大小为c+e  表示该实例类型在每个云的数量 一般为无穷
 }
