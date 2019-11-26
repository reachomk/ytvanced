package defpackage;

/* renamed from: afbd */
final class afbd extends oau {
    private final long b;
    private final Object c;

    afbd(afaj afaj) {
        this.b = nyr.b(afaj.e().d);
        this.c = afaj;
    }

    public final int a() {
        return 1;
    }

    public final int b() {
        return 1;
    }

    public final oav a(int i, oav oav, boolean z, long j) {
        oxz.a(i, 1);
        oav.a(z ? this.c : null, -9223372036854775807L, -9223372036854775807L, true, this.b);
        return oav;
    }

    public final oaw a(int i, oaw oaw, boolean z) {
        oxz.a(i, 1);
        oaw.a(z ? "YtVodPeriodUid" : null, this.b, 0);
        return oaw;
    }

    public final int a(Object obj) {
        return !"YtVodPeriodUid".equals(obj) ? -1 : 0;
    }

    public final Object a(int i) {
        oxz.a(i, 1);
        return "YtVodPeriodUid";
    }
}
