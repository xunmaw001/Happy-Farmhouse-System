package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 农庄
 *
 * @author 
 * @email
 * @date 2021-04-10
 */
@TableName("nongzhuang")
public class NongzhuangEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NongzhuangEntity() {

	}

	public NongzhuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 农庄名称
     */
    @TableField(value = "nongzhuang_name")

    private String nongzhuangName;


    /**
     * 农庄面积
     */
    @TableField(value = "nongzhuang_mianji")

    private String nongzhuangMianji;


    /**
     * 农庄图片
     */
    @TableField(value = "nongzhuang_photo")

    private String nongzhuangPhoto;


    /**
     * 餐桌数量
     */
    @TableField(value = "nongzhuang_chanzuo")

    private Integer nongzhuangChanzuo;


    /**
     * 住房数量
     */
    @TableField(value = "nongzhuang_zhufang")

    private Integer nongzhuangZhufang;


    /**
     * 住房数量
     */
    @TableField(value = "nongzhuang_xiangmu")

    private String nongzhuangXiangmu;


    /**
     * 联系方式
     */
    @TableField(value = "nongzhuang_phone")

    private String nongzhuangPhone;


    /**
     * 详情信息
     */
    @TableField(value = "nongzhuang_content")

    private String nongzhuangContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：农庄名称
	 */
    public String getNongzhuangName() {
        return nongzhuangName;
    }


    /**
	 * 获取：农庄名称
	 */

    public void setNongzhuangName(String nongzhuangName) {
        this.nongzhuangName = nongzhuangName;
    }
    /**
	 * 设置：农庄面积
	 */
    public String getNongzhuangMianji() {
        return nongzhuangMianji;
    }


    /**
	 * 获取：农庄面积
	 */

    public void setNongzhuangMianji(String nongzhuangMianji) {
        this.nongzhuangMianji = nongzhuangMianji;
    }
    /**
	 * 设置：农庄图片
	 */
    public String getNongzhuangPhoto() {
        return nongzhuangPhoto;
    }


    /**
	 * 获取：农庄图片
	 */

    public void setNongzhuangPhoto(String nongzhuangPhoto) {
        this.nongzhuangPhoto = nongzhuangPhoto;
    }
    /**
	 * 设置：餐桌数量
	 */
    public Integer getNongzhuangChanzuo() {
        return nongzhuangChanzuo;
    }


    /**
	 * 获取：餐桌数量
	 */

    public void setNongzhuangChanzuo(Integer nongzhuangChanzuo) {
        this.nongzhuangChanzuo = nongzhuangChanzuo;
    }
    /**
	 * 设置：住房数量
	 */
    public Integer getNongzhuangZhufang() {
        return nongzhuangZhufang;
    }


    /**
	 * 获取：住房数量
	 */

    public void setNongzhuangZhufang(Integer nongzhuangZhufang) {
        this.nongzhuangZhufang = nongzhuangZhufang;
    }
    /**
	 * 设置：住房数量
	 */
    public String getNongzhuangXiangmu() {
        return nongzhuangXiangmu;
    }


    /**
	 * 获取：住房数量
	 */

    public void setNongzhuangXiangmu(String nongzhuangXiangmu) {
        this.nongzhuangXiangmu = nongzhuangXiangmu;
    }
    /**
	 * 设置：联系方式
	 */
    public String getNongzhuangPhone() {
        return nongzhuangPhone;
    }


    /**
	 * 获取：联系方式
	 */

    public void setNongzhuangPhone(String nongzhuangPhone) {
        this.nongzhuangPhone = nongzhuangPhone;
    }
    /**
	 * 设置：详情信息
	 */
    public String getNongzhuangContent() {
        return nongzhuangContent;
    }


    /**
	 * 获取：详情信息
	 */

    public void setNongzhuangContent(String nongzhuangContent) {
        this.nongzhuangContent = nongzhuangContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Nongzhuang{" +
            "id=" + id +
            ", nongzhuangName=" + nongzhuangName +
            ", nongzhuangMianji=" + nongzhuangMianji +
            ", nongzhuangPhoto=" + nongzhuangPhoto +
            ", nongzhuangChanzuo=" + nongzhuangChanzuo +
            ", nongzhuangZhufang=" + nongzhuangZhufang +
            ", nongzhuangXiangmu=" + nongzhuangXiangmu +
            ", nongzhuangPhone=" + nongzhuangPhone +
            ", nongzhuangContent=" + nongzhuangContent +
            ", createTime=" + createTime +
        "}";
    }
}
