package defpackage;

/* renamed from: aynn */
public final class aynn extends anxl implements anzf {
    public static final aynn n;
    private static volatile anzq p;
    public int a;
    public aygk b;
    public aygk c;
    public aynl d;
    public arml e;
    public arml f;
    public arml g;
    public anyd h = anxl.emptyProtobufList();
    public azny i;
    public aphj j;
    public arml k;
    public aynh l;
    public anvu m = anvu.a;
    private byte o = (byte) 2;

    private aynn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0003\u0003Љ\u0004\u0004Љ\u0007\u0006\n\u0010\u0007Љ\u0001\bЉ\u0005\tЉ\b\u000bЛ\fЉ\u0006\u000e\t\u0002\u000fЉ\u000b", new Object[]{"a", "b", "e", "f", "j", "m", "c", "g", "k", "h", arml.class, "i", "d", "l"});
            case 3:
                return new aynn();
            case 4:
                return new aynq();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aynn.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return n.getParserForType();
    }

    static {
        aynn aynn = new aynn();
        n = aynn;
        anxl.registerDefaultInstance(aynn.class, aynn);
    }
}
