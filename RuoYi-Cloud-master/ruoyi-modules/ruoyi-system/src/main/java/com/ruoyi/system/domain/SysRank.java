package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 职级对象 sys_rank
 *
 * @author ruoyi
 * @date 2025-08-13
 */
public class SysRank extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 职级ID */
    private Long rankId;

    /** 职级编码 */
    @Excel(name = "职级编码")
    private String rankCode;

    /** 职级名称 */
    @Excel(name = "职级名称")
    private String rankName;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Long rankSort;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    public void setRankId(Long rankId)
    {
        this.rankId = rankId;
    }

    public Long getRankId()
    {
        return rankId;
    }

    public void setRankCode(String rankCode)
    {
        this.rankCode = rankCode;
    }

    public String getRankCode()
    {
        return rankCode;
    }

    public void setRankName(String rankName)
    {
        this.rankName = rankName;
    }

    public String getRankName()
    {
        return rankName;
    }

    public void setRankSort(Long rankSort)
    {
        this.rankSort = rankSort;
    }

    public Long getRankSort()
    {
        return rankSort;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("rankId", getRankId())
                .append("rankCode", getRankCode())
                .append("rankName", getRankName())
                .append("rankSort", getRankSort())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}
