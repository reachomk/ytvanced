package defpackage;

/* renamed from: asrl */
public final class asrl extends anxl implements anzf {
    public static final asrl d;
    private static volatile anzq f;
    public int a;
    public asic b;
    public arnm c;
    private byte e = (byte) 2;

    private asrl() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 8) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.c;
        return arnm == null ? arnm.a : arnm;
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001̉\u0002\u0000\u0000\u0002\u0001Љ\u0000̉Љ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new asrl();
            case 4:
                return new asro();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asrl.class) {
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
        asrl asrl = new asrl();
        d = asrl;
        anxl.registerDefaultInstance(asrl.class, asrl);
    }
}
