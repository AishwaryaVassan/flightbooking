package com.Admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Admin.Model.Login;

public interface AdminRepository extends JpaRepository<Login, Integer>  
{ 

}  