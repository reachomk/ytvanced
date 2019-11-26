package defpackage;

/* renamed from: axwd */
public final class axwd extends anxo implements anzf {
    private axwd() {
        super(axwa.M);
    }

    public final axwd a(boolean z) {
        copyOnWrite();
        axwa axwa = (axwa) this.instance;
        axwa.a |= 1024;
        axwa.o = z;
        return this;
    }

    public final axwd a(axvw axvw) {
        copyOnWrite();
        axwa axwa = (axwa) this.instance;
        if (axvw != null) {
            axwa.s = axvw;
            axwa.a |= 16384;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ axwd(byte b) {
        super(axwa.M);
    }
}
