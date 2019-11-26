package defpackage;

/* renamed from: ayag */
public final class ayag extends anxl implements anzf {
    public static final ayag d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    private byte e = (byte) 2;

    private ayag() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002\f\u0000", new Object[]{"a", "b", ayas.class, "c", axzn.a});
            case 3:
                return new ayag();
            case 4:
                return new ayaj();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayag.class) {
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
        ayag ayag = new ayag();
        d = ayag;
        anxl.registerDefaultInstance(ayag.class, ayag);
    }
}
