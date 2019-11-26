package defpackage;

/* renamed from: aytl */
public final class aytl extends anxl implements anzf {
    public static final aytl d;
    private static volatile anzq e;
    public int a;
    public ayst b;
    public anxz c = anxl.emptyIntList();

    private aytl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001e", new Object[]{"a", "b", "c", aytw.a()});
            case 3:
                return new aytl();
            case 4:
                return new ayto();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aytl.class) {
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
        aytl aytl = new aytl();
        d = aytl;
        anxl.registerDefaultInstance(aytl.class, aytl);
    }
}
