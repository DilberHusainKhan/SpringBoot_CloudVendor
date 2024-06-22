package com.humayunSpringBoot.cloud_vendor_api.service.imple;

import com.humayunSpringBoot.cloud_vendor_api.model.CloudVendor;
import com.humayunSpringBoot.cloud_vendor_api.repository.CloudVendorRepository;
import com.humayunSpringBoot.cloud_vendor_api.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImple implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImple(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud vendor created sucessfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor Update sucessfully";
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        cloudVendorRepository.deleteById(vendorId);
        return "Vendor Deleted sucessfully";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorId) {
        return cloudVendorRepository.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendor() {
        return cloudVendorRepository.findAll();
    }
}
