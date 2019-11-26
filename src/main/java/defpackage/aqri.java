package defpackage;

/* renamed from: aqri */
public final class aqri extends anxl implements anzf {
    public static final aqri e;
    private static volatile anzq g;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private aqri() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0003\u0001Л\u0002Љ\u0000\u0006Љ\u0003", new Object[]{"a", "b", axak.class, "c", "d"});
            case 3:
                return new aqri();
            case 4:
                return new aqrh();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqri.class) {
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
        aqri aqri = new aqri();
        e = aqri;
        anxl.registerDefaultInstance(aqri.class, aqri);
    }
}
