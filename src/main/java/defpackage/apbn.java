package defpackage;

/* renamed from: apbn */
public final class apbn extends anxl implements anzf {
    public static final apbn e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public anvu c = anvu.a;
    public long d;

    private apbn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new apbn();
            case 4:
                return new apbq();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apbn.class) {
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
        apbn apbn = new apbn();
        e = apbn;
        anxl.registerDefaultInstance(apbn.class, apbn);
    }
}
