package defpackage;

/* renamed from: aylq */
public final class aylq extends anxl implements anzf {
    public static final aylq c;
    private static volatile anzq e;
    public int a;
    public aylo b;
    private byte d = (byte) 2;

    private aylq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㿤㿤\u0001\u0000\u0000\u0001㿤Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aylq();
            case 4:
                return new aylt();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aylq.class) {
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
        aylq aylq = new aylq();
        c = aylq;
        anxl.registerDefaultInstance(aylq.class, aylq);
    }
}
