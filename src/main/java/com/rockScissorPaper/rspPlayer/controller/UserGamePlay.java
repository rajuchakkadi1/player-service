package com.rockScissorPaper.rspPlayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rockScissorPaper.rspPlayer.clients.SystemClient;
import com.rockScissorPaper.rspPlayer.to.GameTO;

@RestController
public class UserGamePlay {

	@Autowired
	private SystemClient systemClient;

	@GetMapping(value = "/user-game-play/{sign}")
	public GameTO userGamePlay(@PathVariable String sign) {
		String sysSign = systemClient.getSystemSign();
		String status = "";
		if (sign.equals(sysSign)) {
			status = "draw";
		} else if (sysSign.equals("paper") && sign.equals("scissor")) {
			status = "win";
		} else if (sysSign.equals("scissor") && sign.equals("paper")) {
			status = "win";
		} else if (sysSign.equals("rock") && sign.equals("paper")) {
			status = "win";
		} else {
			status = "loose";
		}
		return new GameTO(status, sign, sysSign);
	}
}
