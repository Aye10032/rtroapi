package com.aye10032.rtroapi.controller;

import com.aye10032.rtroapi.dao.IVideoDaoImpl;
import com.aye10032.rtroapi.pojo.VideoInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: rtroapi
 * @className: VideosController
 * @Description: 视频信息相关controller
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/5/21 下午 3:31
 */

@RestController
public class VideosController {

    @GetMapping("/videos")
    public void videos(
            @RequestParam(value = "id", defaultValue = "-1") Integer id,
            @RequestParam(value = "has_done", defaultValue = "-1") Integer has_done,
            @RequestParam(value = "need_trans", defaultValue = "-1") Integer need_trans) {
        IVideoDaoImpl dao = new IVideoDaoImpl();
        if (id != -1) {
            VideoInfo videoInfo = dao.getVideoByID(id).get(0);
        }
    }

    @GetMapping("/getAllVideo")
    public List<VideoInfo> getAllVideo(){
        IVideoDaoImpl dao = new IVideoDaoImpl();

        return dao.getAllVideo();
    }

}
