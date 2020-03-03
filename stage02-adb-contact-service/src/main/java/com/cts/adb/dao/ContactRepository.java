package com.cts.adb.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.adb.entity.ContactEntity;
@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {

	

}
