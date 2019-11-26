package defpackage;

/* renamed from: bcfd */
public final class bcfd extends anxo implements anzf {
    private bcfd() {
        super(bcfe.x);
    }

    public final bcfd a(bcbn bcbn) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        if (bcbn != null) {
            bcfe.b = bcbn;
            bcfe.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    public final bcfd a(String str) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.a |= 4;
        bcfe.d = str;
        return this;
    }

    public final bcfd a() {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.a &= -5;
        bcfe.d = bcfe.x.d;
        return this;
    }

    public final bcca b() {
        bcca bcca = ((bcfe) this.instance).g;
        return bcca == null ? bcca.b : bcca;
    }

    public final bcfd a(bcbz bcbz) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.g = (bcca) ((anxl) bcbz.build());
        bcfe.a |= 32;
        return this;
    }

    public final bcfd a(bcev bcev) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.i = (bcew) ((anxl) bcev.build());
        bcfe.a |= 128;
        return this;
    }

    public final bcei c() {
        bcei bcei = ((bcfe) this.instance).j;
        return bcei == null ? bcei.k : bcei;
    }

    public final bcfd a(bceh bceh) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.j = (bcei) ((anxl) bceh.build());
        bcfe.a |= 256;
        return this;
    }

    public final bcad d() {
        bcad bcad = ((bcfe) this.instance).k;
        return bcad == null ? bcad.c : bcad;
    }

    public final bcfd a(bcag bcag) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.k = (bcad) ((anxl) bcag.build());
        bcfe.a |= 512;
        return this;
    }

    public final bcfd a(bceb bceb) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.m = (bcec) ((anxl) bceb.build());
        bcfe.a |= 4096;
        return this;
    }

    public final bcfd a(bcbb bcbb) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        if (bcbb != null) {
            bcfe.n = bcbb;
            bcfe.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    public final bccz e() {
        bccz bccz = ((bcfe) this.instance).p;
        return bccz == null ? bccz.e : bccz;
    }

    public final bcfd a(bcdm bcdm) {
        copyOnWrite();
        bcfe bcfe = (bcfe) this.instance;
        bcfe.s = (bcdj) ((anxl) bcdm.build());
        bcfe.a |= 1048576;
        return this;
    }

    /* synthetic */ bcfd(byte b) {
        super(bcfe.x);
    }
}
