package net.lepelaka.boot.springboot.web;

import lombok.RequiredArgsConstructor;
import net.lepelaka.boot.springboot.domain.posts.Posts;
import net.lepelaka.boot.springboot.service.PostsService;
import net.lepelaka.boot.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }
}
