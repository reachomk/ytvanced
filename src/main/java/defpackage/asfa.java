package defpackage;

/* renamed from: asfa */
public final class asfa extends anxl implements anzf {
    public static final asfa f;
    private static volatile anzq g;
    public int a;
    public String b;
    public asdk c;
    public String d;
    public asdi e;

    private asfa() {
        String str = "";
        this.b = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0002\u0004\t\u0001\u0005\t\u0003", new Object[]{"a", "b", "d", "c", "e"});
            case 3:
                return new asfa();
            case 4:
                return new asfd();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asfa.class) {
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
        asfa asfa = new asfa();
        f = asfa;
        anxl.registerDefaultInstance(asfa.class, asfa);
    }
}
