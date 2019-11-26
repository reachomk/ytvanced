package defpackage;

/* renamed from: aydk */
public final class aydk extends anxl implements anzf {
    public static final aydk o;
    private static volatile anzq p;
    public int a;
    public boolean b;
    public boolean c;
    public float d = 1.0f;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public aydi n;

    private aydk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0005\u0003\u0007\u0006\u0004\u0004\u0007\u0005\u0007\u0001\u0006\u0007\u0003\u0007\u0001\u0002\b\u0007\b\n\u0007\t\u000b\u0007\u000b\f\u0007\r\r\u0007\u000e\u000e\t\u000f", new Object[]{"a", "b", "f", "g", "h", "c", "e", "d", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new aydk();
            case 4:
                return new aydn();
            case 5:
                return o;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aydk.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aydk aydk = new aydk();
        o = aydk;
        anxl.registerDefaultInstance(aydk.class, aydk);
    }
}
