package defpackage;

/* renamed from: aufu */
public final class aufu extends anxl implements anzf {
    public static final aufu g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    private byte h = (byte) 2;

    private aufu() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0001\u0005Љ\u0004", new Object[]{"a", "b", "d", "e", "c", "f"});
            case 3:
                return new aufu();
            case 4:
                return new aufx();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aufu.class) {
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
        aufu aufu = new aufu();
        g = aufu;
        anxl.registerDefaultInstance(aufu.class, aufu);
    }
}
