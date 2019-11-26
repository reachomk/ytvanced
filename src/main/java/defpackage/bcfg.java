package defpackage;

/* renamed from: bcfg */
public final class bcfg extends anxl implements anzf {
    public static final bcfg d;
    private static volatile anzq e;
    public int a;
    public long b;
    public int c;

    private bcfg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0000", null);
            case 3:
                return new bcfg();
            case 4:
                return new bcff();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (bcfg.class) {
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
        bcfg bcfg = new bcfg();
        d = bcfg;
        anxl.registerDefaultInstance(bcfg.class, bcfg);
    }
}
