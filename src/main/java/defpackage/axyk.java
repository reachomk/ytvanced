package defpackage;

/* renamed from: axyk */
public final class axyk extends anxl implements anzf {
    public static final axyk f;
    private static volatile anzq h;
    public int a;
    public axak b;
    public anyd c = anxl.emptyProtobufList();
    public apxu d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private axyk() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0005\n\u0003", new Object[]{"a", "b", "c", axak.class, "d", "e"});
            case 3:
                return new axyk();
            case 4:
                return new axym();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axyk.class) {
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
        axyk axyk = new axyk();
        f = axyk;
        anxl.registerDefaultInstance(axyk.class, axyk);
    }
}
