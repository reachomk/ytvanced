package defpackage;

/* renamed from: badz */
public final class badz extends anxo implements anzf {
    private badz() {
        super(badw.e);
    }

    public final badz a(Iterable iterable) {
        copyOnWrite();
        badw badw = (badw) this.instance;
        if (!badw.b.a()) {
            badw.b = anxl.mutableCopy(badw.b);
        }
        anvf.addAll(iterable, badw.b);
        return this;
    }

    /* synthetic */ badz(byte b) {
        super(badw.e);
    }
}
