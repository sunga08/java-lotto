package lotto.domain;

import java.util.List;

public class WinningLotto {
    private Lotto lotto;
    private int bonusNo;

    public WinningLotto(List<Integer> winningNumbers){
        lotto = new Lotto(winningNumbers);
    }

    public int matchCount(Lotto lotto){
        int matchCount = 0;

        for(int i = 0; i < lotto.numbers().size(); i++){
            matchCount = lotto.addMatchCount(matchCount, lotto.numberOf(i));
        }

        return matchCount;
    }

    public int winningLottoOf(int index){
        return lotto.numberOf(index);
    }

}
