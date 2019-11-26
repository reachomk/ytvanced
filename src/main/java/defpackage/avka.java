package defpackage;

/* renamed from: avka */
public final class avka extends anxl implements anzf {
    public static final avka d;
    private static volatile anzq f;
    public int a;
    public arml b;
    public avjy c;
    private byte e = (byte) 2;

    private avka() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002Љ\u0001\u0004Љ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new avka();
            case 4:
                return new avjz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avka.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avka avka = new avka();
        d = avka;
        anxl.registerDefaultInstance(avka.class, avka);
    }
}
