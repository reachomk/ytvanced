package defpackage;

/* renamed from: apvg */
public final class apvg extends anxl implements anzf {
    public static final apvg g;
    private static volatile anzq h;
    public int a;
    public long b;
    public long c;
    public String d;
    public long e;
    public String f;

    private apvg() {
        String str = "";
        this.d = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\u0002\u0003\u0006\b\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new apvg();
            case 4:
                return new apvf();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apvg.class) {
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
        apvg apvg = new apvg();
        g = apvg;
        anxl.registerDefaultInstance(apvg.class, apvg);
    }
}
