package defpackage;

/* renamed from: antw */
public final class antw extends anxl implements anzf {
    public static final antw f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public anyy d = anyy.b;
    public String e = "";

    private antw() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0006\u0010\u0004\u0001\u0000\u0000\u0006\u0004\u0005\u0007\u0004\u0006\b2\u0010\b\u000e", new Object[]{"a", "b", "c", "d", anty.a, "e"});
            case 3:
                return new antw();
            case 4:
                return new antz();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (antw.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        antw antw = new antw();
        f = antw;
        anxl.registerDefaultInstance(antw.class, antw);
    }
}
