package defpackage;

@Deprecated
/* renamed from: arbi */
public final class arbi extends anxp implements anzf {
    public static final arbi a;
    private static volatile anzq c;
    private byte b = (byte) 2;

    private arbi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 0;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.b);
            case 1:
                if (obj != null) {
                    b = (byte) 1;
                }
                this.b = b;
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new arbi();
            case 4:
                return new arbl();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (arbi.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arbi arbi = new arbi();
        a = arbi;
        anxl.registerDefaultInstance(arbi.class, arbi);
    }
}
