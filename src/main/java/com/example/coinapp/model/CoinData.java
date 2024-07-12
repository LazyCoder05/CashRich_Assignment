package com.example.coinapp.model;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "coin_data")
public class CoinData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String symbol;
    private String data;
    private Timestamp timestamp;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	
	@Override
	public String toString() {
		return "CoinData [id=" + id + ", userId=" + userId + ", symbol=" + symbol + ", data=" + data + ", timestamp="
				+ timestamp + "]";
	}
	
	public CoinData(Long id, Long userId, String symbol, String data, Timestamp timestamp) {
		super();
		this.id = id;
		this.userId = userId;
		this.symbol = symbol;
		this.data = data;
		this.timestamp = timestamp;
	}
	public CoinData() {
		super();
	}

    
}
