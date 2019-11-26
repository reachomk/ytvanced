package defpackage;

/* renamed from: axoe */
public final class axoe extends anxl implements anzf {
    public static final axoe e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anvu c = anvu.a;
    public int d;
    private byte f = (byte) 2;

    private axoe() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Л\u0003\n\u0001\u0004\f\u0002", new Object[]{"a", "b", arml.class, "c", "d", axob.a});
            case 3:
                return new axoe();
            case 4:
                return new axod();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axoe.class) {
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
        axoe axoe = new axoe();
        e = axoe;
        anxl.registerDefaultInstance(axoe.class, axoe);
    }
}
