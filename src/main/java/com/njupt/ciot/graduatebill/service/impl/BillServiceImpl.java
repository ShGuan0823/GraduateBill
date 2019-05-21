package com.njupt.ciot.graduatebill.service.impl;

import com.njupt.ciot.graduatebill.dao.BillDao;
import com.njupt.ciot.graduatebill.domain.Bill;
import com.njupt.ciot.graduatebill.domain.Student;
import com.njupt.ciot.graduatebill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author ShGuan
 * @Date 2019/5/7 17:24
 **/
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    BillDao billDao;

    @Override
    public Bill getByStuId(String stuId) {
        Student student = new Student();
        // 学号、姓名
        student.setStuId(stuId);
        student.setStuName(billDao.getStuName(stuId).trim());
        // 四六级
        student.setCET4(billDao.getCet4(stuId).trim());
        student.setCET6(billDao.getCet6(stuId).trim());
        // 书籍借阅量
        student.setBook(billDao.getBook(stuId));
        // 绩点
        student.setGrade(billDao.getGrade(stuId));
        // 等级考试
        student.setLevelExamList(billDao.getLevelExam(stuId));
        // 获奖情况
        student.setAwardList(billDao.getAwardList(stuId));
        Bill bill = new Bill();
        bill.setStudent(student);
//        bill.setBookSection();
        return bill;
    }
}