package com.github.dejvvit13.videostreamingreactiveapp.video.model.dto;

import com.github.dejvvit13.videostreamingreactiveapp.video.model.document.Video;
import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

@Builder
public record VideoCreateDto(String title, String description, MultipartFile file) {

    public Video toVideo(String uuid) {
        return Video.builder()
                .uuid(uuid)
                .title(title)
                .description(description)
                .url("http://localhost:8080/api/v1/streaming/" + uuid)
                .build();
    }


}
