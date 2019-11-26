package defpackage;

/* renamed from: athy */
public final class athy extends anxl implements anzf {
    public static final athy e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public arnm d;
    private byte f = (byte) 2;

    private athy() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 4) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.d;
        return arnm == null ? arnm.a : arnm;
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001Љ\u0000\bЛ̉Љ\u0002", new Object[]{"a", "b", "c", apxu.class, "d"});
            case 3:
                return new athy();
            case 4:
                return new athx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (athy.class) {
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
        athy athy = new athy();
        e = athy;
        anxl.registerDefaultInstance(athy.class, athy);
    }
}
