package defpackage;

/* renamed from: aush */
public final class aush extends anxo implements anzf {
    private aush() {
        super(ausi.e);
    }

    public final aush a(ause ause) {
        copyOnWrite();
        ausi ausi = (ausi) this.instance;
        if (ause != null) {
            if (!ausi.c.a()) {
                ausi.c = anxl.mutableCopy(ausi.c);
            }
            ausi.c.add(ause);
            return this;
        }
        throw new NullPointerException();
    }

    public final aush b(ause ause) {
        copyOnWrite();
        ausi ausi = (ausi) this.instance;
        if (ause != null) {
            if (!ausi.d.a()) {
                ausi.d = anxl.mutableCopy(ausi.d);
            }
            ausi.d.add(ause);
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ aush(byte b) {
        super(ausi.e);
    }
}
