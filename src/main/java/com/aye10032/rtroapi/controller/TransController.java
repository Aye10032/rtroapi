package com.aye10032.rtroapi.controller;

import com.aye10032.rtroapi.dao.ITransDaoImpl;
import com.aye10032.rtroapi.data.APIException;
import com.aye10032.rtroapi.data.ResultVO;
import com.aye10032.rtroapi.pojo.TransList;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @program: rtroapi
 * @className: TransController
 * @Description: 翻译信息controller类
 * @version: v1.0
 * @author: Aye10032
 * @date: 2021/7/15 上午 9:57
 */
@RestController
public class TransController {

    @GetMapping("/getTransByVideoID")
    public List<TransList> getTransByVideoID(
            @RequestParam(value = "id", defaultValue = "-1") Integer id) {
        ITransDaoImpl dao = new ITransDaoImpl();

        if (id != -1) {

            List<TransList> transLists = dao.getTransByVideoID(id);
            if (transLists.isEmpty()){
                throw new APIException("没有翻译信息");
            }else {
                return transLists;
            }

        } else {
            throw new APIException("参数为空");
        }
    }

    @PostMapping("/addTrans")
    public Integer addTrans(@RequestBody @Valid TransList transList){
        ITransDaoImpl dao = new ITransDaoImpl();

        return dao.insertTrans(transList);
    }

}
