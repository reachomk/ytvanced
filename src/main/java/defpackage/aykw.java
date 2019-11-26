package defpackage;

/* renamed from: aykw */
public final class aykw extends anxl implements anzf {
    public static final aykw d;
    private static volatile anzq f;
    public int a;
    public aqhy b;
    public aruh c;
    private byte e = (byte) 2;

    private aykw() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001Ẑヺ\u0002\u0000\u0000\u0002ẐЉ\u0000ヺЉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aykw();
            case 4:
                return new aykz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aykw.class) {
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
        aykw aykw = new aykw();
        d = aykw;
        anxl.registerDefaultInstance(aykw.class, aykw);
    }
}
