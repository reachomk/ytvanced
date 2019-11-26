package defpackage;

/* renamed from: ayiv */
public final class ayiv extends anxl implements anzf {
    public static final ayiv i;
    private static volatile anzq j;
    public int a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;

    private ayiv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ayiv();
            case 4:
                return new ayiu();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (ayiv.class) {
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
        ayiv ayiv = new ayiv();
        i = ayiv;
        anxl.registerDefaultInstance(ayiv.class, ayiv);
    }
}
