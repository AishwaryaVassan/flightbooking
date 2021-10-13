package com.User.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.User.Model.Login;
public interface UserRepository extends JpaRepository<Login, Integer>  
{ 
}  
