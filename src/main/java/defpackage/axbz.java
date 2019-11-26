package defpackage;

/* renamed from: axbz */
public final class axbz extends anxl implements anzf {
    public static final axbz g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public apxu e;
    public arml f;
    private byte h = (byte) 2;

    private axbz() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001Љ\u0001\u0002Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new axbz();
            case 4:
                return new axby();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axbz.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axbz axbz = new axbz();
        g = axbz;
        anxl.registerDefaultInstance(axbz.class, axbz);
    }
}
