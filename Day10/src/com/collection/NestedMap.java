package com.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NestedMap {
	public static void main(String[] args) {
		Map<String, Map<String, String>> employeeMap = new HashMap<>();//One key - Alex

		Map<String, String> addressMap = new HashMap<>();
		addressMap.put("Permanent", "Florida");
		addressMap.put("Postal", "Canada");

		employeeMap.put("Alex", addressMap);
		employeeMap.put("Rahul",addressMap);

		System.out.println(employeeMap);

		employeeMap.get("Alex").put("Hideout", "UAE");
		System.out.println(employeeMap);
//
		employeeMap.get("Alex").remove("Hideout");
		System.out.println(employeeMap);

//		// Iterate OuterMap
		for (Map.Entry<String, Map<String, String>> empMap : employeeMap.entrySet()) {
			Map<String, String> addMap = empMap.getValue();//Map associated with the key... associate with Alex 
			System.out.println(empMap.getKey()+"==>");

			// Iterate InnerMap
			for (Map.Entry<String, String> addressSet : addMap.entrySet()) {
				System.out.println(addressSet.getKey() + " :: " + addressSet.getValue());
			}
		}

	}
}

