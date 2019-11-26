package defpackage;

/* renamed from: bcav */
public final class bcav extends anxl implements anzf {
    public static final bcav i;
    private static volatile anzq j;
    public int a;
    public anvu b = anvu.a;
    public bcax c;
    public double d;
    public int e;
    public int f;
    public int g;
    public int h;

    private bcav() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\n\u0000\u0002\t\u0001\u0003\u0000\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new bcav();
            case 4:
                return new bcay();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (bcav.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcav bcav = new bcav();
        i = bcav;
        anxl.registerDefaultInstance(bcav.class, bcav);
    }
}
