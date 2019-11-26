package defpackage;

/* renamed from: anbq */
public final class anbq extends anxo implements anzf {
    private anbq() {
        super(anbn.g);
    }

    public final anbq a(anbu anbu) {
        copyOnWrite();
        anbn anbn = (anbn) this.instance;
        if (anbu != null) {
            anbn.f = anbu;
            anbn.a |= 16;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ anbq(byte b) {
        super(anbn.g);
    }
}
