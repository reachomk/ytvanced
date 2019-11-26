package defpackage;

/* renamed from: avom */
public final class avom extends anxl implements anzf {
    public static final avom h;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public azfa d;
    public int e;
    public int f;
    public boolean g;

    private avom() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0005\t\u0003\u0006\u0004\u0005\u0007\u0004\u0006\t\u0007\b", new Object[]{"a", "b", "c", avof.a, "d", "e", "f", "g"});
            case 3:
                return new avom();
            case 4:
                return new avol();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avom.class) {
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
        avom avom = new avom();
        h = avom;
        anxl.registerDefaultInstance(avom.class, avom);
    }
}
