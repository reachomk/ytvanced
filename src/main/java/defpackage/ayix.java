package defpackage;

/* renamed from: ayix */
public final class ayix extends anxl implements anzf {
    public static final ayix i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public int c;
    public int d;
    public int e;
    public int f;
    public axak g;
    public boolean h;
    private byte j = (byte) 2;

    private ayix() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001Љ\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006Љ\u0005\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ayix();
            case 4:
                return new ayiw();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ayix.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
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
        ayix ayix = new ayix();
        i = ayix;
        anxl.registerDefaultInstance(ayix.class, ayix);
    }
}
