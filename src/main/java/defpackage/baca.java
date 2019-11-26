package defpackage;

/* renamed from: baca */
public final class baca extends anxl implements anzf {
    public static final baca f;
    private static volatile anzq g;
    public int a;
    public baao b;
    public String c;
    public String d;
    public bacc e;

    private baca() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001\u0003\b\u0002\u0005\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new baca();
            case 4:
                return new bacd();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (baca.class) {
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
        baca baca = new baca();
        f = baca;
        anxl.registerDefaultInstance(baca.class, baca);
    }
}
