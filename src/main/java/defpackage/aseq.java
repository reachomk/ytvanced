package defpackage;

/* renamed from: aseq */
public final class aseq extends anxl implements anzf {
    public static final aseq d;
    private static volatile anzq e;
    public int a;
    public axhs b;
    public boolean c;

    private aseq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aseq();
            case 4:
                return new aset();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aseq.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        aseq aseq = new aseq();
        d = aseq;
        anxl.registerDefaultInstance(aseq.class, aseq);
    }
}
