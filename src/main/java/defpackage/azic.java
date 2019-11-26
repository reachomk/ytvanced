package defpackage;

/* renamed from: azic */
public final class azic extends anxl implements anzf {
    public static final azic c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private azic() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000ḫḳ\u0003\u0000\u0000\u0003ḫм\u0000ḭм\u0000ḳм\u0000", new Object[]{"b", "a", azii.class, azho.class, azig.class});
            case 3:
                return new azic();
            case 4:
                return new azif();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azic.class) {
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
        azic azic = new azic();
        c = azic;
        anxl.registerDefaultInstance(azic.class, azic);
    }
}
