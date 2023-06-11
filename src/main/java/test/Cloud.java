package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述:
 *
 * @author 张森
 * @version 1.0
 * @date 2023/5/24 14:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//云or边缘云
public class Cloud {
    public int id;//前c个为云 后e个为边缘云
    public double lat;//经度
    public double lon;//维度
}
