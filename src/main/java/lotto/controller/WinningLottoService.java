package lotto.controller;

import java.util.List;
import lotto.domain.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;

public class WinningLottoService {

    public Lotto craeteWinningLotto() {
        do {
            try {
                List<Integer> numbers = InputView.inputWinningNumber();
                return new Lotto(numbers);
            } catch (IllegalArgumentException e) {
                OutputView.printMessage(e.getMessage());
            }
        } while (true);

    }


}
