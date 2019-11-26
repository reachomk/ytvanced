package defpackage;

/* renamed from: azie */
public final class azie extends anxl implements anzf {
    public static final azie h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public apxu c;
    public anyd d = anxl.emptyProtobufList();
    public azik e;
    public arml f;
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private azie() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0006Љ\u0004\u0007Љ\u0005\t\n\u0007", new Object[]{"a", "b", "c", "d", azic.class, "e", "f", "g"});
            case 3:
                return new azie();
            case 4:
                return new azih();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azie.class) {
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
        azie azie = new azie();
        h = azie;
        anxl.registerDefaultInstance(azie.class, azie);
    }
}
