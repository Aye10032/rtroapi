package com.aye10032.rtroapi.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String url;
    private boolean hasdone;
    private boolean needtrans;
    private boolean istrans;
    private Long fromeqq;
    private String description;
    private Date time;

}
