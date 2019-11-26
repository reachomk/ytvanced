package defpackage;

/* renamed from: aqfk */
public final class aqfk extends anxl implements anzf {
    public static final aqfk f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public arml d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private aqfk() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0001\u0003\u0001Л\u0004\n\u0003\u0006Љ\u0000\u0007Љ\u0001", new Object[]{"a", "b", aqfo.class, "e", "c", "d"});
            case 3:
                return new aqfk();
            case 4:
                return new aqfj();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqfk.class) {
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
        aqfk aqfk = new aqfk();
        f = aqfk;
        anxl.registerDefaultInstance(aqfk.class, aqfk);
    }
}
