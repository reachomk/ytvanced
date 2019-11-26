package defpackage;

/* renamed from: aqdq */
public final class aqdq extends anxp implements anzf {
    public static final aqdq f;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private aqdq() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0003\bЉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqdq();
            case 4:
                return new aqdp();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqdq.class) {
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
        aqdq aqdq = new aqdq();
        f = aqdq;
        anxl.registerDefaultInstance(aqdq.class, aqdq);
    }
}
