package defpackage;

/* renamed from: arrb */
public final class arrb extends anxl implements anzf {
    public static final arrb i;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    private arrb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0006\f\u0007\u0000\u0000\u0000\u0006\u0004\u0000\u0007\u0004\u0001\b\u0004\u0002\t\u0004\u0003\n\u0004\u0004\u000b\u0004\u0005\f\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arrb();
            case 4:
                return new arra();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arrb.class) {
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
        arrb arrb = new arrb();
        i = arrb;
        anxl.registerDefaultInstance(arrb.class, arrb);
    }
}
