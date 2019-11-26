package defpackage;

/* renamed from: aoji */
public final class aoji extends anxl implements anzf {
    public static final aoji f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;

    private aoji() {
        String str = "";
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aoji();
            case 4:
                return new aojl();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aoji.class) {
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
        aoji aoji = new aoji();
        f = aoji;
        anxl.registerDefaultInstance(aoji.class, aoji);
    }
}
