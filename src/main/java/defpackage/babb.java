package defpackage;

/* renamed from: babb */
public final class babb extends anxl implements anzf {
    public static final babb g;
    private static volatile anzq h;
    public int a;
    public baao b;
    public String c;
    public String d;
    public String e;
    public babd f;

    private babb() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0001\u0004\b\u0002\u0005\b\u0003\u0006\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new babb();
            case 4:
                return new baba();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (babb.class) {
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
        babb babb = new babb();
        g = babb;
        anxl.registerDefaultInstance(babb.class, babb);
    }
}
