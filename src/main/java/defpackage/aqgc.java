package defpackage;

/* renamed from: aqgc */
public final class aqgc extends anxp implements anzf {
    public static final aqgc j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public apxu e;
    public aphj f;
    public aphj g;
    public apxu i;
    private byte k = (byte) 2;

    private aqgc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\u0007\u0000\u0001\u0002\f\u0007\u0000\u0000\u0007\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\b\fЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "i", "g"});
            case 3:
                return new aqgc();
            case 4:
                return new aqgb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqgc.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqgc aqgc = new aqgc();
        j = aqgc;
        anxl.registerDefaultInstance(aqgc.class, aqgc);
    }
}
