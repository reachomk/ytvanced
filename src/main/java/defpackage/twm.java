package defpackage;

import android.os.SystemClock;

/* renamed from: twm */
public final class twm {
    public final long a;
    public long b;
    public long c;
    public int d;
    public int e;
    public final String f;
    public String g;
    public int h;
    public String i;
    public bcdf j;
    public bcbb k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p = 1;

    public twm(String str) {
        String str2 = null;
        if (!(str == null || str.isEmpty())) {
            str2 = str;
        }
        this.f = str2;
        this.a = SystemClock.elapsedRealtime();
    }
}
