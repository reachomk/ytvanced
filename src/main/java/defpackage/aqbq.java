package defpackage;

/* renamed from: aqbq */
public final class aqbq extends anxl implements anzf {
    public static final aqbq c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private aqbq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000⒡⒡\u0001\u0000\u0000\u0001⒡м\u0000", new Object[]{"b", "a", axqn.class});
            case 3:
                return new aqbq();
            case 4:
                return new aqbp();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqbq.class) {
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
        aqbq aqbq = new aqbq();
        c = aqbq;
        anxl.registerDefaultInstance(aqbq.class, aqbq);
    }
}
