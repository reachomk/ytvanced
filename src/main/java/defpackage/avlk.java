package defpackage;

/* renamed from: avlk */
public final class avlk extends anxl implements anzf {
    public static final avlk i;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    private avlk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0004\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new avlk();
            case 4:
                return new avlj();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avlk.class) {
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
        avlk avlk = new avlk();
        i = avlk;
        anxl.registerDefaultInstance(avlk.class, avlk);
    }
}
