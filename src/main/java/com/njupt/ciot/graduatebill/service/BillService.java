package com.njupt.ciot.graduatebill.service;

import com.njupt.ciot.graduatebill.domain.Bill;

/**
 * @Description TODO
 * @Author ShGuan
 * @Date 2019/5/7 17:24
 **/
public interface BillService {

    Bill getByStuId(String stuId);
}
