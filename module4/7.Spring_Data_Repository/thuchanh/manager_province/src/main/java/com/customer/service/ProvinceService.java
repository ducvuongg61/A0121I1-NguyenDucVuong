package com.customer.service;

import com.customer.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void delete(Long id);
}
