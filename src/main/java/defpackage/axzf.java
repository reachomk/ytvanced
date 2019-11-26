package defpackage;

/* renamed from: axzf */
public final class axzf extends anxl implements anzf {
    public static final axzf g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public axzj f;
    private byte h = (byte) 2;

    private axzf() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004\u000b\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", arml.class, "e", "f"});
            case 3:
                return new axzf();
            case 4:
                return new axze();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axzf.class) {
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
        axzf axzf = new axzf();
        g = axzf;
        anxl.registerDefaultInstance(axzf.class, axzf);
    }
}
