package defpackage;

/* renamed from: aqcb */
public final class aqcb extends anxl implements anzf {
    public static final aqcb e;
    private static volatile anzq g;
    public int a;
    public aqcf b;
    public apcl c;
    public awmi d;
    private byte f = (byte) 2;

    private aqcb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ﯠⲵﶭ愤\u0003\u0000\u0000\u0003ﯠⲵЉ\u0000㢄Љ\u0001ﶭ愤Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aqcb();
            case 4:
                return new aqce();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqcb.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqcb aqcb = new aqcb();
        e = aqcb;
        anxl.registerDefaultInstance(aqcb.class, aqcb);
    }
}
