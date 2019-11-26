package defpackage;

/* renamed from: atek */
public final class atek extends anxo implements anzf {
    private atek() {
        super(ateh.n);
    }

    public final atek a(asib asib) {
        copyOnWrite();
        ateh ateh = (ateh) this.instance;
        ateh.b = (ashy) ((anxl) asib.build());
        ateh.a |= 1;
        return this;
    }

    public final String a() {
        return ((ateh) this.instance).c;
    }

    public final atek a(String str) {
        copyOnWrite();
        ateh ateh = (ateh) this.instance;
        if (str != null) {
            ateh.a |= 2;
            ateh.c = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final awat b() {
        awat awat = ((ateh) this.instance).f;
        return awat == null ? awat.g : awat;
    }

    public final String c() {
        return ((ateh) this.instance).h;
    }

    public final atek b(String str) {
        copyOnWrite();
        ateh ateh = (ateh) this.instance;
        if (str != null) {
            ateh.a |= 256;
            ateh.h = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final int d() {
        return ((ateh) this.instance).i;
    }

    public final atek a(int i) {
        copyOnWrite();
        ateh ateh = (ateh) this.instance;
        ateh.a |= 512;
        ateh.i = i;
        return this;
    }

    public final String e() {
        return ((ateh) this.instance).j;
    }

    public final atek c(String str) {
        copyOnWrite();
        ateh ateh = (ateh) this.instance;
        if (str != null) {
            ateh.a |= 2048;
            ateh.j = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atek(byte b) {
        super(ateh.n);
    }
}
