package defpackage;

/* renamed from: ayva */
public final class ayva extends anxl implements anzf {
    public static final ayva m;
    private static volatile anzq n;
    public int a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;

    private ayva() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0004#\u000b\u0000\u0000\u0000\u0004\u0007\u0002\u0005\f\u0003\t\u0007\u0004\n\u0007\u0005\r\u0007\u000e\u000e\u0007\u000f\u0010\u0007\u0011\u0012\u0007\u0012\u0017\u0007\u0017\u001c\u0007\u0018#\u0007\u001d", new Object[]{"a", "b", "c", ayvb.a, "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new ayva();
            case 4:
                return new ayvc();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (ayva.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayva ayva = new ayva();
        m = ayva;
        anxl.registerDefaultInstance(ayva.class, ayva);
    }
}
