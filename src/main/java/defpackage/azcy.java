package defpackage;

/* renamed from: azcy */
public final class azcy extends anxl implements anzf {
    public static final azcy e;
    public static final anxr f;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public long d;

    private azcy() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azcy();
            case 4:
                return new azcx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azcy.class) {
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
        azcy azcy = new azcy();
        e = azcy;
        anxl.registerDefaultInstance(azcy.class, azcy);
        arfy arfy = arfy.a;
        azcy azcy2 = e;
        f = anxl.newSingularGeneratedExtension(arfy, azcy2, azcy2, null, 76, aobm.MESSAGE, azcy.class);
    }
}
