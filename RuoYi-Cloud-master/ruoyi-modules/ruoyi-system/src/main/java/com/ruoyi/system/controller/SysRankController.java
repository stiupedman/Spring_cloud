package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.system.domain.SysRank;
import com.ruoyi.system.service.ISysRankService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 职级Controller
 *
 * @author ruoyi
 * @date 2025-08-13
 */
@RestController
@RequestMapping("/rank")
//guihuacuoleyinggaidayideshihoujiukaishijinruanjianshetuandeshizhedayinianjingsaizaidaershangdaodasanxiadedezheduanshijianfengkuangzhaoshixi,daosijiukeyiwanmeiruzhile,kewuadoumeiyouzhemeyigeqinxideguihua,zhexiazhengzale,zaozhidaobuxuejisuanjile
public class SysRankController extends BaseController
{
    @Autowired
    private ISysRankService sysRankService;

    /**
     * 查询职级列表
     */
    @RequiresPermissions("system:rank:list")
    @GetMapping("/list")
    public TableDataInfo list(SysRank sysRank)
    {
        startPage();
        List<SysRank> list = sysRankService.selectSysRankList(sysRank);
        return getDataTable(list);
    }

    /**
     * 导出职级列表
     */
    @RequiresPermissions("system:rank:export")
    @Log(title = "职级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysRank sysRank)
    {
        List<SysRank> list = sysRankService.selectSysRankList(sysRank);
        ExcelUtil<SysRank> util = new ExcelUtil<SysRank>(SysRank.class);
        util.exportExcel(response, list, "职级数据");
    }

    /**
     * 获取职级详细信息
     */
    @RequiresPermissions("system:rank:query")
    @GetMapping(value = "/{rankId}")
    public AjaxResult getInfo(@PathVariable("rankId") Long rankId)
    {
        return success(sysRankService.selectSysRankByRankId(rankId));
    }

    /**
     * 新增职级
     */
    @RequiresPermissions("system:rank:add")
    @Log(title = "职级", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysRank sysRank)
    {
        return toAjax(sysRankService.insertSysRank(sysRank));
    }

    /**
     * 修改职级
     */
    @RequiresPermissions("system:rank:edit")
    @Log(title = "职级", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysRank sysRank)
    {
        return toAjax(sysRankService.updateSysRank(sysRank));
    }

    /**
     * 删除职级
     */
    @RequiresPermissions("system:rank:remove")
    @Log(title = "职级", businessType = BusinessType.DELETE)
    @DeleteMapping("/{rankIds}")
    public AjaxResult remove(@PathVariable Long[] rankIds)
    {
        return toAjax(sysRankService.deleteSysRankByRankIds(rankIds));
    }
}
