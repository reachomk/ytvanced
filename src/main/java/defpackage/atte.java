package defpackage;

/* renamed from: atte */
public final class atte extends anxo implements anzf {
    private atte() {
        super(attf.m);
    }

    public final atte a() {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 1;
        attf.b = true;
        return this;
    }

    public final atte b() {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 2;
        attf.c = true;
        return this;
    }

    public final atte a(long j) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 4;
        attf.d = j;
        return this;
    }

    public final atte b(long j) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 8;
        attf.e = j;
        return this;
    }

    public final atte a(String str) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        if (str != null) {
            attf.a |= 16;
            attf.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final atte a(float f) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 32;
        attf.g = f;
        return this;
    }

    public final atte c(long j) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        attf.a |= 64;
        attf.h = j;
        return this;
    }

    public final atte b(String str) {
        copyOnWrite();
        attf attf = (attf) this.instance;
        if (str != null) {
            attf.a |= 256;
            attf.i = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atte(byte b) {
        super(attf.m);
    }
}
