package defpackage;

/* renamed from: axpi */
public final class axpi extends anxp implements anzf {
    public static final axpi g;
    private static volatile anzq j;
    public int a;
    public boolean b;
    public boolean c;
    public auad d;
    public String e = "";
    public aphj f;
    private byte i = (byte) 2;

    private axpi() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0011\u001b\u0005\u0000\u0000\u0001\u0011\t\u0002\u0014\u0007\u0000\u0015\u0007\u0001\u001aЉ\u0005\u001b\b\u0004", new Object[]{"a", "d", "b", "c", "f", "e"});
            case 3:
                return new axpi();
            case 4:
                return new axph();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axpi.class) {
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
        axpi axpi = new axpi();
        g = axpi;
        anxl.registerDefaultInstance(axpi.class, axpi);
    }
}
