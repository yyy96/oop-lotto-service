package lotto.model;


import java.util.ArrayList;
import java.util.List;

public class AutoLottoNumbers {

    private final List<LottoNumbers> autoLottoNumbers = new ArrayList<>();
    public AutoLottoNumbers(int gameCount) {
        for (int count = 0; count < gameCount; count++) {
            autoLottoNumbers.add(AutoLotto.getAutoLottoNumbers());
        }
    }

    public List<LottoNumbers> getAutoLottoNumbers() {
        return this.autoLottoNumbers;
    }
}