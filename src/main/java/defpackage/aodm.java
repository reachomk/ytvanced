package defpackage;

/* renamed from: aodm */
public final class aodm extends anxo implements anzf {
    private aodm() {
        super(aodj.i);
    }

    public final aodm a(Iterable iterable) {
        copyOnWrite();
        aodj aodj = (aodj) this.instance;
        if (!aodj.c.a()) {
            aodj.c = anxl.mutableCopy(aodj.c);
        }
        for (aode number : iterable) {
            aodj.c.d(number.getNumber());
        }
        return this;
    }

    /* synthetic */ aodm(byte b) {
        super(aodj.i);
    }

    public final aodm a(int i) {
        copyOnWrite();
        aodj aodj = (aodj) this.instance;
        if (i != 0) {
            aodj.a |= 1;
            aodj.b = aodh.a(i);
            return this;
        }
        throw new NullPointerException();
    }
}
