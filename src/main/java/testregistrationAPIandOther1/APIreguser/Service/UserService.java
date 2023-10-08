package testregistrationAPIandOther1.APIreguser.Service;


import testregistrationAPIandOther1.APIreguser.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService   {
    List<UserEntity> findAllUsers();
    Optional<UserEntity> findById(Long id);
    UserEntity saveUser(UserEntity employeeEntity);
    UserEntity updateUser(UserEntity employeeEntity);
    void deleteUser(Long id);

   /* //    Using Request for Save and Update Employee
    EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);
    EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);*/
}
