package defpackage;

/* renamed from: awyk */
public final class awyk extends anxl implements anzf {
    public static final awyk h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public axak c;
    public anyd d = anxl.emptyProtobufList();
    public awym e;
    public anvu f = anvu.a;
    public axak g;
    private byte i = (byte) 2;

    private awyk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0005\n\u0004\u0006Љ\u0005\u0007\t\u0002", new Object[]{"a", "b", "c", "d", axak.class, "f", "g", "e"});
            case 3:
                return new awyk();
            case 4:
                return new awyn();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awyk.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return h.getParserForType();
    }

    static {
        awyk awyk = new awyk();
        h = awyk;
        anxl.registerDefaultInstance(awyk.class, awyk);
    }
}
