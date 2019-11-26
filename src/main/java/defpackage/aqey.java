package defpackage;

/* renamed from: aqey */
public final class aqey extends anxl implements anzf {
    public static final aqey n;
    private static volatile anzq p;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 0;
    public Object e;
    public arml f;
    public arml g;
    public apdh h;
    public arml i;
    public aqfa j;
    public aqes k;
    public aqeu l;
    public anvu m;
    private byte o = (byte) 2;

    private aqey() {
        anxl.emptyProtobufList();
        this.m = anvu.a;
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
                return anxl.newMessageInfo(n, "\u0001\u000e\u0002\u0001\u0001\u0014\u000e\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0005\u0004м\u0000\u0005м\u0001\u0006м\u0001\b\n\u0013\nЉ\u0003\u000bЉ\u0004\u000eм\u0001\u0010м\u0000\u0011\t\u000e\u0012\t\u000f\u0014<\u0001", new Object[]{"c", "b", "e", "d", "a", "f", "g", "j", apxu.class, arml.class, arml.class, "m", "h", "i", aqew.class, apxu.class, "k", "l", arwf.class});
            case 3:
                return new aqey();
            case 4:
                return new aqex();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aqey.class) {
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
        aqey aqey = new aqey();
        n = aqey;
        anxl.registerDefaultInstance(aqey.class, aqey);
    }
}
