package defpackage;

/* renamed from: axsp */
public final class axsp extends anxl implements anzf {
    public static final axsp m;
    private static volatile anzq o;
    public int a;
    public int b;
    public aygk c;
    public aygk d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public axak i;
    public axak j;
    public axak k;
    public axak l;
    private byte n = (byte) 2;

    private axsp() {
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\n\u0001\u000b\u0000\u0002Љ\u0002\u0004Љ\u0005\u0005Љ\u0006\u0006Љ\b\u0007Љ\u0001\bЉ\u0007\tЉ\t\nЉ\n\u000bЉ\u0004\rЉ\u000b", new Object[]{"a", "b", "d", "f", "g", "i", "c", "h", "j", "k", "e", "l"});
            case 3:
                return new axsp();
            case 4:
                return new axso();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (axsp.class) {
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

    public static anzq a() {
        return m.getParserForType();
    }

    static {
        axsp axsp = new axsp();
        m = axsp;
        anxl.registerDefaultInstance(axsp.class, axsp);
    }
}
