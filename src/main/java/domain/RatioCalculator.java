package domain;

import java.math.BigDecimal;
import java.util.Map;

public class RatioCalculator {
    private BigDecimal totalPrize;

    public RatioCalculator() {
        totalPrize = BigDecimal.ZERO;
    }

    public BigDecimal calculateRatio(int purchasePrice, Map<Rank, Integer> matchCount) {
        calculateTotalPrize(matchCount);
        return totalPrize.divide(new BigDecimal(purchasePrice), 2, BigDecimal.ROUND_HALF_UP);
    }

    private void calculateTotalPrize(Map<Rank, Integer> matchCount) {
        for (Rank rank : Rank.values()) {
            int prize = rank.getPrize();
            int count = matchCount.getOrDefault(rank, 0);
            totalPrize = totalPrize.add(new BigDecimal(prize * count));
        }
    }
}
