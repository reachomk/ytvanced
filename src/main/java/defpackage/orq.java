package defpackage;

import java.util.List;

/* renamed from: orq */
public abstract class orq extends odm implements ork {
    private ork a;
    private long b;

    public final void a(long j, ork ork, long j2) {
        this.timeUs = j;
        this.a = ork;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.b = j;
    }

    public final int a() {
        return this.a.a();
    }

    public final long a(int i) {
        return this.a.a(i) + this.b;
    }

    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    public final List b(long j) {
        return this.a.b(j - this.b);
    }

    public final void clear() {
        super.clear();
        this.a = null;
    }
}
