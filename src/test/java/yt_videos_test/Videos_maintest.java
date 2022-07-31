package yt_videos_test;

import java.util.Map;

import org.testng.annotations.Test;

import Datautils.Data_Supplier;
import yt_videos_pages.Searchpage;

public class Videos_maintest extends Videos_basetest{
	
	
	@Test(dataProvider = "Youtube_data" , dataProviderClass = Data_Supplier.class)
	
	
	public void youtube(Map obj) throws InterruptedException {
		Searchpage  s = new Searchpage(driver);
		s.searching_channel((String) obj.get("channel"));
		s.running_video();
		
	}
	
	
	

}
