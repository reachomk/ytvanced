package defpackage;

/* renamed from: ayqh */
public final class ayqh extends anxl implements anzf {
    public static final ayqh e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    private byte f = (byte) 2;

    private ayqh() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\r\u0003\u0000\u0000\u0003\u0003Љ\u0002\u0004Љ\u0003\rЉ\u0006", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ayqh();
            case 4:
                return new ayqg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayqh.class) {
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
        ayqh ayqh = new ayqh();
        e = ayqh;
        anxl.registerDefaultInstance(ayqh.class, ayqh);
    }
}
