package com.shopping.store.service.image;

import com.shopping.store.exceptions.ResourceNotFoundException;
import com.shopping.store.model.Image;
import com.shopping.store.repository.ImageRepository;
import com.shopping.store.service.product.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.SQLException;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService{

    private final ImageRepository imageRepository;
    private final IProductService iProductService;


    @Override
    public Image getImageById(Long id) {
        return imageRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No image found with id"+ id));
    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public void updateImage(MultipartFile file, Long imageId) {

        Image image = getImageById(imageId);

        try {

            image.setFileName(file.getOriginalFilename());
            //image.setFileType(file.getContentType());
            image.setImage(new SerialBlob(file.getBytes()));
            imageRepository.save(image);
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e.getMessage());
        }


    }

    @Override
    public void deleteImageById(Long id) {
        imageRepository.findById(id)
                .ifPresentOrElse(imageRepository :: delete, ()-> {
                    throw new ResourceNotFoundException("No image found with id "+id);
                });

    }
}
