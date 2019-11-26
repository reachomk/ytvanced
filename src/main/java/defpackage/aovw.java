package defpackage;

/* renamed from: aovw */
public final class aovw extends anxl implements anzf {
    public static final aovw e;
    private static volatile anzq g;
    public int a;
    public aovu b;
    public aovs c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private aovw() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Л", new Object[]{"a", "b", "c", "d", aovq.class});
            case 3:
                return new aovw();
            case 4:
                return new aovz();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aovw.class) {
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
        aovw aovw = new aovw();
        e = aovw;
        anxl.registerDefaultInstance(aovw.class, aovw);
    }
}
