package defpackage;

/* renamed from: apjq */
public final class apjq extends anxp implements anzf {
    public static final apjq d;
    private static volatile anzq f;
    public int a;
    public apjs b;
    public axak c;
    private byte e = (byte) 2;

    private apjq() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\n\u0002\u0000\u0000\u0002\u0002Љ\u0000\nЉ\u0006", new Object[]{"a", "b", "c"});
            case 3:
                return new apjq();
            case 4:
                return new apjp();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apjq.class) {
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
        apjq apjq = new apjq();
        d = apjq;
        anxl.registerDefaultInstance(apjq.class, apjq);
    }
}
