package com.chainsys.gameandscore.businesslogic;

import java.time.LocalDate;

public class Logic {
private Logic() {
}
	public static LocalDate getInstanceDate() {
        return java.time.LocalDate.now();
    }
}