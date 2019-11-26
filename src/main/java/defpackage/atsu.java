package defpackage;

/* renamed from: atsu */
public final class atsu extends anxo implements anzf {
    private atsu() {
        super(atsv.g);
    }

    public final atsu a(String str) {
        copyOnWrite();
        atsv atsv = (atsv) this.instance;
        if (str != null) {
            atsv.a |= 16;
            atsv.f = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ atsu(byte b) {
        super(atsv.g);
    }

    public final atsu a(int i) {
        copyOnWrite();
        atsv atsv = (atsv) this.instance;
        atsv.a |= 4;
        atsv.d = i - 1;
        return this;
    }

    public final atsu b(int i) {
        copyOnWrite();
        atsv atsv = (atsv) this.instance;
        atsv.a |= 8;
        atsv.e = i - 1;
        return this;
    }
}
