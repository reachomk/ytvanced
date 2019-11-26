package defpackage;

/* renamed from: auvq */
public final class auvq extends anxo implements anzf {
    private auvq() {
        super(auvn.l);
    }

    public final auvq a(int i, auvm auvm) {
        copyOnWrite();
        auvn auvn = (auvn) this.instance;
        auvn.a();
        auvn.b.set(i, (auvj) ((anxl) auvm.build()));
        return this;
    }

    public final auvq a(auvj auvj) {
        copyOnWrite();
        auvn auvn = (auvn) this.instance;
        if (auvj != null) {
            auvn.a();
            auvn.b.add(auvj);
            return this;
        }
        throw new NullPointerException();
    }

    public final auvq a(Iterable iterable) {
        copyOnWrite();
        auvn auvn = (auvn) this.instance;
        auvn.a();
        anvf.addAll(iterable, auvn.b);
        return this;
    }

    /* synthetic */ auvq(byte b) {
        super(auvn.l);
    }
}
