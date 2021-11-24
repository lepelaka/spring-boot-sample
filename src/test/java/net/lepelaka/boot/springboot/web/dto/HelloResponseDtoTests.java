package net.lepelaka.boot.springboot.web.dto;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class HelloResponseDtoTests {
    @Test
    public void 롬복_테스트() {
        // given
        String name = "test";
        int amount = 1000;
        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
