package defpackage;

/* renamed from: azhs */
public final class azhs extends anxl implements anzf {
    public static final azhs c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private azhs() {
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
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000៓㽪\u0004\u0000\u0000\u0004៓м\u0000ﱬ៓м\u0000㪃м\u0000㽪м\u0000", new Object[]{"b", "a", azhu.class, azis.class, azia.class, axtn.class});
            case 3:
                return new azhs();
            case 4:
                return new azhv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azhs.class) {
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
        azhs azhs = new azhs();
        c = azhs;
        anxl.registerDefaultInstance(azhs.class, azhs);
    }
}
