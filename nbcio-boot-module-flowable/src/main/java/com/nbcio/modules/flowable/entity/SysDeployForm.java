package com.nbcio.modules.flowable.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.jeecg.common.aspect.annotation.Dict;

import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: 流程实例关联表单
 * @Author: nbacheng
 * @Date:   2022-04-11
 * @Version: V1.0
 */
@Data
@TableName("sys_deploy_form")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="sys_deploy_form对象", description="流程实例关联表单")
public class SysDeployForm implements Serializable {
    private static final long serialVersionUID = 1L;

	/**主键*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "主键")
    private java.lang.String id;
	/**表单主键*/
	@Excel(name = "表单主键", width = 15)
    @ApiModelProperty(value = "表单主键")
    private java.lang.String formId;
	/**流程实例主键*/
	@Excel(name = "流程实例主键", width = 15)
    @ApiModelProperty(value = "流程实例主键")
    private java.lang.String deployId;
	/**流程实例节点主键*/
	@Excel(name = "流程实例节点主键", width = 15)
    @ApiModelProperty(value = "流程实例节点主键")
    private java.lang.String nodeKey;
	/**流程实例节点名称*/
	@Excel(name = "流程实例节点名称", width = 15)
    @ApiModelProperty(value = "流程实例节点名称")
    private java.lang.String nodeName;
	/**流程实例节点名称*/
	@Excel(name = "流程实例节点form标志", width = 15)
    @ApiModelProperty(value = "流程实例节点form标志")
    private java.lang.String formFlag;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private java.lang.String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "创建日期")
    private java.util.Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private java.lang.String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @ApiModelProperty(value = "更新日期")
    private java.util.Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private java.lang.String sysOrgCode;
}
