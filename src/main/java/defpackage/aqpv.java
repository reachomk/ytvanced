package defpackage;

/* renamed from: aqpv */
public final class aqpv extends anxl implements anzf {
    public static final aqpv f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private aqpv() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005\n\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqpv();
            case 4:
                return new aqpu();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqpv.class) {
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

    public static anzq a() {
        return f.getParserForType();
    }

    static {
        aqpv aqpv = new aqpv();
        f = aqpv;
        anxl.registerDefaultInstance(aqpv.class, aqpv);
    }
}
