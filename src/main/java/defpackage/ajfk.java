package defpackage;

import android.net.Uri;
import java.util.Locale;

/* renamed from: ajfk */
public final class ajfk implements aftl {
    public airc a;
    public long b;
    public boolean c;
    private final xhv d;
    private final xsc e;
    private final long g;
    private final String h;
    private final int i;

    public final String a() {
        return "VideoStats2MacroConverter";
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) ajfn.a.get(str);
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 1:
                return ajfk.a(this.b);
            case 2:
                return this.h;
            case 3:
                return !this.c ? "pause" : "playing";
            case 4:
                return String.valueOf(this.d.k());
            case 5:
                return ajfk.a(this.e.b() - this.g);
            case 6:
                airc airc = this.a;
                if (airc == null) {
                    return "0";
                }
                return airc.a();
            case 7:
                return airj.b(this.i);
            default:
                return null;
        }
    }

    private static String a(long j) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        double d = (double) j;
        Double.isNaN(d);
        objArr[0] = Double.valueOf(d / 1000.0d);
        return String.format(locale, "%.1f", objArr);
    }

    ajfk(xhv xhv, airc airc, int i, xsc xsc, long j, String str) {
        this.d = xhv;
        this.i = i;
        this.a = airc;
        this.e = xsc;
        this.g = j;
        this.h = str;
    }
}
