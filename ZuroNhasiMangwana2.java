/**
 * @author loynaps c5e5 7518 Program:ZuroNhasiMangwana.java Description:This is an java program
 *     writtten for a module for an event booking application for Shona speaking users Use the Web
 *     to learn how to use the LocalDate Boolean methods *isBefore(),isAfter() and equals(). Use
 *     your knowledge to write a program that prompts a user for a month, day, and year and then
 *     displays a message specifying whether the entered day is in the past, the current date, or in
 *     the future. Save the file as
 */

import java.time.*;
import java.util.*;

public class ZuroNhasiMangwana2 {

  private static LocalDate nhasi = LocalDate.now();
  private static LocalDate musiWanyorwa;
  private static int mwedzi, zuva, gore;
  private static String zvanyogwa;
  private static final String MUSI_PAST = " rakato darika";
  private static final String MUSI_PRESENT = " ndera nhasi";
  private static final String MUSI_FUTURE = " harisati rasvika";

  public static void main(String[] args) {
    toraDate();
  }

  public static void toraDate() {
    Scanner input = new Scanner(System.in);
    System.out.print("\tNyora zuva >> ");
    zuva = input.nextInt();
    System.out.print("\tNyora mwedzi >> ");
    mwedzi = input.nextInt();
    System.out.print("\tNyora gore (manhamba mana) >> ");
    gore = input.nextInt();
    processDate(gore, mwedzi, zuva);
  }

  public static void processDate(int gore, int mwedzi, int zuva) {
    musiWanyorwa = LocalDate.of(gore, mwedzi, zuva);
    if (musiWanyorwa.isBefore(nhasi)) {
      zvanyogwa = MUSI_PAST;
    } else if (musiWanyorwa.equals(nhasi)) {
      zvanyogwa = MUSI_PRESENT;
    } else zvanyogwa = MUSI_FUTURE;

    System.out.println("\tZuva remusi wa: " + musiWanyorwa + zvanyogwa + "\n");
  }
}
