package defpackage;

/* renamed from: axdo */
public final class axdo extends anxp implements anzf {
    public static final axdo g;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public arml c;
    public apxu d;
    public axdq e;
    public anvu f = anvu.a;
    private byte i = (byte) 2;

    private axdo() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\n\u0004\u0006\t\u0003", new Object[]{"a", "b", "c", "d", "f", "e"});
            case 3:
                return new axdo();
            case 4:
                return new axdr();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axdo.class) {
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
        axdo axdo = new axdo();
        g = axdo;
        anxl.registerDefaultInstance(axdo.class, axdo);
    }
}
