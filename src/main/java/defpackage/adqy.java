package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: adqy */
public abstract class adqy implements adtq {
    private static final List e = Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(6)});
    public Boolean a;
    public Integer b;
    public final int c;
    public int d = 1;

    protected adqy(int i) {
        this.c = i;
    }

    public abstract void J();

    public abstract void c(adpw adpw);

    public final void a(adpw adpw) {
        this.d = 1;
        this.a = null;
        this.b = null;
        c(adpw);
    }

    public final void a() {
        b(2);
    }

    public final boolean e() {
        Boolean bool = this.a;
        return (bool != null && bool.booleanValue()) || (this.c & 1) != 0;
    }

    public Integer c() {
        return this.b;
    }

    public final boolean K() {
        if (d() != 2) {
            return false;
        }
        List list = e;
        int I = I();
        int i = I - 1;
        if (I != 0) {
            return list.contains(Integer.valueOf(i)) ^ 1;
        }
        throw null;
    }

    public final void b(int i) {
        if (this.d == 1) {
            this.d = i;
        }
        J();
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, int i2) {
        if (this.d == 1) {
            this.b = Integer.valueOf(i2);
        }
        b(i);
    }

    public int I() {
        return this.d;
    }
}
