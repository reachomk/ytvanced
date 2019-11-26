package defpackage;

/* renamed from: atzq */
public final class atzq extends anxq implements anzf {
    private atzq() {
        super(atzr.p);
    }

    public final auad a() {
        auad auad = ((atzr) this.instance).b;
        return auad == null ? auad.d : auad;
    }

    public final atzq a(auac auac) {
        copyOnWrite();
        atzr atzr = (atzr) this.instance;
        if (auac != null) {
            atzr.a |= 2;
            atzr.c = auac.e;
            return this;
        }
        throw new NullPointerException();
    }

    public final anvu b() {
        return ((atzr) this.instance).l;
    }

    /* synthetic */ atzq(byte b) {
        super(atzr.p);
    }
}
