package defpackage;

import java.io.Serializable;

/* renamed from: bcpm */
public abstract class bcpm implements Serializable {
    public static final bcpm a = new bcpp("era", (byte) 1, bcpw.a, null);
    public static final bcpm b = new bcpp("yearOfEra", (byte) 2, bcpw.d, bcpw.a);
    public static final bcpm c = new bcpp("centuryOfEra", (byte) 3, bcpw.b, bcpw.a);
    public static final bcpm d = new bcpp("yearOfCentury", (byte) 4, bcpw.d, bcpw.b);
    public static final bcpm e = new bcpp("year", (byte) 5, bcpw.d, null);
    public static final bcpm f = new bcpp("dayOfYear", (byte) 6, bcpw.g, bcpw.d);
    public static final bcpm g = new bcpp("monthOfYear", (byte) 7, bcpw.e, bcpw.d);
    public static final bcpm h = new bcpp("dayOfMonth", (byte) 8, bcpw.g, bcpw.e);
    public static final bcpm i = new bcpp("weekyearOfCentury", (byte) 9, bcpw.c, bcpw.b);
    public static final bcpm j = new bcpp("weekyear", (byte) 10, bcpw.c, null);
    public static final bcpm k = new bcpp("weekOfWeekyear", (byte) 11, bcpw.f, bcpw.c);
    public static final bcpm l = new bcpp("dayOfWeek", (byte) 12, bcpw.g, bcpw.f);
    public static final bcpm m = new bcpp("halfdayOfDay", (byte) 13, bcpw.h, bcpw.g);
    public static final bcpm n = new bcpp("hourOfHalfday", (byte) 14, bcpw.i, bcpw.h);
    public static final bcpm o = new bcpp("clockhourOfHalfday", (byte) 15, bcpw.i, bcpw.h);
    public static final bcpm p = new bcpp("clockhourOfDay", (byte) 16, bcpw.i, bcpw.g);
    public static final bcpm q = new bcpp("hourOfDay", (byte) 17, bcpw.i, bcpw.g);
    public static final bcpm r = new bcpp("minuteOfDay", (byte) 18, bcpw.j, bcpw.g);
    public static final bcpm s = new bcpp("minuteOfHour", (byte) 19, bcpw.j, bcpw.i);
    public static final long serialVersionUID = -42615285973990L;
    public static final bcpm t = new bcpp("secondOfDay", (byte) 20, bcpw.k, bcpw.g);
    public static final bcpm u = new bcpp("secondOfMinute", (byte) 21, bcpw.k, bcpw.j);
    public static final bcpm v = new bcpp("millisOfDay", (byte) 22, bcpw.l, bcpw.g);
    public static final bcpm w = new bcpp("millisOfSecond", (byte) 23, bcpw.l, bcpw.k);
    public final String x;

    protected bcpm(String str) {
        this.x = str;
    }

    public abstract bcpn a(bcpl bcpl);

    public abstract bcpw a();

    public abstract bcpw b();

    public final String toString() {
        return this.x;
    }
}
