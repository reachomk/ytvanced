package defpackage;

/* renamed from: ayxx */
public final class ayxx extends anxo implements anzf {
    private ayxx() {
        super(ayxu.e);
    }

    public final ayxx a(String str) {
        copyOnWrite();
        ayxu ayxu = (ayxu) this.instance;
        if (str != null) {
            ayxu.a |= 1;
            ayxu.b = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final ayxx a(int i) {
        copyOnWrite();
        ayxu ayxu = (ayxu) this.instance;
        ayxu.a |= 2;
        ayxu.c = i;
        return this;
    }

    public final ayxx b(int i) {
        copyOnWrite();
        ayxu ayxu = (ayxu) this.instance;
        ayxu.a |= 4;
        ayxu.d = i;
        return this;
    }

    /* synthetic */ ayxx(byte b) {
        super(ayxu.e);
    }
}
