package com.kf.common.core;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @author kenfo
 * @version V1.0
 * @Package com.kf.domain.entity
 * @Description: TODO
 * @date 2018/6/4 下午5:36
 */
@Data
public class BaseEntity<T extends Model> extends Model<T> {

    @TableId(type= IdType.AUTO)
    private Long id;
    
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
