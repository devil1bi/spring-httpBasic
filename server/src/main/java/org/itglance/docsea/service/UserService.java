package org.itglance.docsea.service;
import org.itglance.docsea.domain.User;
import org.itglance.docsea.repository.UserRepository;
import org.itglance.docsea.service.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * Created by bishal on 5/23/17.
 */
@Service
public class UserService {

    private UserRepository userRepository;
//    private RoleRepository roleRepository;

    public UserService(UserRepository userRepository){}

    public void save(UserDTO userDTO){

        User user = new User();
        user.setName(userDTO.getName());
        userRepository.save(user);
    }


}
