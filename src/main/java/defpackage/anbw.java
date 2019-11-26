package defpackage;

/* renamed from: anbw */
public final class anbw extends anxp implements anzf {
    public static final anbw g;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c = -1;
    public anxz d = anxl.emptyIntList();
    public int e;
    public int f;
    private byte i = (byte) 2;

    private anbw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0003\u0004\u0001\u0004\u0016\u0006\f\u0005\u0007\u0004\u0003", new Object[]{"a", "b", "c", "d", "f", anbx.a, "e"});
            case 3:
                return new anbw();
            case 4:
                return new anbv();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (anbw.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anbw anbw = new anbw();
        g = anbw;
        anxl.registerDefaultInstance(anbw.class, anbw);
    }
}
