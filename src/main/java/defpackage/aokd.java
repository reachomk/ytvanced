package defpackage;

/* renamed from: aokd */
public final class aokd extends anxl implements anzf {
    public static final aokd e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    private byte f = (byte) 2;

    private aokd() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0003\u0001Љ\u0000\bЉ\u0007\nЉ\b", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aokd();
            case 4:
                return new aokc();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aokd.class) {
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
        aokd aokd = new aokd();
        e = aokd;
        anxl.registerDefaultInstance(aokd.class, aokd);
    }
}
