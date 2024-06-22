package com.humayunSpringBoot.cloud_vendor_api.repository;

import com.humayunSpringBoot.cloud_vendor_api.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
}
