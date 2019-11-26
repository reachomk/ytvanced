package defpackage;

/* renamed from: ayta */
public final class ayta extends anxo implements anzf {
    private ayta() {
        super(aysx.e);
    }

    public final ayta a(String str) {
        copyOnWrite();
        aysx aysx = (aysx) this.instance;
        if (str != null) {
            aysx.a |= 1;
            aysx.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayta(byte b) {
        super(aysx.e);
    }
}
