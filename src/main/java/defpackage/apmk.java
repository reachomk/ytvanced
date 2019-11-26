package defpackage;

/* renamed from: apmk */
public final class apmk extends anxl implements anzf {
    public static final apmk f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public apxu d;
    public anvu e = anvu.a;
    private byte g = (byte) 2;

    private apmk() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0005\n\u0003", new Object[]{"a", "b", apmm.class, "c", "d", "e"});
            case 3:
                return new apmk();
            case 4:
                return new apmn();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apmk.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apmk apmk = new apmk();
        f = apmk;
        anxl.registerDefaultInstance(apmk.class, apmk);
    }
}
