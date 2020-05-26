package com.leyou.service;

import com.leyou.dao.SepcParamMapper;
import com.leyou.pojo.SepcParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SepcParamService {

    @Autowired
    private SepcParamMapper sepcParamMapper;

    public List<SepcParam> findSepcParam(Long gid,Long cid) {
         SepcParam sepcParam =new SepcParam();
         sepcParam.setGroupId(gid);
         sepcParam.setCid(cid);
        return sepcParamMapper.select(sepcParam);
}

    public void saveSepcParm(SepcParam sepcParam) {
         if(sepcParam.getId()==null){
             sepcParamMapper.insert(sepcParam);
         }else{
             sepcParamMapper.updateByPrimaryKey(sepcParam);
         }

    }

    public void deleteSepcParam(Long id) {

        sepcParamMapper.deleteByPrimaryKey(id);
    }

}
