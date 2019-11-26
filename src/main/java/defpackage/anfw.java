package defpackage;

/* renamed from: anfw */
public final class anfw extends anxl implements anzf {
    public static final anfw a;
    private static volatile anzq b;

    private anfw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new anfw();
            case 4:
                return new anfv();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (anfw.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anfw anfw = new anfw();
        a = anfw;
        anxl.registerDefaultInstance(anfw.class, anfw);
    }
}
