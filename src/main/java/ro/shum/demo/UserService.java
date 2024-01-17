package ro.shum.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getAllUsers() {
    userRepository.save(new User(null, "Andrey", "asdf@gt.yu"));
    userRepository.save(new User(null, "Masha", "asdwf@gt.yu"));
    userRepository.save(new User(null, "Jna", "asdwwf@gt.yu"));
    return userRepository.finsAll();
  }

  public User getUserByID(Long id) {
    return userRepository.findById(id);
  }


}
