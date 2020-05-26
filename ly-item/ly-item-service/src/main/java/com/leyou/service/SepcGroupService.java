package com.leyou.service;

import com.leyou.dao.SepcGroupMapper;
import com.leyou.pojo.SepcGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SepcGroupService {

     @Autowired
     private SepcGroupMapper sepcGroupMapper;

    /**
     *  //根据id查询商品组
     * @param cid
     * @return
     */
    public List<SepcGroup> findBySepcGroupCid(Long cid) {
        SepcGroup sepcGroup = new SepcGroup();
        sepcGroup.setCid(cid);
        return sepcGroupMapper.select(sepcGroup);

    }


    /**
     *  添加商品分组
     * @param sepcGroup
     *
     */
    public void SaveSepcgroup(SepcGroup sepcGroup) {

        if(sepcGroup.getId()==null){
            sepcGroupMapper.insert(sepcGroup);
        }else {
            sepcGroupMapper.updateByPrimaryKey(sepcGroup);
        }

    }


  public void deleteBySepcGroupId(Long id) {
        sepcGroupMapper.deleteByPrimaryKey(id);
    }


}
