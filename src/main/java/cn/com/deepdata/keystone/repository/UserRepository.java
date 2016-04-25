package cn.com.deepdata.keystone.repository;

import cn.com.deepdata.keystone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by neyao@github.com on 2016/4/25.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
