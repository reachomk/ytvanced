package defpackage;

/* renamed from: aucy */
public final class aucy extends anxl implements anzf {
    public static final aucy e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public aphj d;
    private byte f = (byte) 2;

    private aucy() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aucy();
            case 4:
                return new aucx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aucy.class) {
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
        aucy aucy = new aucy();
        e = aucy;
        anxl.registerDefaultInstance(aucy.class, aucy);
    }
}
