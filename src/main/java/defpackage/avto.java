package defpackage;

/* renamed from: avto */
public final class avto extends anxl implements anzf {
    public static final avto c;
    private static volatile anzq d;
    public int a;
    public axur b;

    private avto() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㥳㥳\u0001\u0000\u0000\u0000㥳\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new avto();
            case 4:
                return new avtr();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avto.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avto avto = new avto();
        c = avto;
        anxl.registerDefaultInstance(avto.class, avto);
    }
}
