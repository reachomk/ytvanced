package defpackage;

/* renamed from: aqdj */
public final class aqdj extends anxl implements anzf {
    public static final aqdj d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public boolean c;

    private aqdj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003\b\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new aqdj();
            case 4:
                return new aqdi();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqdj.class) {
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
        aqdj aqdj = new aqdj();
        d = aqdj;
        anxl.registerDefaultInstance(aqdj.class, aqdj);
    }
}
