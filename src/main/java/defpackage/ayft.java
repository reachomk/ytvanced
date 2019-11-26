package defpackage;

/* renamed from: ayft */
public final class ayft extends anxo implements anzf {
    private ayft() {
        super(ayfu.q);
    }

    public final ayft a(ayfq ayfq) {
        copyOnWrite();
        ayfu ayfu = (ayfu) this.instance;
        if (ayfq != null) {
            ayfu.h = ayfq;
            ayfu.a |= 64;
            return this;
        }
        throw new NullPointerException();
    }

    public final ayft a(ayfo ayfo) {
        copyOnWrite();
        ayfu ayfu = (ayfu) this.instance;
        if (ayfo != null) {
            ayfu.n = ayfo;
            ayfu.a |= 8192;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ ayft(byte b) {
        super(ayfu.q);
    }
}
