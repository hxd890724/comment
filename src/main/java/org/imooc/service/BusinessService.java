package org.imooc.service;

import java.util.List;

import org.imooc.dto.BusinessDto;
import org.imooc.dto.BusinessListDto;

/**
 * 商户service
 */
public interface BusinessService {
	
	/**
	 * 新增
	 * @param businessDto 商户dto对象
	 * @return 是否新增成功：true-成功;fale-失败
	 */
	boolean add(BusinessDto businessDto);
    
    /**
     * 根据主键获取商户dto
     * @param id 主键
     * @return 商户dto
     */
    BusinessDto getById(Long id);
    
    /**
     * 分页搜索商户列表
     * @param businessDto 查询条件(包含分页对象)
     * @return 商户列表
     */
    List<BusinessDto> searchByPage(BusinessDto businessDto);
    
    /**
     * 分页搜索商户列表(接口专用)
     * @param businessDto 查询条件(包含分页对象)
     * @return 商户列表Dto对象
     */
    BusinessListDto searchByPageForApi(BusinessDto businessDto);

    /**
     * 商户信息修改接口
     * @param businessDto
     * @return
     */
    boolean modify(BusinessDto businessDto);

    /**
     * 删除商户.
     * @param id 商户id
     * @return
     */
    boolean delete(Long id);
}
