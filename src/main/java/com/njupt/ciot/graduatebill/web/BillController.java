package com.njupt.ciot.graduatebill.web;

import com.njupt.ciot.graduatebill.common.constants.RequestParamNameConstants;
import com.njupt.ciot.graduatebill.common.result.Result;
import com.njupt.ciot.graduatebill.common.result.ResultGenerator;
import com.njupt.ciot.graduatebill.domain.Bill;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description TODO
 * @Author ShGuan
 * @Date 2019/5/7 17:16
 **/
public class BillController {


    @GetMapping("/stuBill/{stuId}")
    public Result<Bill> getByStuId(@PathVariable(RequestParamNameConstants.STUID) String stuId) {
        return ResultGenerator.genSuccessResult(null);
    }
}