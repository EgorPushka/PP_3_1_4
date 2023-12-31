package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {

    List<Role> indexRoles();

    Role getRole(String roleName);

    Role getRoleById(int id);

    void addRole(Role role);

    List<Role> getRolesByIds(List<Integer> roleIds);
}
