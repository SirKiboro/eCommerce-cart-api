package com.shopping.store.service.image;

import com.shopping.store.dto.ImageDto;
import com.shopping.store.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {

    Image getImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> files, Long productId);
    void updateImage(MultipartFile file, Long imageId);
    void deleteImageById(Long id);

}
