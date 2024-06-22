package com.humayunSpringBoot.cloud_vendor_api.service;

import com.humayunSpringBoot.cloud_vendor_api.model.CloudVendor;

import java.util.*;

public interface CloudVendorService {
    public  String createCloudVendor(CloudVendor cloudVendor);

    public String updateCloudVendor(CloudVendor cloudVendor);

    public  String deleteCloudVendor(String vendorId);

    public CloudVendor getCloudVendor(String vendorId);

    public List<CloudVendor> getAllCloudVendor();
}
