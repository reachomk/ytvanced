package defpackage;

/* renamed from: nkn */
public final class nkn extends anxo implements anzf {
    private nkn() {
        super(nkm.x);
    }

    public final nkn a(String str) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (str != null) {
            nkm.a |= 1;
            nkm.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final nkn b(String str) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (str != null) {
            nkm.a |= 2;
            nkm.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final nkn a(int i) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 4;
        nkm.e = i;
        return this;
    }

    public final nkn c(String str) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (str != null) {
            nkm.a |= 8;
            nkm.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final nkn a(boolean z) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 32;
        nkm.h = z;
        return this;
    }

    public final nkn b(boolean z) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 64;
        nkm.i = z;
        return this;
    }

    public final nkn a(long j) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 256;
        nkm.k = j;
        return this;
    }

    public final nkn d(String str) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (str != null) {
            nkm.a |= 512;
            nkm.l = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final nkn c(boolean z) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 1024;
        nkm.m = z;
        return this;
    }

    public final nkn d(boolean z) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        nkm.a |= 2048;
        nkm.n = z;
        return this;
    }

    public final nkn a(avtk avtk) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (avtk != null) {
            nkm.q = avtk;
            nkm.a |= 65536;
            return this;
        }
        throw new NullPointerException();
    }

    public final nkn a(avtm avtm) {
        copyOnWrite();
        nkm nkm = (nkm) this.instance;
        if (avtm != null) {
            nkm.r = avtm;
            nkm.a |= 262144;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ nkn(byte b) {
        super(nkm.x);
    }
}
