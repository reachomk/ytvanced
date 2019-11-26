package defpackage;

/* renamed from: axsh */
public final class axsh extends anxl implements anzf {
    public static final axsh e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public axak c;
    public axak d;
    private byte f = (byte) 2;

    private axsh() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new axsh();
            case 4:
                return new axsg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axsh.class) {
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

    public static anzq a() {
        return e.getParserForType();
    }

    static {
        axsh axsh = new axsh();
        e = axsh;
        anxl.registerDefaultInstance(axsh.class, axsh);
    }
}
