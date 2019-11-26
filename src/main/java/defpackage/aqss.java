package defpackage;

/* renamed from: aqss */
public final class aqss extends anxl implements anzf {
    public static final aqss d;
    private static volatile anzq f;
    public int a;
    public aqsw b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aqss() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\t\u0000", new Object[]{"a", "c", aqte.class, "b"});
            case 3:
                return new aqss();
            case 4:
                return new aqsv();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqss.class) {
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
        aqss aqss = new aqss();
        d = aqss;
        anxl.registerDefaultInstance(aqss.class, aqss);
    }
}
