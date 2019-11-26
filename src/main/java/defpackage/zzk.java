package defpackage;

/* renamed from: zzk */
public final class zzk implements afmj {
    private final aoqt a;

    public zzk(aoqt aoqt) {
        this.a = (aoqt) amqw.a((Object) aoqt);
    }

    public final boolean a() {
        aoqt aoqt = this.a;
        return (aoqt.a & 1) != 0 ? aoqt.b : false;
    }

    public final int b() {
        aoqt aoqt = this.a;
        if ((aoqt.a & 2) == 0) {
            return 12;
        }
        return aoqt.c;
    }

    public final int c() {
        aoqt aoqt = this.a;
        if ((aoqt.a & 4) == 0) {
            return 120;
        }
        return aoqt.d;
    }
}
