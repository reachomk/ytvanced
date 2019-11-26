package defpackage;

/* renamed from: asck */
public final class asck extends anxl implements anzf {
    public static final asck d;
    private static volatile anzq f;
    public int a;
    public asic b;
    public asbu c;
    private byte e = (byte) 2;

    private asck() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0006\t\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new asck();
            case 4:
                return new ascn();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asck.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asck asck = new asck();
        d = asck;
        anxl.registerDefaultInstance(asck.class, asck);
    }
}
