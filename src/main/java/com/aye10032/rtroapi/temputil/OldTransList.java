package com.aye10032.rtroapi.temputil;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: rtroapi
 * @className: OldTransList
 * @Description: 老版翻译列表实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:31
 */
@Data
@NoArgsConstructor
public class OldTransList {

    private Integer id;
    private Integer fromid;
    private Long fromqq;
    private String msg;
    private String time;

}
