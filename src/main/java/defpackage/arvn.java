package defpackage;

/* renamed from: arvn */
public final class arvn extends anxp implements anzf {
    public static final arvn f;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public axak d;
    public axak e;
    private byte g = (byte) 2;

    private arvn() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0003\f\u0004\u0000\u0000\u0004\u0003Љ\u0002\bЉ\u0003\u000bЉ\u0005\fЉ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new arvn();
            case 4:
                return new arvq();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arvn.class) {
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
        arvn arvn = new arvn();
        f = arvn;
        anxl.registerDefaultInstance(arvn.class, arvn);
    }
}
