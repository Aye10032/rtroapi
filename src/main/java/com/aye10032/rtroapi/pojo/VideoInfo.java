package com.aye10032.rtroapi.pojo;

import java.util.Date;

/**
 * @program: rtroapi
 * @className: Video
 * @Description: 视频实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/4/22 下午 1:14
 */
public class VideoInfo {

    public Integer ID;
    public String URL;
    public boolean HASDONE;
    public boolean NEEDTRANS;
    public boolean ISTRANS;
    public Integer FROMEQQ;
    public String DESCRIPTION;
    public String TIME;

    public VideoInfo() {
    }

    public VideoInfo(Integer ID, String URL, boolean HASDONE, boolean NEEDTRANS, boolean ISTRANS, Integer FROMEQQ, String DESCRIPTION, String TIME) {
        this.ID = ID;
        this.URL = URL;
        this.HASDONE = HASDONE;
        this.NEEDTRANS = NEEDTRANS;
        this.ISTRANS = ISTRANS;
        this.FROMEQQ = FROMEQQ;
        this.DESCRIPTION = DESCRIPTION;
        this.TIME = TIME;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public boolean isHASDONE() {
        return HASDONE;
    }

    public void setHASDONE(boolean HASDONE) {
        this.HASDONE = HASDONE;
    }

    public boolean isNEEDTRANS() {
        return NEEDTRANS;
    }

    public void setNEEDTRANS(boolean NEEDTRANS) {
        this.NEEDTRANS = NEEDTRANS;
    }

    public boolean isISTRANS() {
        return ISTRANS;
    }

    public void setISTRANS(boolean ISTRANS) {
        this.ISTRANS = ISTRANS;
    }

    public Integer getFROMEQQ() {
        return FROMEQQ;
    }

    public void setFROMEQQ(Integer FROMEQQ) {
        this.FROMEQQ = FROMEQQ;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getTIME() {
        return TIME;
    }

    public void setTIME(String TIME) {
        this.TIME = TIME;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "ID=" + ID +
                ", URL='" + URL + '\'' +
                ", HASDONE=" + HASDONE +
                ", NEEDTRANS=" + NEEDTRANS +
                ", ISTRANS=" + ISTRANS +
                ", FROMEQQ=" + FROMEQQ +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", TIME=" + TIME +
                '}';
    }
}
