package com.xyy.service.impl;

import com.xyy.domain.Image;
import com.xyy.mapper.ImageMapper;
import com.xyy.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2025/5/18 22:51
 * 向远洋
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    /**
     * 上传图片
     * @param image
     * @return
     */
    public boolean addImage(Image image) {
        imageMapper.add(image);
        return true;
    }

    @Override
    public boolean deleteImage(String url) {
        imageMapper.delete(url);
        return true;
    }

    @Override
    public Image getImage(String url) {
        Image image = imageMapper.get(url);
        return image;
    }

    @Override
    public List<String> getImageByIndex(int index) {
        try {
            int begin = (index - 1) * 9;
            return imageMapper.getImageByIndex(begin);
        }catch(Exception e) {
            throw e;
        }

    }


}
