package defpackage;

/* renamed from: avwi */
public final class avwi extends anxl implements anzf {
    public static final avwi h;
    private static volatile anzq i;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public String g = "";

    private avwi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\b\u0005", new Object[]{"a", "b", "c", "d", axtz.a, "e", "f", "g"});
            case 3:
                return new avwi();
            case 4:
                return new avwh();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avwi.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avwi avwi = new avwi();
        h = avwi;
        anxl.registerDefaultInstance(avwi.class, avwi);
    }
}
