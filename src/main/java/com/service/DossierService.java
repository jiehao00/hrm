package com.service;

import com.pojo.DossierInfo;
import com.pojo.TerminationInfo;
import com.pojo.TransferredInfo;

import java.util.List;
/**
* @Description:    员工档案操作接口
* @Author:         jieHao
* @CreateDate:     2019/4/2 18:08
* @UpdateUser:     jieHao
* @UpdateDate:     2019/4/2 18:08
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface DossierService {

     /**
     * 方法实现说明 增加员工信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:08
     */
     int insertDossierInfo(DossierInfo dossierInfo);

     /**
     * 方法实现说明  搜索员工信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
     List<DossierInfo> searchDossierInfo(int start, int limit,DossierInfo dossierInfo);

     /**
     * 方法实现说明 搜索员工总数
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
     int selectCountDossier();

     /**
     * 方法实现说明 删除员工
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:10
     */
     int delDossierInfo(DossierInfo dossierInfo);


     int insertTermination(TerminationInfo terminationInfo);


     DossierInfo findDossierInfoByPersonnelId(DossierInfo dossierInfo);


     int uploadUpdatedPersonnelMessage(DossierInfo dossierInfo);


     int insertTransferredInfo(TransferredInfo transferredInfo);

}
