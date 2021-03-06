package cn.dev33.satoken.stp;

import java.util.List;

/**
 * 开放权限验证接口，方便重写   
 * @author kong
 */
public interface StpInterface {
	
	/**
	 * 返回指定loginId所拥有的权限码集合 
	 * @param loginId 账号id 
	 * @param loginKey 具体的stp标识 
	 * @return 该账号id具有的权限码集合 
	 */
	public List<String> getPermissionList(Object loginId, String loginKey);

	/**
	 * 返回指定loginId所拥有的角色标识集合 
	 * @param loginId 账号id 
	 * @param loginKey 具体的stp标识 
	 * @return 该账号id具有的角色标识集合 
	 */
	public List<String> getRoleList(Object loginId, String loginKey);
	
	
}
