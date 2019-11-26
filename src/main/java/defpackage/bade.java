package defpackage;

/* renamed from: bade */
public final class bade extends anxl implements anzf {
    public static final bade d;
    private static volatile anzq e;
    public int a;
    public baao b;
    public badc c;

    private bade() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new bade();
            case 4:
                return new badh();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bade.class) {
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
        bade bade = new bade();
        d = bade;
        anxl.registerDefaultInstance(bade.class, bade);
    }
}
