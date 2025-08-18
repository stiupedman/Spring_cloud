package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysRank;

/**
 * 职级Service接口
 *
 * @author ruoyi
 * @date 2025-08-13
 */
public interface ISysRankService
{
    /**
     * 查询职级
     *
     * @param rankId 职级主键
     * @return 职级
     */
    public SysRank selectSysRankByRankId(Long rankId);

    /**
     * 查询职级列表
     *
     * @param sysRank 职级
     * @return 职级集合
     */
    public List<SysRank> selectSysRankList(SysRank sysRank);

    /**
     * 新增职级
     *
     * @param sysRank 职级
     * @return 结果
     */
    public int insertSysRank(SysRank sysRank);

    /**
     * 修改职级
     *
     * @param sysRank 职级
     * @return 结果
     */
    public int updateSysRank(SysRank sysRank);

    /**
     * 批量删除职级
     *
     * @param rankIds 需要删除的职级主键集合
     * @return 结果
     */
    public int deleteSysRankByRankIds(Long[] rankIds);

    /**
     * 删除职级信息
     *
     * @param rankId 职级主键
     * @return 结果
     */
    public int deleteSysRankByRankId(Long rankId);
}
