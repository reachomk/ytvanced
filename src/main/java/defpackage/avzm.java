package defpackage;

/* renamed from: avzm */
public final class avzm extends anxl implements anzf {
    public static final avzm i;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public avzo g;
    public avzo h;

    private avzm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0005\u0003\u0004\u0001\u0007\u0004\u0004\b\u0007\t\u000b\t\n\f\t\u000b", new Object[]{"a", "b", "e", "c", "d", "f", "g", "h"});
            case 3:
                return new avzm();
            case 4:
                return new avzl();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avzm.class) {
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
        avzm avzm = new avzm();
        i = avzm;
        anxl.registerDefaultInstance(avzm.class, avzm);
    }
}
