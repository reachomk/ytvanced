package defpackage;

/* renamed from: axnu */
public final class axnu extends anxl implements anzf {
    public static final axnu e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public boolean c;
    public arml d;
    private byte f = (byte) 2;

    private axnu() {
    }

    public final void a() {
        if (!this.b.a()) {
            this.b = anxl.mutableCopy(this.b);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002\u0007\u0000\u0003Љ\u0001", new Object[]{"a", "b", axnw.class, "c", "d"});
            case 3:
                return new axnu();
            case 4:
                return new axnt();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axnu.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axnu axnu = new axnu();
        e = axnu;
        anxl.registerDefaultInstance(axnu.class, axnu);
    }
}
