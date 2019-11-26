package defpackage;

/* renamed from: aoiy */
public final class aoiy extends anxl implements anzf {
    public static final aoiy h;
    private static volatile anzq j;
    public int a;
    public aoja b;
    public aoix c;
    public aohw d;
    public aokm e;
    public anvu f = anvu.a;
    public aoje g;
    private byte i = (byte) 2;

    private aoiy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0004\u0001\t\u0000\u0003Љ\u0003\u0006\n\b\u0007Љ\u0002\bЉ\u0004\nЉ\t", new Object[]{"a", "b", "d", "f", "c", "e", "g"});
            case 3:
                return new aoiy();
            case 4:
                return new aojb();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aoiy.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        aoiy aoiy = new aoiy();
        h = aoiy;
        anxl.registerDefaultInstance(aoiy.class, aoiy);
    }
}
