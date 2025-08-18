package com.ruoyi.auth.form;

import lombok.Data;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * 注册表单实体（兼容学生和学员注册）
 */
@Data
public class RegisterBody extends LoginBody {

    /** 确认密码 */
    @NotBlank(message = "确认密码不能为空")
    private String confirmPassword;

    /** 邮箱 */
    private String email;

    /** 手机号码 */
    private String phonenumber;

    /** 所属职级ID */
    @NotBlank(message = "所属职级不能为空")
    private String deptId;

    /** 选择的科目/学科ID列表 */
    private List<Long> postIds;

    /** 省份 */
    private String province;

    /** 城市 */
    private String city;

    /** 区域 */
    private String area;

    /** 所在地（省-市-区） */
    private String location;

    /** 注册类型（false:学生注册，true:学员注册） */
    private Boolean parentRegister;

    // 学生特有字段（学员注册时可为空）
    private String university;
    private String major;
    private String teachWay;

    // 共用字段
    private String background;
    private String salaryExpect;
    private String sex;
    private String code; // 验证码
    private String uuid; // 验证码唯一标识
}