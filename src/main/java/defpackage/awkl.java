package defpackage;

/* renamed from: awkl */
public final class awkl extends anxl implements anzf {
    public static final awkl g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public arml e;
    public axak f;
    private byte h = (byte) 2;

    private awkl() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0004\u0005Љ\u0002\u0006Љ\u0003", new Object[]{"a", "b", "c", "f", "d", "e"});
            case 3:
                return new awkl();
            case 4:
                return new awkk();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awkl.class) {
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
        awkl awkl = new awkl();
        g = awkl;
        anxl.registerDefaultInstance(awkl.class, awkl);
    }
}
