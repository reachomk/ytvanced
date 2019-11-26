package defpackage;

/* renamed from: aprw */
public final class aprw extends anxl implements anzf {
    public static final aprw f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public long e;
    private byte g = (byte) 2;

    private aprw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0001\u0001\b\u0000\u0002\u0002\u0001\u0004<\u0000\u0005<\u0000\u0006м\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", "a", "d", "e", apsc.class, apsg.class, apsi.class, apsa.class, aprs.class, apse.class});
            case 3:
                return new aprw();
            case 4:
                return new aprz();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aprw.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aprw aprw = new aprw();
        f = aprw;
        anxl.registerDefaultInstance(aprw.class, aprw);
    }
}
