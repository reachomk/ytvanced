package defpackage;

/* renamed from: axva */
public final class axva extends anxl implements anzf {
    public static final axva g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public axak e;
    public axak f;
    private byte h = (byte) 2;

    private axva() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0007Љ\u0004\bЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new axva();
            case 4:
                return new axvd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axva.class) {
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
        axva axva = new axva();
        g = axva;
        anxl.registerDefaultInstance(axva.class, axva);
    }
}
