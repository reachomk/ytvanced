package defpackage;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bcrb */
final class bcrb {
    private static ConcurrentMap n = new ConcurrentHashMap();
    public final String[] a;
    public final String[] b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final TreeMap g;
    public final TreeMap h;
    public final TreeMap i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    static bcrb a(Locale locale) {
        Object locale2;
        if (locale2 == null) {
            locale2 = Locale.getDefault();
        }
        bcrb bcrb = (bcrb) n.get(locale2);
        if (bcrb == null) {
            bcrb = new bcrb(locale2);
            bcrb bcrb2 = (bcrb) n.putIfAbsent(locale2, bcrb);
            return bcrb2 == null ? bcrb : bcrb2;
        }
    }

    private static String[] a(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    private static String[] b(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    private static void a(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                Object obj = strArr[length];
                if (obj != null) {
                    treeMap.put(obj, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    private static void a(TreeMap treeMap, int i, Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(String.valueOf(i2).intern(), numArr[i2]);
        }
    }

    private static int c(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            String str = strArr[length];
            if (str != null) {
                int length2 = str.length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }

    private bcrb(Locale locale) {
        DateFormatSymbols a = bcpo.a(locale);
        this.a = a.getEras();
        this.b = bcrb.b(a.getWeekdays());
        this.c = bcrb.b(a.getShortWeekdays());
        this.d = bcrb.a(a.getMonths());
        this.e = bcrb.a(a.getShortMonths());
        this.f = a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        this.g = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        bcrb.a(this.g, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            this.g.put("BCE", numArr[0]);
            this.g.put("CE", numArr[1]);
        }
        this.h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        bcrb.a(this.h, this.b, numArr);
        bcrb.a(this.h, this.c, numArr);
        bcrb.a(this.h, 7, numArr);
        this.i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        bcrb.a(this.i, this.d, numArr);
        bcrb.a(this.i, this.e, numArr);
        bcrb.a(this.i, 12, numArr);
        this.j = bcrb.c(this.a);
        this.k = bcrb.c(this.b);
        bcrb.c(this.c);
        this.l = bcrb.c(this.d);
        bcrb.c(this.e);
        this.m = bcrb.c(this.f);
    }
}
