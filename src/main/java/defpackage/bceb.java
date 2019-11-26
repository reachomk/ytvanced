package defpackage;

/* renamed from: bceb */
public final class bceb extends anxo implements anzf {
    private bceb() {
        super(bcec.b);
    }

    public final int a() {
        return ((bcec) this.instance).a.size();
    }

    public final bceb a(bcef bcef) {
        copyOnWrite();
        bcec bcec = (bcec) this.instance;
        if (!bcec.a.a()) {
            bcec.a = anxl.mutableCopy(bcec.a);
        }
        bcec.a.add((bceg) ((anxl) bcef.build()));
        return this;
    }

    /* synthetic */ bceb(byte b) {
        super(bcec.b);
    }
}
