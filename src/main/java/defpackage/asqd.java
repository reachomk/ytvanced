package defpackage;

/* renamed from: asqd */
public final class asqd extends anxl implements anzf {
    public static final asqd e;
    private static volatile anzq g;
    public int a;
    public int b;
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private asqd() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\f\u0000\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", asqi.a, "c", "d"});
            case 3:
                return new asqd();
            case 4:
                return new asqg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asqd.class) {
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
        asqd asqd = new asqd();
        e = asqd;
        anxl.registerDefaultInstance(asqd.class, asqd);
    }
}
