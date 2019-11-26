package defpackage;

/* renamed from: bacx */
public final class bacx extends anxl implements anzf {
    public static final bacx e;
    private static volatile anzq f;
    public int a;
    public int b = 0;
    public Object c;
    public boolean d;

    private bacx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0007\b\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", "a", badg.class, bade.class, baca.class, babb.class, "d", baas.class, badp.class, badi.class, babg.class});
            case 3:
                return new bacx();
            case 4:
                return new bacw();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bacx.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        bacx bacx = new bacx();
        e = bacx;
        anxl.registerDefaultInstance(bacx.class, bacx);
    }
}
