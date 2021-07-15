package com.aye10032.rtroapi.temputil;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @program: rtroapi
 * @className: OldVideoPojo
 * @Description: 旧版视频实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/13 下午 7:11
 */
@Data
@NoArgsConstructor
public class OldVideo {

    public Integer ID;
    public String URL;
    public boolean HASDONE;
    public boolean NEEDTRANS;
    public boolean ISTRANS;
    public Long FROMEQQ;
    public String DESCRIPTION;
    public String TIME;

}
