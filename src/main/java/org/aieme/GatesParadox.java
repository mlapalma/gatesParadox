package org.aieme;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GatesParadox {

	public static void main(String[] args){

		System.out.println(runCases(10000));
	}

	private static List<Gate> initializeGatesAndSetSelectedByUser(){
		int[] gateIds = new int[]{0,1,2};
		List<Gate> gates = new ArrayList<Gate>(3);
		int randomGateToPutCar = randomGateNumber();
		int randomGateSelectedByUser = randomGateNumber();

		for (int gateId:gateIds){
			boolean putCar=false;
			if (gateId==randomGateToPutCar){
				putCar=true;
			}
			Gate gate = new Gate(gateId,putCar);
			if (gateId==randomGateSelectedByUser){
				gate.setSelectedByUser(true);
			} else{
				gate.setSelectedByUser(false);
			}
			gates.add(gate);
		}

		return gates;
	}

	private static int randomGateNumber(){
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(3);
	}

	private static List<Gate> setFirstEmptyUnselectedSelectedByManager(List<Gate> gates){
		boolean oneGateAlreadySelected=false;
		for(Gate gate: gates){
			if (!oneGateAlreadySelected && !gate.isSelectedByUser() && !gate.isContainsCar()){
				oneGateAlreadySelected=true;
				gate.setSelectedByManager(true);
			}
		}
		return gates;
	}

	private static Results runCases(int totalCases){
		Results results = new Results(totalCases);
		int totalOnFirstOption=0;
		int totalOnChangeOption=0;
		int prcFirst=0;
		int prcChange=0;
		for (int x=0;x<totalCases;x++){
			List<Gate> gates = setFirstEmptyUnselectedSelectedByManager(initializeGatesAndSetSelectedByUser());
			for(Gate gate:gates){
				if (!gate.isSelectedByManager() && gate.isSelectedByUser() && gate.isContainsCar()){
					totalOnFirstOption++;
				} else if(!gate.isSelectedByManager() && gate.isContainsCar()){
					totalOnChangeOption++;
				}
			}
		}
		prcFirst=totalOnFirstOption*100/totalCases;
		prcChange=totalOnChangeOption*100/totalCases;
		results.setTotalOnFirstOption(totalOnFirstOption);
		results.setTotalOnChangeOption(totalOnChangeOption);
		results.setPrcFirst(prcFirst);
		results.setPrcChange(prcChange);

		return results;
	}

}
