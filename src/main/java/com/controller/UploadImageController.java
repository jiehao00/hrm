package com.controller;



import com.util.Upload.UoloadImage;
import com.util.config.ImageConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
/**
* @Description:    图片上传服务器
* @Author:         jiehao
* @CreateDate:     2018/12/12 16:33
* @UpdateUser:     jiehao
* @UpdateDate:     2018/12/12 16:33
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Controller
@RequestMapping("")
public class UploadImageController {

    private UoloadImage uploadImage;


    /**
    * 方法实现说明     上传图片、文件
    * @author：      jiehao
    * @return：
    * @exception：
    * @date：       2018/12/12 16:32
    */
    @RequestMapping(value = "uploadImage" ,method = RequestMethod.POST)
    @ResponseBody
    public Map uploadImageTest(MultipartFile file, HttpServletRequest request)throws Exception{
        String dir = request.getSession().getServletContext().getRealPath("")+"/upload/images/";
        File file1=new File(dir);
        //如果文件夹不存在
        if(!file1.exists()){
            //创建文件夹
            file1.mkdirs();
            System.out.println("+++++++++++++");
        }
        uploadImage=new UoloadImage();
        String  filename=uploadImage.uploadFile(file,dir);
        Map<String,Object> map = new HashMap<String, Object>();
        String sqlPath=ImageConfig.imageUrl +filename;
        map.put("fileName",filename);
        return map;
    }
//
//    /**
//    * 方法实现说明 上传文件
//    * @author      jieHao
//    *@param: null
//    * @return
//    * @exception
//    * @date        2019/5/27 1:48
//    */
//    @RequestMapping(value = "uploadFile" ,method = RequestMethod.POST)
//    @ResponseBody
//    public Map uploadFile(MultipartFile file, HttpServletRequest request)throws Exception{
//        String dir = request.getSession().getServletContext().getRealPath("")+"/upload/images/";
//        File file1=new File(dir);
//        //如果文件夹不存在
//        if(!file1.exists()){
//            //创建文件夹
//            file1.mkdirs();
//            System.out.println("+++++++++++++");
//        }
//        uploadImage=new UoloadImage();
//        String  filename=uploadImage.uploadFile(file,dir);
//        Map<String,Object> map = new HashMap<String, Object>();
//        String sqlPath=ImageConfig.imageUrl +filename;
//        map.put("fileName",filename);
//        return map;
//    }






}
