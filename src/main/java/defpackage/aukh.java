package defpackage;

/* renamed from: aukh */
public final class aukh extends anxl implements anzf {
    public static final aukh g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    private byte h = (byte) 2;

    private aukh() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0004Љ\u0002\u0007Љ\u0005\nЉ\u0003\u0010Љ\u0007", new Object[]{"a", "b", "c", "e", "d", "f"});
            case 3:
                return new aukh();
            case 4:
                return new aukj();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aukh.class) {
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
        aukh aukh = new aukh();
        g = aukh;
        anxl.registerDefaultInstance(aukh.class, aukh);
    }
}
