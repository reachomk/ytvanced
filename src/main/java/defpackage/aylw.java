package defpackage;

/* renamed from: aylw */
public final class aylw extends anxl implements anzf {
    public static final aylw c;
    private static volatile anzq e;
    public int a;
    public aylu b;
    private byte d = (byte) 2;

    private aylw() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ⰻⰻ\u0001\u0000\u0000\u0001ⰻЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aylw();
            case 4:
                return new aylz();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aylw.class) {
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
        aylw aylw = new aylw();
        c = aylw;
        anxl.registerDefaultInstance(aylw.class, aylw);
    }
}
