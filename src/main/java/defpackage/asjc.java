package defpackage;

/* renamed from: asjc */
public final class asjc extends anxo implements anzf {
    private asjc() {
        super(asjd.h);
    }

    public final asjc a(boolean z) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        asjd.a |= 1;
        asjd.b = z;
        return this;
    }

    public final asjc b(boolean z) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        asjd.a |= 2;
        asjd.c = z;
        return this;
    }

    public final asjc c(boolean z) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        asjd.a |= 4;
        asjd.d = z;
        return this;
    }

    public final asjc a(String str) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        if (str != null) {
            asjd.a |= 8;
            asjd.e = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final asjc d(boolean z) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        asjd.a |= 16;
        asjd.f = z;
        return this;
    }

    public final asjc b(String str) {
        copyOnWrite();
        asjd asjd = (asjd) this.instance;
        if (str != null) {
            asjd.a |= 32;
            asjd.g = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ asjc(byte b) {
        super(asjd.h);
    }
}
