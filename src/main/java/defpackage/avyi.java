package defpackage;

/* renamed from: avyi */
public final class avyi extends anxl implements anzf {
    public static final avyi g;
    private static volatile anzq h;
    public int a;
    public String b;
    public int c;
    public int d;
    public String e;
    public String f;

    private avyi() {
        String str = "";
        this.b = str;
        this.e = str;
        this.f = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", aqiv.a, "e", "f"});
            case 3:
                return new avyi();
            case 4:
                return new avyh();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avyi.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avyi avyi = new avyi();
        g = avyi;
        anxl.registerDefaultInstance(avyi.class, avyi);
    }
}
