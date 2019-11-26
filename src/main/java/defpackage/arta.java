package defpackage;

/* renamed from: arta */
public final class arta extends anxl implements anzf {
    public static final arta e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private arta() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0003\u0002Љ\u0002\bЉ\u0001\tЉ\u0003", new Object[]{"a", "c", "b", "d"});
            case 3:
                return new arta();
            case 4:
                return new artd();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arta.class) {
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

    static {
        arta arta = new arta();
        e = arta;
        anxl.registerDefaultInstance(arta.class, arta);
    }
}
