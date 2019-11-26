package defpackage;

/* renamed from: aqnt */
public final class aqnt extends anxl implements anzf {
    public static final aqnt g;
    private static volatile anzq i;
    public int a;
    public long b;
    public String c = "";
    public arml d;
    public arml e;
    public anyd f = anxl.emptyProtobufList();
    private byte h = (byte) 2;

    private aqnt() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0003\u0001\u0002\u0000\u0002Љ\u0002\u0003Љ\u0003\u0007\b\u0001\bЛ", new Object[]{"a", "b", "d", "e", "c", "f", aygk.class});
            case 3:
                return new aqnt();
            case 4:
                return new aqns();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqnt.class) {
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
        aqnt aqnt = new aqnt();
        g = aqnt;
        anxl.registerDefaultInstance(aqnt.class, aqnt);
    }
}
