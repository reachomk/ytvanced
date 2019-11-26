package defpackage;

/* renamed from: azur */
public final class azur extends anxl implements anzf {
    public static final azur f;
    private static volatile anzq g;
    public int a;
    public String b;
    public anvu c = anvu.a;
    public int d;
    public String e;

    private azur() {
        String str = "";
        this.b = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001\u0003\f\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", azus.a, "e"});
            case 3:
                return new azur();
            case 4:
                return new azuq();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azur.class) {
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
        azur azur = new azur();
        f = azur;
        anxl.registerDefaultInstance(azur.class, azur);
    }
}
