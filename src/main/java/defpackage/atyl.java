package defpackage;

/* renamed from: atyl */
public final class atyl extends anxo implements anzf {
    private atyl() {
        super(atyi.l);
    }

    public final atyl a(atyw atyw) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        if (atyw != null) {
            atyi.a |= 1;
            atyi.c = atyw.j;
            return this;
        }
        throw new NullPointerException();
    }

    public final atyl a(String str) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        if (str != null) {
            atyi.a |= 2;
            atyi.d = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atyl b(String str) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        if (str != null) {
            atyi.a |= 1024;
            atyi.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atyl a(boolean z) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        atyi.a |= 536870912;
        atyi.i = z;
        return this;
    }

    public final atyl a(atyn atyn) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        atyi.j = (atyk) ((anxl) atyn.build());
        atyi.b |= 32;
        return this;
    }

    public final atyl a(atyq atyq) {
        copyOnWrite();
        atyi atyi = (atyi) this.instance;
        if (atyq != null) {
            atyi.k = atyq;
            atyi.b |= 131072;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atyl(byte b) {
        super(atyi.l);
    }
}
