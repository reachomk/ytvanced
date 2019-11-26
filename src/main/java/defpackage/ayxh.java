package defpackage;

/* renamed from: ayxh */
public final class ayxh extends anxl implements anzf {
    public static final ayxh e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    private byte f = (byte) 2;

    private ayxh() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\b\u0003\u0000\u0000\u0003\u0003Љ\u0001\u0004Љ\u0002\bЉ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ayxh();
            case 4:
                return new ayxg();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayxh.class) {
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
        ayxh ayxh = new ayxh();
        e = ayxh;
        anxl.registerDefaultInstance(ayxh.class, ayxh);
    }
}
