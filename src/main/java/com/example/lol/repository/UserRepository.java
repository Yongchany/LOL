// UserRepository.java

package com.example.lol.repository;

import com.example.lol.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // 추가적인 메서드를 정의할 수 있습니다.
}
