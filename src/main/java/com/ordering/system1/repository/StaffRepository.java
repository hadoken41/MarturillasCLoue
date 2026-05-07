package com.ordering.system1.repository;

import com.ordering.system1.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    List<Staff> findByFullNameContainingIgnoreCase(String fullName);
    List<Staff> findByRole(String role);
    List<Staff> findByStatus(String status);
}