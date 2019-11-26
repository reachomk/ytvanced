package defpackage;

/* renamed from: avvn */
public final class avvn extends anxl implements anzf {
    public static final avvn f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public int c;
    public apxu d;
    public boolean e;
    private byte g = (byte) 2;

    private avvn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001Љ\u0000\u0002\f\u0001\u0003Љ\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", avvo.a, "d", "e"});
            case 3:
                return new avvn();
            case 4:
                return new avvm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avvn.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avvn avvn = new avvn();
        f = avvn;
        anxl.registerDefaultInstance(avvn.class, avvn);
    }
}
