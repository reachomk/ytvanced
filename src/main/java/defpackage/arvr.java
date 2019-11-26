package defpackage;

/* renamed from: arvr */
public final class arvr extends anxp implements anzf {
    public static final arvr f;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public axak d;
    public axak e;
    private byte g = (byte) 2;

    private arvr() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003\u0007\u0004\u0000\u0000\u0004\u0003Љ\u0000\u0005Љ\u0001\u0006Љ\u0002\u0007Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new arvr();
            case 4:
                return new arvu();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arvr.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        arvr arvr = new arvr();
        f = arvr;
        anxl.registerDefaultInstance(arvr.class, arvr);
    }
}
