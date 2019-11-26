package defpackage;

/* renamed from: ameo */
public final class ameo extends anxl implements anzf {
    public static final ameo g;
    private static volatile anzq h;
    public int a;
    public String b;
    public String c;
    public int d;
    public anyd e = anxl.emptyProtobufList();
    public ameq f;

    private ameo() {
        String str = "";
        this.b = str;
        this.c = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u001a\u0005\t\u0003", new Object[]{"a", "b", "c", "d", amer.a, "e", "f"});
            case 3:
                return new ameo();
            case 4:
                return new amen();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ameo.class) {
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
        ameo ameo = new ameo();
        g = ameo;
        anxl.registerDefaultInstance(ameo.class, ameo);
    }
}
