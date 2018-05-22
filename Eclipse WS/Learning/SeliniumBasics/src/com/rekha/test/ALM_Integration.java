package com.rekha.test;

import com.jacob.com.LibraryLoader;
import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.enums.StatusAs;

import atu.alm.wrapper.exceptions.ALMServiceException;

public class ALM_Integration {

	public static void main(String[] args) throws InterruptedException, ALMServiceException 
	
	{
		System.setProperty("jacob.dll.path", "D:\\Renuka\\Selinium\\Eclipse WS\\Learning\\SeliniumBasics\\jacob-1.18-x86.dll");
		LibraryLoader.loadJacobLibrary();
		
		ALMServiceWrapper wrapper = new ALMServiceWrapper("http://cusvqc01/qcbin/");
		Thread.sleep(3000);	
				
		wrapper.connect("bc.renuka","Kulfi@01", "DUBAI_CUSTOMS_ITBUILD", "Coastal_Vessel_Management");
		Thread.sleep(3000);
		System.out.println("QC connected");
		
		wrapper.updateResult("SIT_Release_1 - Cycle 3", "VES.MT.UC05", 1573, "test", StatusAs.FAILED);
		

	}

}
