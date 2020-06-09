package com.thoughtworks.capability.gtb;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int thisYear = date.getYear();
    LocalDate laborDay = LocalDate.of(thisYear,5,1);
    if (!date.isBefore(laborDay)) {
      laborDay = laborDay.plusYears(1);
    }
    return ChronoUnit.DAYS.between(date, laborDay);
  }
}
