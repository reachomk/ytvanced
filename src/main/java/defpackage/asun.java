package defpackage;

/* renamed from: asun */
public final class asun extends anxl implements anzf {
    public static final asun g;
    private static volatile anzq i;
    public int a;
    public asic b;
    public apxu c;
    public arex d;
    public apxu e;
    public arnm f;
    private byte h = (byte) 2;

    private asun() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 32) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.f;
        return arnm == null ? arnm.a : arnm;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003̉Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new asun();
            case 4:
                return new asuq();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asun.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asun asun = new asun();
        g = asun;
        anxl.registerDefaultInstance(asun.class, asun);
    }
}
