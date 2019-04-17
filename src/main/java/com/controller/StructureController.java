package com.controller;


import com.pojo.DepartmentInfo;
import com.pojo.PositionInfo;
import com.pojo.TestMode;
import com.service.CascadeService;
import com.util.GetDeptTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;


/**
* @Description:    公司结构控制类
* @Author:         jieHao
* @CreateDate:     2019/4/17 16:27
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/17 16:27
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
public class StructureController {

    @Autowired
    private CascadeService cascadeService;

    /**
    * 方法实现说明  查找部门，和相对应职位，并转化为树形结构(用以前端以功能结构图展示)，待加：查找公司名字
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/4/17 16:43
    */
    @RequestMapping(value = "treeToList",method = RequestMethod.GET)
    @ResponseBody
    public List<TestMode> treeToList(){
        Integer adb=-1;
        List<DepartmentInfo>departmentInfo=cascadeService.searchDepartment();
        List<PositionInfo> positionInfo=cascadeService.searchPositionALL();
        List<TestMode> test=new ArrayList<>();
        TestMode testMode2 = new TestMode();
        testMode2.setParentId(0);
        testMode2.setId(-1);
        testMode2.setName("公司");
        test.add(testMode2);
        for (int i=0;i<departmentInfo.size();i++){
            TestMode testMode = new TestMode();
            testMode.setId(departmentInfo.get(i).getDepartmentId());
            testMode.setName(departmentInfo.get(i).getDepartment());
            testMode.setParentId(adb);
            test.add(testMode);
        }
        for (int y=0;y<positionInfo.size();y++){
            TestMode testMode1 = new TestMode();
            testMode1.setId(positionInfo.get(y).getPositionId()+departmentInfo.size());
            testMode1.setName(positionInfo.get(y).getPosition());
            testMode1.setParentId(positionInfo.get(y).getDepartmentId());
            test.add(testMode1);
        }
        GetDeptTree getDeptTree=new GetDeptTree();
        List<TestMode> result=getDeptTree.getTree(test,0);
        return result;
    }


}
