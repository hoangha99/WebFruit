package com.web.fruit.Service;

import com.web.fruit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService {
    @Autowired
    UserRepository nhanVienRepository;


}
