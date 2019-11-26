package defpackage;

/* renamed from: avsc */
public final class avsc extends anxl implements anzf {
    public static final avsc g;
    private static volatile anzq h;
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;
    public float f;

    private avsc() {
        String str = "";
        this.b = str;
        this.c = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u000b\u0002\u0005\b\u0003\u0007\u0001\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new avsc();
            case 4:
                return new avse();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avsc.class) {
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
        avsc avsc = new avsc();
        g = avsc;
        anxl.registerDefaultInstance(avsc.class, avsc);
    }
}
