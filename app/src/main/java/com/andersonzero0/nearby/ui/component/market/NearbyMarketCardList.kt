package com.andersonzero0.nearby.ui.component.market

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.andersonzero0.nearby.data.model.Market
import com.andersonzero0.nearby.data.model.mock.mockMarkets
import com.andersonzero0.nearby.ui.theme.Gray100
import com.andersonzero0.nearby.ui.theme.RedBase
import com.andersonzero0.nearby.ui.theme.Typography

@Composable
fun NearbyMarketCardList(
    modifier: Modifier = Modifier,
    markets: List<Market>,
    onMarketClick: (Market) -> Unit
) {
    LazyColumn(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(text = "Exprore locais perto de você", style = Typography.bodyLarge, color = Color.Black)
        }
        items(items = markets, key = { it.id }) { market ->
            NearbyMarketCard(market = market, onClick = { onMarketClick(market) })
        }
    }
}

@Preview
@Composable
private fun NearbyMarketCardListPreview() {
    NearbyMarketCardList(
        markets = mockMarkets,
        onMarketClick = {}
    )
}