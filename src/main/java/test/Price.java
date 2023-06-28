package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述:
 *
 * @author 张森
 * @version 1.0
 * @date 2023/5/24 15:11
 */
//每个云或者边缘的价格
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    public double storagePrice;//存储价格
    public double bangWidthPrice;//带宽价格
    public double getPrice;//Get价格
}
