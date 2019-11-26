package defpackage;

/* renamed from: axpe */
public final class axpe extends anxl implements anzf {
    public static final axpe c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axpe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000︑㭪夃\u0003\u0000\u0000\u0003︑㭪м\u0000︭㭪м\u0000夃м\u0000", new Object[]{"b", "a", axpc.class, axpi.class, axpa.class});
            case 3:
                return new axpe();
            case 4:
                return new axpd();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axpe.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axpe axpe = new axpe();
        c = axpe;
        anxl.registerDefaultInstance(axpe.class, axpe);
    }
}
