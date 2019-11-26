package defpackage;

import android.util.SparseArray;

/* renamed from: aini */
public class aini {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final SparseArray h;
    private final int i;
    private final int j;
    private final long k;
    private final long l;

    public aini(String str, int i, String str2, long j) {
        boolean z = true;
        amqw.a(str != null);
        amqw.a(str2 != null);
        amqw.a(i >= 0);
        amqw.a(j >= 0);
        this.f = str;
        this.g = i;
        this.l = j;
        String[] split = str2.split("#", -1);
        amqw.a(split.length == 8);
        this.a = Integer.parseInt(split[0]);
        this.b = Integer.parseInt(split[1]);
        this.i = Integer.parseInt(split[2]);
        this.j = Integer.parseInt(split[3]);
        this.c = Integer.parseInt(split[4]);
        this.k = Long.parseLong(split[5]);
        this.d = split[6];
        this.e = split[7];
        amqw.a(this.a > 0);
        amqw.a(this.b > 0);
        if (j > 0) {
            amqw.a(this.i > 0);
        }
        amqw.a(this.j > 0);
        if (this.c <= 0) {
            z = false;
        }
        amqw.a(z);
        this.h = new SparseArray();
    }

    public int a() {
        return b() > 0 ? (int) Math.ceil((double) (((float) b()) / ((float) c()))) : 0;
    }

    public int a(long j) {
        int round;
        int b = b() - 1;
        long j2 = this.k;
        if (j2 == 0) {
            round = Math.round(((float) b()) * (((float) j) / ((float) this.l)));
        } else {
            round = Math.round(((float) j) / ((float) j2));
        }
        return Math.max(0, Math.min(b, round));
    }

    public int b() {
        return this.i;
    }

    public final int c() {
        return this.j * this.c;
    }
}
