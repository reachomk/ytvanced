package defpackage;

/* renamed from: axtp */
public final class axtp extends anxl implements anzf {
    public static final axtp i;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    private byte j = (byte) 2;

    private axtp() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0006\u0002\u0007\u0000\u0003Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new axtp();
            case 4:
                return new axto();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (axtp.class) {
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
        axtp axtp = new axtp();
        i = axtp;
        anxl.registerDefaultInstance(axtp.class, axtp);
    }
}
