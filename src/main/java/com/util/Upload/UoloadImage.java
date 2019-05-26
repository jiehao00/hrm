package com.util.Upload;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
* @Description:    上传文件工具
* @Author:         jiehao
* @CreateDate:     2018/11/27 10:30
* @UpdateUser:     jiehao
* @UpdateDate:     2018/11/27 10:30
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class UoloadImage {


    /**
    *  上传图片到服务器   （会改变后缀，弃用）
    * @author：      jiehao
    * @param
    * @return：
    * @exception：
    * @date：       2018/11/27 10:31
    */
    public String uploadImage(MultipartFile url, String dir) throws IOException {
        String filename=null;
        String contentType=url.getContentType();
        //获得文件后缀名
        String suffixName=contentType.substring(contentType.indexOf("/")+1);
        //得到 文件名
        filename=System.currentTimeMillis()+"."+suffixName;
        //文件保存路径
        url.transferTo(new File(dir+filename));
        return filename;
    }

    /**
    * 方法实现说明   上传文件到服务器（不会改变原来文件后缀）
    * @author      jieHao
    *@param: null
    * @return
    * @exception
    * @date        2019/5/27 1:46
    */
    public String uploadFile(MultipartFile url,String dir) throws IOException{
        String filename=null;
        String oldName = url.getOriginalFilename();
        String suffix = oldName.substring(oldName.indexOf('.'));
        System.out.println(suffix);
        filename=System.currentTimeMillis()+suffix;
        //文件保存路径
        url.transferTo(new File(dir+filename));
        return filename;
    }
}
