package com.bbva.uuaa.helloWorld.business.v0.impl;

import com.bbva.uuaa.helloWorld.business.v0.IBSrvHelloWorld;
import com.bbva.uuaa.helloWorld.business.v0.dto.*;
import org.springframework.stereotype.Service;
import java.util.Random;

@Service
public class BSrvHelloWorld implements IBSrvHelloWorld {
	long number;

	@Override
	public BDataOut mapBusiness(BDataIn bDataIn) {
		BDataOut response = new BDataOut();
		BDetails details = bDataIn.getBdetails();
		BLimitAmount limitAmount = details.getBLimitAmount();
		int amountInt = Integer.parseInt(limitAmount.getAmount());
		double maxAmount = amountInt * 1.05;
		double minAmount = amountInt * 0.9;
		BMaximumAmount maximumAmount = new BMaximumAmount();
		BMinimumAmount minimumAmount = new BMinimumAmount();
		maximumAmount.setAmount(String.valueOf(maxAmount));
		minimumAmount.setAmount(String.valueOf(minAmount));
		String id = String.format("%010d", new Random().nextInt(1_000_000_000));
		response.setId(id);
		response.setNuip(bDataIn.getNuip());
		response.setBmaximumamount(maximumAmount);
		response.setBminimumamount(minimumAmount);
		response.setBdetails(details);
		return response;
	}
}
