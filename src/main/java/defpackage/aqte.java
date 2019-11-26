package defpackage;

/* renamed from: aqte */
public final class aqte extends anxl implements anzf {
    public static final aqte d;
    private static volatile anzq f;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aqte() {
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
                return anxl.newMessageInfo(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0001\u0001\u001a\u0002Л\u0003\u001a", new Object[]{"a", "b", aqta.class, "c"});
            case 3:
                return new aqte();
            case 4:
                return new aqth();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqte.class) {
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
        aqte aqte = new aqte();
        d = aqte;
        anxl.registerDefaultInstance(aqte.class, aqte);
    }
}
