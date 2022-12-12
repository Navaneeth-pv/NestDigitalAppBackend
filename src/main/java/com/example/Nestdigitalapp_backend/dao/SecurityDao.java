package com.example.Nestdigitalapp_backend.dao;
import com.example.Nestdigitalapp_backend.model.Security;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SecurityDao extends CrudRepository<Security,Integer> {

    @Query(value = "SELECT `id`, `seccode`, `secname`, `secpassword`, `secusername` FROM `security` WHERE `secusername`=:secusername AND `secpassword`=:secpassword",nativeQuery = true)
    List<Security> SecurityLogin(@Param("secusername") String secusername, @Param("secpassword")String secpassword);

    @Query(value = "SELECT `id`, `seccode`, `secname`, `secpassword`, `secusername` FROM `security` WHERE `id`=:id", nativeQuery = true)
    List<Security> SecurityProfile(@Param("id")int id);
}
