package com.njupt.ciot.graduatebill.dao;


import com.njupt.ciot.graduatebill.domain.Award;
import com.njupt.ciot.graduatebill.domain.Grade;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BillDao {

    String getCet4(String stuId);

    String getCet6(String stuId);

    Integer getBookNum(String stuId);

    String getStuName(String stuId);

    List<String> getLevelExam(String stuId);

    Grade getGrade(String stuId);

    List<Award> getAwardList(String stuId);
    
}
