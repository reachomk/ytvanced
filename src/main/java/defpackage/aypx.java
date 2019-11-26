package defpackage;

/* renamed from: aypx */
public final class aypx extends anxl implements anzf {
    public static final aypx f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public aodv d;
    public long e;
    private byte g = (byte) 2;

    private aypx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001Љ\u0000\u0003\u0002\u0003\u0004Љ\u0001\u0006\t\u0002", new Object[]{"a", "b", "e", "c", "d"});
            case 3:
                return new aypx();
            case 4:
                return new aypw();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aypx.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aypx aypx = new aypx();
        f = aypx;
        anxl.registerDefaultInstance(aypx.class, aypx);
    }
}
