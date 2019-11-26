package defpackage;

/* renamed from: aysv */
public final class aysv extends anxl implements anzf {
    public static final aysv j;
    private static volatile anzq k;
    public int a;
    public aysx b;
    public int c;
    public int d;
    public int e;
    public int f;
    public String g = "";
    public long h;
    public int i;

    private aysv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u0012\b\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\r\f\n\u000e\f\u000b\u000f\f\f\u0010\b\r\u0011\u0003\u000e\u0012\f\u000f", new Object[]{"a", "b", "c", aytz.a, "d", ayug.a, "e", ayub.a, "f", aytx.a(), "g", "h", "i", aytt.a});
            case 3:
                return new aysv();
            case 4:
                return new aysy();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aysv.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aysv aysv = new aysv();
        j = aysv;
        anxl.registerDefaultInstance(aysv.class, aysv);
    }
}
