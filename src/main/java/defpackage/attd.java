package defpackage;

/* renamed from: attd */
public final class attd extends anxl implements anzf {
    public static final attd e;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    public attf d;

    private attd() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0002\u0004\t\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new attd();
            case 4:
                return new attc();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (attd.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        attd attd = new attd();
        e = attd;
        anxl.registerDefaultInstance(attd.class, attd);
    }
}
