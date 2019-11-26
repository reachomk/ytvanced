package defpackage;

/* renamed from: ayjf */
public final class ayjf extends anxl implements anzf {
    public static final ayjf e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private ayjf() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Л", new Object[]{"a", "b", "c", "d", axak.class});
            case 3:
                return new ayjf();
            case 4:
                return new ayji();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ayjf.class) {
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
        ayjf ayjf = new ayjf();
        e = ayjf;
        anxl.registerDefaultInstance(ayjf.class, ayjf);
    }
}
