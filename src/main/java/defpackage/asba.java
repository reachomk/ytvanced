package defpackage;

/* renamed from: asba */
public final class asba extends anxl implements anzf {
    public static final asba d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    private byte e = (byte) 2;

    private asba() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\f\u0000", new Object[]{"a", "b", avrg.class, "c", avmy.a()});
            case 3:
                return new asba();
            case 4:
                return new asbd();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asba.class) {
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
        asba asba = new asba();
        d = asba;
        anxl.registerDefaultInstance(asba.class, asba);
    }
}
