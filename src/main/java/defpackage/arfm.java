package defpackage;

/* renamed from: arfm */
public final class arfm extends anxl implements anzf {
    public static final arfm b;
    public static final anxr c;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private arfm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", arfo.class});
            case 3:
                return new arfm();
            case 4:
                return new arfp();
            case 5:
                return b;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arfm.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arfm arfm = new arfm();
        b = arfm;
        anxl.registerDefaultInstance(arfm.class, arfm);
        arnm arnm = arnm.a;
        arfm arfm2 = b;
        c = anxl.newSingularGeneratedExtension(arnm, arfm2, arfm2, null, 1, aobm.MESSAGE, arfm.class);
    }
}
