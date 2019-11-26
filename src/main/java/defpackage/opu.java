package defpackage;

/* renamed from: opu */
public final class opu extends oau {
    private static final Object b = new Object();
    private final long c = -9223372036854775807L;
    private final long d = -9223372036854775807L;
    private final long e;
    private final long f;
    private final boolean g;
    private final Object h;

    public opu(long j, boolean z) {
        this.e = j;
        this.f = j;
        this.g = z;
        this.h = null;
    }

    public final int a() {
        return 1;
    }

    public final int b() {
        return 1;
    }

    public final oav a(int i, oav oav, boolean z, long j) {
        oxz.a(i, 1);
        oav.a(null, this.c, this.d, this.g, this.f);
        return oav;
    }

    public final oaw a(int i, oaw oaw, boolean z) {
        oxz.a(i, 1);
        oaw.a(z ? b : null, this.e, 0);
        return oaw;
    }

    public final int a(Object obj) {
        return !b.equals(obj) ? -1 : 0;
    }

    public final Object a(int i) {
        oxz.a(i, 1);
        return b;
    }
}
