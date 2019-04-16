package com.controller;

import com.pojo.CourseInfo;
import com.pojo.DepartmentInfo;
import com.service.CascadeService;
import com.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description:    培训信息控制类
* @Author:         jieHao
* @CreateDate:     2019/4/10 9:50
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/10 9:50
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class CourseController {

    @Autowired
    private CascadeService cascadeService;
    @Autowired
    private CourseService courseService;


    /**
    * 方法实现说明   添加课程
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/10 10:02
    */
    @RequestMapping(value = "addCourse",method = RequestMethod.POST)
    @ResponseBody
    public Map addCourse(CourseInfo courseInfo){
        System.out.println("进入了方法");
        Map<String,Object>map=new HashMap<>();
        System.out.println(courseInfo.getCourseDepartment());
        DepartmentInfo departmentInfo=cascadeService.searchDepartmentById(Integer.valueOf(courseInfo.getCourseDepartment()));
        courseInfo.setCourseDepartment(departmentInfo.getDepartment());
        if(courseService.addCourse(courseInfo)>0){
            map.put("status",0);
            map.put("message","成功添加");
        }else {
            map.put("status",1);
            map.put("message","添加失败");
        }
        return map;
    }

    /**
    * 方法实现说明 搜索员工(模糊查询)
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 15:05
    */
    @RequestMapping("searchCourse")
    @ResponseBody
    public Map searchCourse(int page, int limit,CourseInfo courseInfo){
        int start = (page-1)*limit;
        if (courseInfo.getCourseName()==""){
            courseInfo.setCourseName(null);
        }if(courseInfo.getStudentsType()==""){
            courseInfo.setStudentsType(null);
        }if (courseInfo.getPlannedStartTime()==""){
            courseInfo.setPlannedStartTime(null);
        }if (courseInfo.getPlannedEndTime()==""){
            courseInfo.setPlannedEndTime(null);
        }if (courseInfo.getCourseStatus()==""){
            courseInfo.setCourseStatus(null);
        }
        Map<String,Object>map=new HashMap<>();
        List<CourseInfo> courseInfos=courseService.searchCourse(start,limit,courseInfo);
        int count=courseService.searchCourseCount();
        map.put("code",0);
        map.put("count",count);
        map.put("data",courseInfos);
        return map;
    }

    /**
    * 方法实现说明 删除课程信息
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:01
    */
    @RequestMapping("delCourseInfo")
    @ResponseBody
    public Map delCourseInfo(CourseInfo courseInfo){
        Map<String,Object>map=new HashMap<>();
        if (courseService.delCourseInfo(courseInfo.getCourseCode())>0){
            map.put("status",0);
            map.put("message","删除成功");
        }else {
            map.put("status",1);
            map.put("message","删除失败");
        }
        return map;
    }

    /**
    * 方法实现说明 结课（人工）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/15 19:56
    */
    @RequestMapping("endCourse")
    @ResponseBody
    public Map endCourse(CourseInfo courseInfo){
        Map<String,Object>map=new HashMap<>();
        System.out.println("进入了方法");
        if (courseService.endCourse(courseInfo.getCourseCode())>0){
            map.put("status",0);
            map.put("message","结课成功");
        }else {
            map.put("status",1);
            map.put("message","结课失败");
        }
        return map;
    }


    @RequestMapping("updateCourseMessage")
    @ResponseBody
    public Map updateCourseMessage(CourseInfo courseInfo) throws ParseException {
        Map<String,Object>map=new HashMap<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date = df.format(new Date());
        Date nowDate = df.parse(date);
        Date plannedStartTime= df.parse(courseInfo.getPlannedStartTime());
        Date plannedEndTime=df.parse(courseInfo.getPlannedEndTime());
        if (nowDate.getTime()>=plannedStartTime.getTime()){
            courseInfo.setCourseStatus("1");
        }
        if (nowDate.getTime()<plannedStartTime.getTime()){
            courseInfo.setCourseStatus("0");
        }
        if (nowDate.getTime()>=plannedEndTime.getTime()){
            courseInfo.setCourseStatus("2");
        }
        if (courseService.updateCourseMessage(courseInfo)>0){
            map.put("status",0);
            map.put("message","修改成功");
        }else {
            map.put("status",1);
            map.put("message","修改失败");
        }
        return map;
    }


}
