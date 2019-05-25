package com.service.impl;

import com.dao.DossierInfoMapper;
import com.dao.TerminationInfoMapper;
import com.dao.TransferredInfoMapper;
import com.pojo.DossierInfo;
import com.pojo.TerminationInfo;
import com.pojo.TransferredInfo;
import com.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:    员工档案操作接口实现
 * @Author:         jieHao
 * @CreateDate:     2019/4/2 18:08
 * @UpdateUser:     jieHao
 * @UpdateDate:     2019/4/2 18:08
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
@Service
public class DossierServiceImpl implements DossierService {


    @Autowired
    private DossierInfoMapper dossierInfoMapper;

    @Autowired
    private TerminationInfoMapper terminationInfoMapper;

    @Autowired
    private TransferredInfoMapper transferredInfoMapper;
    /**
     * 方法实现说明 增加员工信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:08
     */
    @Override
    public int insertDossierInfo(DossierInfo dossierInfo) {
        return dossierInfoMapper.insertSelective(dossierInfo);
    }

    /**
     * 方法实现说明  搜索员工信息
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
    @Override
    public List<DossierInfo> searchDossierInfo(int start, int limit,DossierInfo dossierInfo) {
        return dossierInfoMapper.searchDossierInfo(start,limit,dossierInfo);
    }
    /**
     * 方法实现说明 搜索员工总数
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:09
     */
    @Override
    public int selectCountDossier() {
        return dossierInfoMapper.selectCountDossier();
    }

    /**
     * 方法实现说明 删除员工
     * @author      jieHao
     *@param: null
     * @return
     * @exception
     * @date        2019/4/2 18:10
     */
    @Override
    public int delDossierInfo(DossierInfo dossierInfo) {
        return dossierInfoMapper.delDossierInfo(dossierInfo);
    }

    @Override
    public int insertTermination(TerminationInfo terminationInfo) {
        return terminationInfoMapper.insertSelective(terminationInfo);
    }

    @Override
    public DossierInfo findDossierInfoByPersonnelId(DossierInfo dossierInfo) {
        return dossierInfoMapper.findDossierInfoByPersonnelId(dossierInfo);
    }

    @Override
    public int uploadUpdatedPersonnelMessage(DossierInfo dossierInfo) {
        return dossierInfoMapper.uploadUpdatedPersonnelMessage(dossierInfo);
    }

    @Override
    public int insertTransferredInfo(TransferredInfo transferredInfo) {
        return transferredInfoMapper.insertSelective(transferredInfo);
    }


}
