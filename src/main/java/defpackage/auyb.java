package defpackage;

/* renamed from: auyb */
public final class auyb extends anxl implements anzf {
    public static final auyb d;
    private static volatile anzq f;
    public int a;
    public int b;
    public apxu c;
    private byte e = (byte) 2;

    private auyb() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\f\u0000\u0002Љ\u0001", new Object[]{"a", "b", awbm.a, "c"});
            case 3:
                return new auyb();
            case 4:
                return new auyd();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (auyb.class) {
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
        auyb auyb = new auyb();
        d = auyb;
        anxl.registerDefaultInstance(auyb.class, auyb);
    }
}
