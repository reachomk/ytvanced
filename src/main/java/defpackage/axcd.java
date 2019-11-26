package defpackage;

/* renamed from: axcd */
public final class axcd extends anxl implements anzf {
    public static final axcd e;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c = "";
    public axcf d;
    private byte f = (byte) 2;

    private axcd() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0006\t\u0005", new Object[]{"a", "b", arzz.a, "c", "d"});
            case 3:
                return new axcd();
            case 4:
                return new axcc();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axcd.class) {
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
        axcd axcd = new axcd();
        e = axcd;
        anxl.registerDefaultInstance(axcd.class, axcd);
    }
}
