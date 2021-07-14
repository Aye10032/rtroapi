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

    public Integer id;
    public String url;
    public boolean hasdone;
    public boolean needtrans;
    public boolean istrans;
    public Long fromeqq;
    public String description;
    public Date time;
}
