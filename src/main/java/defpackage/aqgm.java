package defpackage;

/* renamed from: aqgm */
public final class aqgm extends anxl implements anzf {
    public static final aqgm h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public aygk f;
    public anvu g;
    private byte i = (byte) 2;

    private aqgm() {
        anxl.emptyProtobufList();
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\b\n\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqgm();
            case 4:
                return new aqgl();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqgm.class) {
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
        aqgm aqgm = new aqgm();
        h = aqgm;
        anxl.registerDefaultInstance(aqgm.class, aqgm);
    }
}
