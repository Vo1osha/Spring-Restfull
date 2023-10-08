package testregistrationAPIandOther1.APIreguser.Controller;

import org.springframework.web.bind.annotation.*;
import testregistrationAPIandOther1.APIreguser.Entity.UserEntity;
import testregistrationAPIandOther1.APIreguser.Service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

@GetMapping
    public List<UserEntity> FindAllUsers(){
        return userService.findAllUsers();
    }
@GetMapping("/{id}")
    public Optional<UserEntity> findEmployeeByID(@PathVariable("id")Long id) {
        return userService.findById(id);
    }

@PostMapping()
        public UserEntity saveEmployee(@RequestBody UserEntity userEntity) {

            return userService.saveUser(userEntity);

        }
        @PutMapping
    public UserEntity updateUser(@RequestBody UserEntity userEntity){

        return userService.updateUser(userEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
    }

}
