package com.aye10032.rtroapi.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @program: rtroapi
 * @className: TransList
 * @Description: 翻译信息实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/14 下午 6:27
 */
@Data
@NoArgsConstructor
public class TransList {

    private Integer id;

    @NotBlank(message = "必须绑定视频ID")
    private Integer fromid;
    @NotBlank(message = "来源账号不能为空")
    private Long fromqq;
    @NotBlank(message = "翻译信息不能为空")
    private String msg;
    @NotBlank(message = "添加时间不能为空")
    private Date time;

}
