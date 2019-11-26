package defpackage;

/* renamed from: avzr */
public final class avzr extends anxl implements anzf {
    public static final avzr c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private avzr() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000⹮祥䌤\u0003\u0000\u0000\u0003⹮м\u0000ヺм\u0000祥䌤м\u0000", new Object[]{"b", "a", avjq.class, aruh.class, ayrb.class});
            case 3:
                return new avzr();
            case 4:
                return new avzq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avzr.class) {
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
        avzr avzr = new avzr();
        c = avzr;
        anxl.registerDefaultInstance(avzr.class, avzr);
    }
}
