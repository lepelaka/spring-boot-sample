package net.lepelaka.boot.springboot.service;

import lombok.RequiredArgsConstructor;
import net.lepelaka.boot.springboot.domain.posts.PostsRepository;
import net.lepelaka.boot.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }
}
