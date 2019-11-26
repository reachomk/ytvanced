package defpackage;

/* renamed from: ause */
public final class ause extends anxl implements anzf {
    public static final ause f;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c;
    public String d;
    public String e;

    private ause() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", ausf.a, "c", "d", "e"});
            case 3:
                return new ause();
            case 4:
                return new ausd();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ause.class) {
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
        ause ause = new ause();
        f = ause;
        anxl.registerDefaultInstance(ause.class, ause);
    }
}
