package com.example.coinapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.sql.Timestamp;
import com.example.coinapp.model.CoinData;
import com.example.coinapp.repository.CoinDataRepository;

@Service
public class CoinService {

    @Autowired
    private CoinDataRepository coinDataRepository;

    private static final String API_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest";
    private static final String API_KEY = "27ab17d1-215f-49e5-9ca4-afd48810c149";

    public CoinData fetchCoinData(Long userId, String symbol) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-CMC_PRO_API_KEY", API_KEY);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(API_URL + "?symbol=" + symbol, HttpMethod.GET, entity, String.class);

        CoinData coinData = new CoinData();
        coinData.setUserId(userId);
        coinData.setSymbol(symbol);
        coinData.setData(response.getBody());
        coinData.setTimestamp(new Timestamp(System.currentTimeMillis()));

        return coinDataRepository.save(coinData);
    }
}
