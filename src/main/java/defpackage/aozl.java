package defpackage;

/* renamed from: aozl */
public final class aozl extends anxl implements anzf {
    public static final aozl i;
    private static volatile anzq k;
    public int a;
    public int b;
    public apxu c;
    public aozk d;
    public apxu e;
    public aozk f;
    public apxu g;
    public aozk h;
    private byte j = (byte) 2;

    private aozl() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0006\u0001\f\u0000\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0005\u0005Љ\u0002\u0006Љ\u0004\u0007Љ\u0006", new Object[]{"a", "b", aozo.a, "c", "e", "g", "d", "f", "h"});
            case 3:
                return new aozl();
            case 4:
                return new aozm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aozl.class) {
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
        aozl aozl = new aozl();
        i = aozl;
        anxl.registerDefaultInstance(aozl.class, aozl);
    }
}
