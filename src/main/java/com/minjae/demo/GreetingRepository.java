package com.minjae.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingEntity, Long> {
}
