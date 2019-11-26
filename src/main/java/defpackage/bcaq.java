package defpackage;

/* renamed from: bcaq */
public final class bcaq extends anxo implements anzf {
    private bcaq() {
        super(bcan.i);
    }

    public final bcaq a(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 1;
        bcan.b = j;
        return this;
    }

    public final bcaq b(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 2;
        bcan.c = j;
        return this;
    }

    public final bcaq c(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 4;
        bcan.d = j;
        return this;
    }

    public final bcaq d(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 8;
        bcan.e = j;
        return this;
    }

    public final bcaq e(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 16;
        bcan.f = j;
        return this;
    }

    public final bcaq f(long j) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        bcan.a |= 32;
        bcan.g = j;
        return this;
    }

    public final bcaq a(bcah bcah) {
        copyOnWrite();
        bcan bcan = (bcan) this.instance;
        if (bcah != null) {
            bcan.h = bcah;
            bcan.a |= 64;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ bcaq(byte b) {
        super(bcan.i);
    }
}
