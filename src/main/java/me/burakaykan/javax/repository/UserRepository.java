package me.burakaykan.javax.repository;


import me.burakaykan.javax.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface UserRepository extends JpaRepository<User, Long> {
}
