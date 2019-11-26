package defpackage;

/* renamed from: avim */
public final class avim extends anxl implements anzf {
    public static final avim g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public auvr e;
    public avik f;
    private byte h = (byte) 2;

    private avim() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\n\u0005\u0000\u0000\u0005\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\bЉ\u0005\nЉ\b", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new avim();
            case 4:
                return new avil();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (avim.class) {
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
        avim avim = new avim();
        g = avim;
        anxl.registerDefaultInstance(avim.class, avim);
    }
}
