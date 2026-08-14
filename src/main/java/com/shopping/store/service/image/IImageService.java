package com.shopping.store.service.image;

import com.shopping.store.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {

    Image getImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
    void deleteImageById(Long id);

}
