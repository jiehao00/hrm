package com.service;

import com.pojo.CourseInfo;

import java.util.List;

/**
* @Description:    培训信息服务接口
* @Author:         jieHao
* @CreateDate:     2019/4/10 9:58
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/10 9:58
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface CourseService {

    /**
    * 方法实现说明  添加课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/10 10:00
    */
    int addCourse(CourseInfo courseInfo);


    /**
    * 方法实现说明 查询课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:02
    */
    List<CourseInfo> searchCourse(int start, int limit,CourseInfo courseInfo);


    /**
    * 方法实现说明 查询课程信息总数
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:02
    */
    int searchCourseCount();

    /**
    * 方法实现说明 删除课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:03
    */
    int delCourseInfo(Integer courseCode);


    /**
    * 方法实现说明 结课（人工）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:57
    */
    int endCourse(Integer courseCode);

    int updateCourseMessage(CourseInfo courseInfo);
}
