package defpackage;

/* renamed from: aygc */
public final class aygc extends anxl implements anzf {
    public static final aygc d;
    private static volatile anzq f;
    public int a;
    public apxu b;
    public apxu c;
    private byte e = (byte) 2;

    private aygc() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0002\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", "c"});
            case 3:
                return new aygc();
            case 4:
                return new aygb();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aygc.class) {
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
        aygc aygc = new aygc();
        d = aygc;
        anxl.registerDefaultInstance(aygc.class, aygc);
    }
}
