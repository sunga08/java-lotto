package lotto.domain;

import java.util.List;

public class WinningLotto {
    private Lotto winningLotto;
    private int bonusNumber;

    public WinningLotto(List<Integer> winningNumbers){
        winningLotto = new Lotto(winningNumbers);
    }

    public WinningLotto(List<Integer> winningNumbers, int bonusNumber){
        this(winningNumbers);
        this.bonusNumber = bonusNumber;
    }

    public Rank matchRank(Lotto lotto) {
        int myMatchCount = winningLotto.matchCount(lotto);
        boolean isBonus = lotto.isMatchBonusNumber(bonusNumber);

        return Rank.rankOf(myMatchCount, isBonus);
    }

    public Rank matchRankByRankCondition(Lotto lotto) {
        int myMatchCount = winningLotto.matchCount(lotto);
        boolean isBonus = lotto.isMatchBonusNumber(bonusNumber);

        RankMapping rankMapping = new RankMapping();
        RankCondition rankCondition = rankMapping.rank(myMatchCount, isBonus);

        return rankCondition.matchRank(myMatchCount);
    }
}
