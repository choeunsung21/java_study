package com.gn.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {
	private Map<String, Member> map = new HashMap<String, Member>();

	public boolean joinMember(String id, Member m) {
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}
		return false;

	}

	public String login(String id, String password) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;

	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;

	}

	public void changeName(String id, String newName) {
		map.get(id).setName(newName);
	}

	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> memberTree = new TreeMap<String, String>();
		Set<String> memberSet = map.keySet();
		Iterator<String> itKey = memberSet.iterator();
		while (itKey.hasNext()) {
			String memberKey = itKey.next();
			if (name.equals(map.get(memberKey).getName())) {
				memberTree.put(memberKey, map.get(memberKey).getName());
			}
		}
		return memberTree;
	}
}
