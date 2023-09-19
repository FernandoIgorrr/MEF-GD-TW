package Buildings.BuildingConstants;

import java.util.Map;
import java.util.HashMap;


public interface EFarm {

    public final static Map<Integer,Integer> LEVEL_POPULATION_FARM_MAP = new HashMap<>(){
        {
            put(1, 240);
            put(2, 281);
            put(3, 329);
            put(4, 386);
            put(5, 452);
            put(6, 530);
            put(7, 622);
            put(8, 729);
            put(9, 854);
            put(10, 1002);

            put(11, 1174);
            put(12, 1376);
            put(13, 1613);
            put(14, 1891);
            put(15, 2216);
            put(16, 2598);
            put(17, 3045);
            put(18, 3569);
            put(19, 4183);
            put(20, 4904);

            put(21, 5748);
            put(22, 6737);
            put(23, 7896);
            put(24, 9255);
            put(25, 10848);
            put(26, 12715);
            put(27, 14904);
            put(28, 17469);
            put(29, 20476);
            put(30, 24000);
        }
    };

    public final static Map<Integer,Integer> LEVEL_WOOD_COST_UP_MAP = new HashMap<>(){
        {
            put(1, 45);
            put(2, 59);
            put(3, 76);
            put(4, 88);
            put(5, 129);
            put(6, 167);
            put(7, 217);
            put(8, 282);
            put(9, 367);
            put(10, 477);

            put(11, 620);
            put(12, 806);
            put(13, 1_048);
            put(14, 1_363);
            put(15, 1_772);
            put(16, 2_303);
            put(17, 2_994);
            put(18, 3_893);
            put(19, 5_060);
            put(20, 6_579);

            put(21, 8_552);
            put(22, 11_118);
            put(23, 14_453);
            put(24, 18_789);
            put(25, 24_426);
            put(26, 31_754);
            put(27, 41_280);
            put(28, 53_664);
            put(29, 69_763);
            put(30, 90_692);
        }
    };

}
