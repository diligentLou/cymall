package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by DELL on 2017/6/20.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
