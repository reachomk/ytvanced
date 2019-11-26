package defpackage;

/* renamed from: aqqb */
public final class aqqb extends anxl implements anzf {
    public static final aqqb g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public arml e;
    public arml f;
    private byte h = (byte) 2;

    private aqqb() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aqqb();
            case 4:
                return new aqqa();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqqb.class) {
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
        aqqb aqqb = new aqqb();
        g = aqqb;
        anxl.registerDefaultInstance(aqqb.class, aqqb);
    }
}
