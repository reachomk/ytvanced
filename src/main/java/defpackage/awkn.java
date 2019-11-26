package defpackage;

/* renamed from: awkn */
public final class awkn extends anxl implements anzf {
    public static final awkn d;
    private static volatile anzq f;
    public int a;
    public arml b;
    public arml c;
    private byte e = (byte) 2;

    private awkn() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0002\u0002Љ\u0001\u0006Љ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new awkn();
            case 4:
                return new awkm();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awkn.class) {
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
        awkn awkn = new awkn();
        d = awkn;
        anxl.registerDefaultInstance(awkn.class, awkn);
    }
}
