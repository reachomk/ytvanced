package defpackage;

/* renamed from: apui */
public final class apui extends anxo implements anzf {
    private apui() {
        super(apuj.j);
    }

    public final apui a(long j) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 1;
        apuj.b = j;
        return this;
    }

    public final apui a(int i) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 2;
        apuj.c = i;
        return this;
    }

    public final apui b(int i) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 4;
        apuj.d = i;
        return this;
    }

    public final apui c(int i) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 16;
        apuj.f = i;
        return this;
    }

    public final apui d(int i) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 32;
        apuj.g = i;
        return this;
    }

    public final apui b(long j) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        apuj.a |= 64;
        apuj.h = j;
        return this;
    }

    /* synthetic */ apui(byte b) {
        super(apuj.j);
    }

    public final apui e(int i) {
        copyOnWrite();
        apuj apuj = (apuj) this.instance;
        if (i != 0) {
            apuj.a |= 8;
            apuj.e = i - 1;
            return this;
        }
        throw new NullPointerException();
    }
}
