package defpackage;

/* renamed from: axil */
public final class axil extends anxl implements anzf {
    public static final axil l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public axiv h;
    public arml i;
    public arml j;
    public arml k;
    private byte m = (byte) 2;

    private axil() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\n\u0001Љ\u0000\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\u000bЉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new axil();
            case 4:
                return new axio();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axil.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axil axil = new axil();
        l = axil;
        anxl.registerDefaultInstance(axil.class, axil);
    }
}
