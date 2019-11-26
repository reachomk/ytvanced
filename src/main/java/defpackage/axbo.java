package defpackage;

/* renamed from: axbo */
public final class axbo extends anxl implements anzf {
    public static final axbo m;
    private static volatile anzq o;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public axbm h;
    public axak i;
    public anyd j = anxl.emptyProtobufList();
    public axbh k;
    public anvu l = anvu.a;
    private byte n = (byte) 2;

    private axbo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0001\u0001\u0001\f\u000b\u0000\u0001\b\u0001Љ\u0000\u0002Љ\u0002\u0003м\u0000\u0004Љ\u0006\u0006\n\n\u0007<\u0000\b\t\b\tЛ\nЉ\u0003\u000bЉ\u0007\fЉ\u0001", new Object[]{"c", "b", "a", "d", "f", appu.class, "h", "l", arwf.class, "k", "j", axbk.class, "g", "i", "e"});
            case 3:
                return new axbo();
            case 4:
                return new axbr();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (axbo.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axbo axbo = new axbo();
        m = axbo;
        anxl.registerDefaultInstance(axbo.class, axbo);
    }
}
