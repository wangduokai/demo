package com.yss.ms.admin.biz;

import com.yss.ms.admin.entity.GateLog;
import com.yss.ms.admin.mapper.GateLogMapper;
import com.yss.ms.common.biz.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-07-01 14:36
 */
@Service
public class GateLogBiz extends BaseBiz<GateLogMapper,GateLog> {

    @Override
    public void insert(GateLog entity) {
        mapper.insert(entity);
    }

    @Override
    public void insertSelective(GateLog entity) {
        mapper.insertSelective(entity);
    }
}
