package com.aye10032.rtroapi.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

/**
 * @program: rtroapi
 * @className: Video
 * @Description: 视频实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/4/22 下午 1:14
 */
@Data
@NoArgsConstructor
public class VideoInfo {

    private Integer id;

    @NotNull(message = "链接信息不能为空")
    @URL(message = "不是合法链接")
    private String url;

    @NotNull(message = "完成状态不能为空")
    private boolean hasdone;

    @NotNull(message = "翻译需求不能为空")
    private boolean needtrans;

    @NotNull(message = "翻译状态不能为空")
    private boolean istrans;

    @NotNull(message = "来源不能为空")
    private Long fromqq;

    private String description;

    @NotNull(message = "日期不能为空")
    private Long time;

}
