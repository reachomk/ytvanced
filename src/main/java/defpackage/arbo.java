package defpackage;

@Deprecated
/* renamed from: arbo */
public final class arbo extends anxp implements anzf {
    public static final arbo c;
    private static volatile anzq e;
    public int a;
    public arbe b;
    private byte d = (byte) 2;

    private arbo() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004Љ\u0003", new Object[]{"a", "b"});
            case 3:
                return new arbo();
            case 4:
                return new arbq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arbo.class) {
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
        arbo arbo = new arbo();
        c = arbo;
        anxl.registerDefaultInstance(arbo.class, arbo);
    }
}
