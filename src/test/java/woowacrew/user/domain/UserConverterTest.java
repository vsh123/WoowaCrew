package woowacrew.user.domain;

import org.apache.tomcat.jni.Local;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserConverterTest {
    @Test
    void 올바른_유저를_입력했을_때_UserDto가_정상_출력() {
        User user = new User("userId", "url");
        UserDto userDto = UserConverter.userToUserDto(user);

        assertThat(userDto.getUserId()).isEqualTo("userId");
        assertThat(userDto.getUrl()).isEqualTo("url");
    }

    @Test
    void 유저값에_null이_존재_때_UserDto가_정상_출력() {
        User user = new User("userId", null);
        assertThrows(IllegalArgumentException.class, () -> UserConverter.userToUserDto(user));
    }

    @Test
    void 유저_정보를_정상적으로_반환한다() {
        User user = new User("123", "https");
        user.updateUserInfo("hyojae", LocalDate.of(1995, 6, 8));

        UserResponseDto actual = UserConverter.userToUserResponseDto(user);

        assertThat(actual.getUserId()).isEqualTo("123");
        assertThat(actual.getNickname()).isEqualTo("hyojae");
        assertThat(actual.getBirthday()).isEqualTo(LocalDate.of(1995, 6, 8));
    }
}