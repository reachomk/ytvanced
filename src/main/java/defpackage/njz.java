package defpackage;

/* renamed from: njz */
public final class njz extends anxo implements anzf {
    private njz() {
        super(nka.l);
    }

    public final String a() {
        return ((nka) this.instance).b;
    }

    public final String b() {
        return ((nka) this.instance).c;
    }

    public final njz a(String str) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        nka.a |= 2;
        nka.c = str;
        return this;
    }

    public final anvu c() {
        return ((nka) this.instance).d;
    }

    public final njz a(anvu anvu) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        if (anvu != null) {
            nka.a |= 4;
            nka.d = anvu;
            return this;
        }
        throw new NullPointerException();
    }

    public final boolean d() {
        return (((nka) this.instance).a & 8) != 0;
    }

    public final long e() {
        return ((nka) this.instance).e;
    }

    public final njz b(String str) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        if (str != null) {
            nka.a |= 16;
            nka.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final int f() {
        return ((nka) this.instance).h;
    }

    public final njz c(String str) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        if (str != null) {
            nka.a |= 128;
            nka.i = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final njz a(boolean z) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        nka.a |= 256;
        nka.j = z;
        return this;
    }

    public final aqui g() {
        aqui a = aqui.a(((nka) this.instance).k);
        return a == null ? aqui.DELAYED_EVENT_TIER_UNSPECIFIED : a;
    }

    public final njz a(aqui aqui) {
        copyOnWrite();
        nka nka = (nka) this.instance;
        if (aqui != null) {
            nka.a |= 512;
            nka.k = aqui.f;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ njz(byte b) {
        super(nka.l);
    }
}
