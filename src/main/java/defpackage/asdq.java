package defpackage;

/* renamed from: asdq */
public final class asdq extends anxl implements anzf {
    public static final asdq i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public String c;
    public boolean d;
    public long e;
    public String f;
    public int g;
    public int h;
    private byte j = (byte) 2;

    private asdq() {
        String str = "";
        this.c = str;
        this.f = str;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u0002\u0003\u0005\b\u0004\u0006\f\u0005\b\f\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", arar.a, "h", avuq.a});
            case 3:
                return new asdq();
            case 4:
                return new asdt();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asdq.class) {
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
        asdq asdq = new asdq();
        i = asdq;
        anxl.registerDefaultInstance(asdq.class, asdq);
    }
}
