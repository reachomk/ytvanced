package defpackage;

/* renamed from: axgi */
public final class axgi extends anxl implements anzf {
    public static final axgi g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public axgo f;
    private byte h = (byte) 2;

    private axgi() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0005\u0002Љ\u0001\u0003Љ\u0004\u0004Љ\u0002\u0005Љ\u0005\nЉ\u0003", new Object[]{"a", "b", "e", "c", "f", "d"});
            case 3:
                return new axgi();
            case 4:
                return new axgl();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axgi.class) {
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
        axgi axgi = new axgi();
        g = axgi;
        anxl.registerDefaultInstance(axgi.class, axgi);
    }
}
