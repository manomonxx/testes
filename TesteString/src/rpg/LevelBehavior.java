package rpg;

import java.util.Map;

public interface LevelBehavior {
	//void levelUp(); //aumentar level do personagem
	//void setBonus(Integer str_, Integer agi_, Integer int_, Integer dex_); 
	
	Map<String, String> status();
	
	//distribui os pontos b�nus - ordem str/agi/int/dex
	Boolean setStr_(Integer str_);
	Boolean setAgi_(Integer agi_);
	Boolean setInt_(Integer int_);
	Boolean setDex_(Integer dex_);
	Boolean setVit_(Integer vit_);
	
	void setExperience(long exp);
}
