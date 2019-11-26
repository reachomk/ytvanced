package defpackage;

/* renamed from: avam */
public final class avam extends anxl implements anzf {
    public static final avam j;
    private static volatile anzq k;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public boolean h;
    public arge i;

    private avam() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\u0007\u0000\u0002\u000b&\u0007\u0000\u0000\u0000\u000b\u0007\u000b\u0010\u0007\u000f\u0011\u0002\u0010\u0012\u0007\u0011\"\u0007\u001e#\u0007\u001f&\t\"", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new avam();
            case 4:
                return new avap();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (avam.class) {
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
        avam avam = new avam();
        j = avam;
        anxl.registerDefaultInstance(avam.class, avam);
    }
}
