package com.aye10032.rtroapi.temputil;

import java.util.Objects;

/**
 * @program: rtroapi
 * @className: OldVideoPojo
 * @Description: 旧版视频实体类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/13 下午 7:11
 */
public class OldVideoPojo {

    public Integer ID;
    public String URL;
    public boolean HASDONE;
    public boolean NEEDTRANS;
    public boolean ISTRANS;
    public Long FROMEQQ;
    public String DESCRIPTION;
    public String TIME;

    public OldVideoPojo() {
    }

    public OldVideoPojo(Integer ID, String URL, boolean HASDONE, boolean NEEDTRANS, boolean ISTRANS, Long FROMEQQ, String DESCRIPTION, String TIME) {
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

    public Long getFROMEQQ() {
        return FROMEQQ;
    }

    public void setFROMEQQ(Long FROMEQQ) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldVideoPojo that = (OldVideoPojo) o;
        return HASDONE == that.HASDONE && NEEDTRANS == that.NEEDTRANS && ISTRANS == that.ISTRANS && Objects.equals(ID, that.ID) && Objects.equals(URL, that.URL) && Objects.equals(FROMEQQ, that.FROMEQQ) && Objects.equals(DESCRIPTION, that.DESCRIPTION) && Objects.equals(TIME, that.TIME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, URL, HASDONE, NEEDTRANS, ISTRANS, FROMEQQ, DESCRIPTION, TIME);
    }

    @Override
    public String toString() {
        return "OldVideoPojo{" +
                "ID=" + ID +
                ", URL='" + URL + '\'' +
                ", HASDONE=" + HASDONE +
                ", NEEDTRANS=" + NEEDTRANS +
                ", ISTRANS=" + ISTRANS +
                ", FROMEQQ=" + FROMEQQ +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", TIME='" + TIME + '\'' +
                '}';
    }
}
