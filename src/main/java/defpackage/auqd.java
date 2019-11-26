package defpackage;

/* renamed from: auqd */
public final class auqd extends anxl implements anzf {
    public static final auqd i;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c;
    public long d;
    public boolean e;
    public aupl f;
    public int g;
    public int h;

    private auqd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001\f\u0000\u0003\f\u0002\u0004\u0002\u0003\u0006\u0007\u0005\u0007\t\u0006\t\f\b\n\u0004\t", new Object[]{"a", "b", auru.a, "c", auro.a, "d", "e", "f", "g", aurs.a, "h"});
            case 3:
                return new auqd();
            case 4:
                return new auqg();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (auqd.class) {
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
        auqd auqd = new auqd();
        i = auqd;
        anxl.registerDefaultInstance(auqd.class, auqd);
    }
}
