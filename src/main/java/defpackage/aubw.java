package defpackage;

/* renamed from: aubw */
public final class aubw extends anxl implements anzf {
    public static final aubw d;
    private static volatile anzq f;
    public int a;
    public int b;
    public axak c;
    private byte e = (byte) 2;

    private aubw() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0000\u0002Љ\u0001", new Object[]{"a", "b", aubp.a, "c"});
            case 3:
                return new aubw();
            case 4:
                return new aubv();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aubw.class) {
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
        aubw aubw = new aubw();
        d = aubw;
        anxl.registerDefaultInstance(aubw.class, aubw);
    }
}
