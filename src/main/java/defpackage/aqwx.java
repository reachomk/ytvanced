package defpackage;

/* renamed from: aqwx */
public final class aqwx extends anxl implements anzf {
    public static final aqwx g;
    private static volatile anzq i;
    public int a;
    public arwf b;
    public String c;
    public String d;
    public anyd e;
    public anvu f;
    private byte h = (byte) 2;

    private aqwx() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = anxl.emptyProtobufList();
        this.f = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001\b\u0002\u0003\n\u0004\u0004\b\u0001\u0005\t\u0000\u0006Л", new Object[]{"a", "d", "f", "c", "b", "e", arml.class});
            case 3:
                return new aqwx();
            case 4:
                return new aqww();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqwx.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqwx aqwx = new aqwx();
        g = aqwx;
        anxl.registerDefaultInstance(aqwx.class, aqwx);
    }
}
