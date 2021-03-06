package generation.mx.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import generation.mx.models.UserModel;
import generation.mx.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public ArrayList <UserModel> getUsers() {
		return (ArrayList<UserModel>) userRepository.findAll();
	}
	
	@PostMapping
	public Optional<UserModel> saveUser(UserModel user) {
		String name = user.getName();
		String surname = user.getSurname();
		
	
	
	public Optional<UserModel> getUserById(Long id){
		return userRepository.findById(id);
	}
	public boolean deleteUSeer (Long id){
		try {
			userRepository.deleteById(id);
				return true;		
		}catch (Exception Error) {
			return false;
		}
	}
		
	}
}
