package woowacrew.user.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import woowacrew.degree.domain.Degree;
import woowacrew.user.domain.User;
import woowacrew.user.domain.UserRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserInternalServiceTest {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserInternalService userInternalService;

    @Test
    void findByOauthId() {
        String userId = "userId";
        User user = new User(userId, new Degree());
        when(userRepository.findByOauthId(userId)).thenReturn(Optional.ofNullable(user));

        User expectUser = userInternalService.findByOauthId(userId);

        assertThat(expectUser.getOauthId()).isEqualTo(userId);
    }

    @Test
    void findByDegreeId() {
        List<User> users = Arrays.asList(new User("1", new Degree()));
        Long degreeId = 1L;
        when(userRepository.findByDegreeIdAndNicknameNotNull(degreeId)).thenReturn(users);

        List<User> actualUsers = userInternalService.findByDegreeId(degreeId);

        assertThat(actualUsers).isEqualTo(users);
    }

    @Test
    void countByDegreeId() {
        Long degreeId = 1L;
        int numberOfUser = 6;

        when(userRepository.countByDegreeIdAndNicknameNotNull(degreeId)).thenReturn(numberOfUser);

        int actualNumberOfCount = userInternalService.countByDegreeId(degreeId);

        assertThat(actualNumberOfCount).isEqualTo(numberOfUser);
    }

    @Test
    @DisplayName("정상적으로 이번달 생일자들을 가져온다.")
    void findUpcomingBirthdayBy() {
        User firstUser = new User("test", new Degree());
        User secondUser = new User("test2", new Degree());
        User thirdUser = new User("test3", new Degree());
        firstUser.updateUserInfo("test", LocalDate.of(1995, 6, 20));
        secondUser.updateUserInfo("test", LocalDate.of(1991, 6, 1));
        thirdUser.updateUserInfo("test", LocalDate.of(1991, 7, 1));
        List<User> users = Arrays.asList(firstUser, secondUser);

        when(userRepository.findAll()).thenReturn(users);

        List<User> result = userInternalService.findUpcomingBirthdayBy(Month.JUNE);

        for (User user : result) {
            assertThat(user.getBirthday().getMonth()).isEqualTo(Month.JUNE);
        }
    }
}