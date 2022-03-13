package io.bootify.my_app.repos;

import io.bootify.my_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
