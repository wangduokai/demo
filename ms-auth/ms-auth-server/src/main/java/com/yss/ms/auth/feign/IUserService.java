package com.yss.ms.auth.feign;

import com.yss.ms.api.vo.authority.PermissionInfo;
import com.yss.ms.api.vo.user.UserInfo;
import com.yss.ms.auth.configuration.FeignConfiguration;
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
@FeignClient(value = "ms-admin",configuration = FeignConfiguration.class)
public interface IUserService {
  @RequestMapping(value = "/api/user/username/{username}", method = RequestMethod.GET)
  public UserInfo getUserByUsername(@PathVariable("username") String username);
  @RequestMapping(value = "/api/user/un/{username}/permissions", method = RequestMethod.GET)
  public List<PermissionInfo> getPermissionByUsername(@PathVariable("username") String username);
  @RequestMapping(value = "/api/permissions", method = RequestMethod.GET)
  List<PermissionInfo> getAllPermissionInfo();
}
