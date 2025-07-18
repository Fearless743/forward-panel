package com.admin.service;

import com.admin.common.dto.ForwardDto;
import com.admin.common.dto.ForwardUpdateDto;
import com.admin.common.lang.R;
import com.admin.entity.Forward;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
// build backend

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author QAQ
 * @since 2025-06-03
 */
public interface ForwardService extends IService<Forward> {

    /**
     * 创建端口转发
     * 
     * @param forwardDto 转发数据
     * @return 结果
     */
    R createForward(ForwardDto forwardDto);

    /**
     * 获取端口转发列表
     * 
     * @return 结果
     */
    R getAllForwards();

    /**
     * 更新端口转发
     * 
     * @param forwardUpdateDto 更新数据
     * @return 结果
     */
    R updateForward(ForwardUpdateDto forwardUpdateDto);

    /**
     * 删除端口转发
     * 
     * @param id 转发ID
     * @return 结果
     */
    R deleteForward(List<Long> id);

    /**
     * 强制删除端口转发
     * 跳过GOST节点验证，直接删除数据库记录
     * 
     * @param id 转发ID
     * @return 结果
     */
    R forceDeleteForward(List<Long> id);

    /**
     * 暂停转发服务
     * 
     * @param id 转发ID
     * @return 结果
     */
    R pauseForward(List<Long> id);

    /**
     * 恢复转发服务
     * 
     * @param id 转发ID
     * @return 结果
     */
    R resumeForward(List<Long> id);

    /**
     * 转发诊断功能
     * 
     * @param id 转发ID
     * @return 诊断结果
     */
    R diagnoseForward(Long id);
}
