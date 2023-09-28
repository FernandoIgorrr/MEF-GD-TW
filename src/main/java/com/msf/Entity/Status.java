package com.msf.Entity;

import com.msf.Entity.Powerups.plusLife;

public class Status {
    Integer level;
    Integer health;
    Integer armor;
    Integer physicalDamageReducion_PERCENT;

    public Status(Integer armor){
        this.armor = armor;
        getPhysicalDamageReduction();
        System.out.println("PHYSICAL DAMAGE REDUCION: " + physicalDamageReducion_PERCENT);
    }

    public void getPhysicalDamageReduction(){
        //Função de reduão de dano com base na armadura
        //Quanto mais armadura se tem menos efetivo a armadura adicional é

       
        int foo = (int)((1 - Math.pow(Math.E, ((double)armor / 100)*(-1))) * 100);

        physicalDamageReducion_PERCENT = foo;
    }
}
