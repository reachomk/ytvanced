package defpackage;

/* renamed from: awps */
public final class awps extends anxl implements anzf {
    public static final awps h;
    private static volatile anzq j;
    public int a;
    public awpo b;
    public awpq c;
    public anyd d = anxl.emptyProtobufList();
    public aojc e;
    public anvu f = anvu.a;
    public String g = "";
    private byte i = (byte) 2;

    private awps() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003\u001b\u0004Љ\u0002\u0006\n\u0004\u0007\b\u0005", new Object[]{"a", "b", "c", "d", awqs.class, "e", "f", "g"});
            case 3:
                return new awps();
            case 4:
                return new awpv();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awps.class) {
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
        awps awps = new awps();
        h = awps;
        anxl.registerDefaultInstance(awps.class, awps);
    }
}
