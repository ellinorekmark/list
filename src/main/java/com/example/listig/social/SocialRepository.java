package com.example.listig.social;

import com.example.listig.social.entities.Friends;
import com.example.listig.social.entities.FriendsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SocialRepository extends JpaRepository<Friends, FriendsId> {

    @Query(value = "SELECT * FROM friends WHERE userA_id = :userId OR userB_id = :userId", nativeQuery = true)
    List<Friends> findAllByUserId(Long userId);

}
