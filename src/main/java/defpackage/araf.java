package defpackage;

/* renamed from: araf */
public final class araf extends anxo implements anzf {
    private araf() {
        super(arac.g);
    }

    public final araf a(arah arah) {
        copyOnWrite();
        arac arac = (arac) this.instance;
        if (arah != null) {
            arac.b = arah;
            arac.a |= 1;
            return this;
        }
        throw new NullPointerException();
    }

    /* synthetic */ araf(byte b) {
        super(arac.g);
    }
}
