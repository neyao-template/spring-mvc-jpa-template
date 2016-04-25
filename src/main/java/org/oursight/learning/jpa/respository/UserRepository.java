package org.oursight.learning.jpa.respository;

import org.oursight.learning.jpa.bo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by neyao@github.com on 2016/4/25.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
