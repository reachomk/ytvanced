package defpackage;

/* renamed from: asrp */
public final class asrp extends anxl implements anzf {
    public static final asrp i;
    private static volatile anzq k;
    public int a;
    public asic b;
    public axak c;
    public axak d;
    public axak e;
    public anvu f = anvu.a;
    public boolean g;
    public arnm h;
    private byte j = (byte) 2;

    private asrp() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 128) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.h;
        return arnm == null ? arnm.a : arnm;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0005\u0007\u0007\u0006̉Љ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new asrp();
            case 4:
                return new asrs();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asrp.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asrp asrp = new asrp();
        i = asrp;
        anxl.registerDefaultInstance(asrp.class, asrp);
    }
}
