package defpackage;

/* renamed from: ayyy */
public final class ayyy extends anxl implements anzf {
    public static final ayyy d;
    private static volatile anzq e;
    public int a;
    public ayyu b;
    public String c = "";

    private ayyy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ayyy();
            case 4:
                return new ayyx();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayyy.class) {
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
        ayyy ayyy = new ayyy();
        d = ayyy;
        anxl.registerDefaultInstance(ayyy.class, ayyy);
    }
}
