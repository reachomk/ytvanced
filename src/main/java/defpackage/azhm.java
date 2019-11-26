package defpackage;

/* renamed from: azhm */
public final class azhm extends anxl implements anzf {
    public static final azhm f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public apxu d;
    public arml e;
    private byte g = (byte) 2;

    private azhm() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0005Љ\u0001\u0006Љ\u0002", new Object[]{"a", "b", "c", azhk.class, "d", "e"});
            case 3:
                return new azhm();
            case 4:
                return new azhp();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azhm.class) {
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
        azhm azhm = new azhm();
        f = azhm;
        anxl.registerDefaultInstance(azhm.class, azhm);
    }
}
