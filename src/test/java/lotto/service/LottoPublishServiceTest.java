package lotto.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lotto.enums.LottoRule;
import lotto.repository.Lotto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class LottoPublishServiceTest {

    LottoPublishService lottoPublishService;

    @BeforeEach
    void setup() {
        lottoPublishService =
                LottoPublishService.getInstance();
    }

    @DisplayName("중복되지_않는_6개의_숫자_생성")
    @RepeatedTest(5)
    void 중복되지_않는_6개의_숫자_생성() {
        // give
        lottoPublishService.lottoPublish("2000");
        List<Lotto> lottos = lottoPublishService.getPublishedLottoNumbers();
        // when
        Set<Integer> dinstinctLottos = new HashSet<>(lottos.get(0).getNumbers());
        // then
        assertThat(dinstinctLottos.size()).isEqualTo(LottoRule.LOTTO_MAX_COUNT.getValue());
    }
}