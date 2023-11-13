package com.tekup.project_erh.Service;

import java.util.List;
import com.tekup.project_erh.model.Role;

public interface RoleServices {
    Role saveRole(Role R);
    String deleteRole(Role R);
    Role getRole(Long id);
    List<Role> getAllRole();
    Role updateRole(Role updatedRole);
}
