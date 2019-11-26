package defpackage;

/* renamed from: axsv */
public final class axsv extends anxl implements anzf {
    public static final axsv h;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public anyd f = anxl.emptyProtobufList();
    public boolean g;
    private byte i = (byte) 2;

    private axsv() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005\u0007\u0004\u0006Љ\u0003", new Object[]{"a", "b", "c", "d", "f", axak.class, "g", "e"});
            case 3:
                return new axsv();
            case 4:
                return new axsu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axsv.class) {
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
        axsv axsv = new axsv();
        h = axsv;
        anxl.registerDefaultInstance(axsv.class, axsv);
    }
}
