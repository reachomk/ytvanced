package defpackage;

/* renamed from: aoyz */
public final class aoyz extends anxl implements anzf {
    public static final aoyz c;
    private static volatile anzq e;
    public int a;
    public aoyx b;
    private byte d = (byte) 2;

    private aoyz() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001沈⭦沈⭦\u0001\u0000\u0000\u0001沈⭦Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aoyz();
            case 4:
                return new aozc();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aoyz.class) {
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
        aoyz aoyz = new aoyz();
        c = aoyz;
        anxl.registerDefaultInstance(aoyz.class, aoyz);
    }
}
