package defpackage;

/* renamed from: avng */
public final class avng extends anxl implements anzf {
    public static final avng m;
    private static volatile anzq n;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public avms l;

    private avng() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0002\u0000\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0004\b\u0007\u0005\t\f\u0006\n\u0004\u0007\u000b\u0007\b\f\t\t", new Object[]{"a", "b", avnk.class, "c", avni.class, "d", "e", "f", "g", "h", "i", aqvf.a, "j", "k", "l"});
            case 3:
                return new avng();
            case 4:
                return new avnj();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (avng.class) {
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
        avng avng = new avng();
        m = avng;
        anxl.registerDefaultInstance(avng.class, avng);
    }
}
