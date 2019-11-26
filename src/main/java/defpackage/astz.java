package defpackage;

/* renamed from: astz */
public final class astz extends anxl implements anzf {
    public static final astz f;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c;
    public String d;
    public anyd e = anxl.emptyProtobufList();

    private astz() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001\f\u0000\u0003\b\u0002\u0004\b\u0003\u0006\u001b", new Object[]{"a", "b", asue.a, "c", "d", "e", asuh.class});
            case 3:
                return new astz();
            case 4:
                return new asuc();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (astz.class) {
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
        astz astz = new astz();
        f = astz;
        anxl.registerDefaultInstance(astz.class, astz);
    }
}
