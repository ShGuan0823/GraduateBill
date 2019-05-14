package com.njupt.ciot.graduatebill.dao;


import com.njupt.ciot.graduatebill.domain.Grade;
import com.njupt.ciot.graduatebill.domain.LevelExam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillDao {

    String getCet4(String stuId);

    String getCet6(String stuId);

    String getBookNum(String stuId);

    List<LevelExam> getLevelExam(String stuId);

    List<Grade> getGrade(String stuId);
    
}
