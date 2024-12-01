class StockMaxProfit {
    fun maxProfit(prices: IntArray): Int {
        var maxprofit = 0
        for (i in 0 until prices.size - 1) {
            for (j in i + 1 until prices.size) {
                val profit = prices[j] - prices[i]
                if (profit > maxprofit) maxprofit = profit
            }
        }
        return maxprofit
    }
}