package com.teriteri.backend.service.video;

import com.teriteri.backend.pojo.CustomResponse;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface VideoService {
    List<Map<String, Object>> getVideosWithUserAndCategoryByIds(Set<Object> set, Integer index, Integer quantity);

    Map<String, Object> getVideoWithUserAndCategoryById(Integer vid);

    CustomResponse updateVideoStatus(Integer vid, Integer status);
}
