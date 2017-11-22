package com.yss.ms.gate.feign;

import com.yss.ms.api.vo.authority.PermissionInfo;
import com.yss.ms.api.vo.user.UserInfo;
import com.yss.ms.gate.config.ZuulConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-21 8:11
 */
@FeignClient(value = "ms-admin",configuration = {ZuulConfig.class})
@RequestMapping("api")
public interface IUserService {
  @RequestMapping(value = "/user/username/{username}", method = RequestMethod.GET)
  public UserInfo getUserByUsername(@PathVariable("username") String username);
  @RequestMapping(value = "/user/un/{username}/permissions", method = RequestMethod.GET)
  public List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username);
  @RequestMapping(value = "/permissions", method = RequestMethod.GET)
  List<PermissionInfo> getAllPermissionInfo();
}
