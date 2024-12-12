package com.gn.homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<>();
	private Set<Lottery> win = new HashSet<>();

	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}

	public boolean deleteObject(Lottery l) {
		boolean isDelete = lottery.remove(l);
		if (isDelete && win != null) {
			win.remove(l);
		}
		return isDelete;
	}

	public Set<Lottery> searchObject() {
		return lottery;
	}

	public Set<Lottery> winObject() {
		if (lottery.size() < 4) {
			return null;
		}

		List<Lottery> lotteryList = new ArrayList<>(lottery);
		Set<Lottery> winner = new HashSet<>();
		Random random = new Random();

		while (winner.size() < 4) {
			int index = random.nextInt(lotteryList.size());
			winner.add(lotteryList.get(index));
		}
		win = winner;
		return winner;
	}

	public Set<Lottery> sortedWinObject() {
		List<Lottery> sortedWinner = new ArrayList<>(win);
		sortedWinner.sort((l1, l2) -> {
			int nameComparison = l1.getName().compareTo(l2.getName());
			if (nameComparison != 0) {
				return nameComparison;
			}
			return l1.getPhone().compareTo(l2.getPhone());
		});
		return new HashSet<>(sortedWinner);
	}

	public boolean searchWinner(Lottery l) {
		return win.contains(l);
	}
}
