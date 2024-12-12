package com.gn.homework02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	private Set<Lottery> lottery = new HashSet<Lottery>();
	private Set<Lottery> win = new HashSet<Lottery>();

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
		List<Lottery> lotteryList = new ArrayList<Lottery>();
		win.add(null);
		// 2. 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고
		// 인덱스를 이용해 win에 당첨자 저장
		// 이때, 당첨자 수는 무조건 4명 이를 위한 추첨자 수는 4명 이상
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외
		// 삭제된 사람의 자리만 새로운 추첨자로 채우기
		return lottery;

	}

	public Set<Lottery> sortedWinObject() {
		return lottery;

	}

	public boolean searchWinnder(Lottery l) {
		return false;

	}
}
