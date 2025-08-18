package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRankMapper;
import com.ruoyi.system.domain.SysRank;
import com.ruoyi.system.service.ISysRankService;

/**
 * 职级Service业务层处理
 *
 * @author ruoyi
 * @date 2025-08-13
 */
@Service
public class SysRankServiceImpl implements ISysRankService
{
    @Autowired
    private SysRankMapper sysRankMapper;

    /**
     * 查询职级
     *
     * @param rankId 职级主键
     * @return 职级
     */
    @Override
    public SysRank selectSysRankByRankId(Long rankId)
    {
        return sysRankMapper.selectSysRankByRankId(rankId);
    }

    /**
     * 查询职级列表
     *
     * @param sysRank 职级
     * @return 职级
     */
    @Override
    public List<SysRank> selectSysRankList(SysRank sysRank)
    {
        return sysRankMapper.selectSysRankList(sysRank);
    }

    /**
     * 新增职级
     *
     * @param sysRank 职级
     * @return 结果
     */
    @Override
    public int insertSysRank(SysRank sysRank)
    {
        sysRank.setCreateTime(DateUtils.getNowDate());
        return sysRankMapper.insertSysRank(sysRank);
    }

    /**
     * 修改职级
     *
     * @param sysRank 职级
     * @return 结果
     */
    @Override
    public int updateSysRank(SysRank sysRank)
    {
        sysRank.setUpdateTime(DateUtils.getNowDate());
        return sysRankMapper.updateSysRank(sysRank);
    }

    /**
     * 批量删除职级
     *
     * @param rankIds 需要删除的职级主键
     * @return 结果
     */
    @Override
    public int deleteSysRankByRankIds(Long[] rankIds)
    {
        return sysRankMapper.deleteSysRankByRankIds(rankIds);
    }

    /**
     * 删除职级信息
     *
     * @param rankId 职级主键
     * @return 结果
     */
    @Override
    public int deleteSysRankByRankId(Long rankId)
    {
        return sysRankMapper.deleteSysRankByRankId(rankId);
    }
}
