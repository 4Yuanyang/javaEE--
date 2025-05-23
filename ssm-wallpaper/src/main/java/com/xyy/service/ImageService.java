package com.xyy.service;

import com.xyy.domain.Image;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    boolean addImage(Image image);
    boolean deleteImage(String url);
    Image getImage(String url);
    List<String> getImageByIndex(int index);
}
