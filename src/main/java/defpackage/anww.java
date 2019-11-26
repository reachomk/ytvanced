package defpackage;

/* renamed from: anww */
public final class anww extends anxl implements anzf {
    public static final anww a;
    private static volatile anzq b;

    private anww() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0000\u0000", null);
            case 3:
                return new anww();
            case 4:
                return new anwv();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (anww.class) {
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
        anww anww = new anww();
        a = anww;
        anxl.registerDefaultInstance(anww.class, anww);
    }
}
