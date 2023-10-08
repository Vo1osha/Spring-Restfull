package testregistrationAPIandOther1.APIreguser.Service.impl;

import org.springframework.stereotype.Service;
import testregistrationAPIandOther1.APIreguser.Entity.UserEntity;
import testregistrationAPIandOther1.APIreguser.Repository.UserRepository;
import testregistrationAPIandOther1.APIreguser.Service.UserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceimpl  implements UserService {

    private final UserRepository userRepository;

    public UserServiceimpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
