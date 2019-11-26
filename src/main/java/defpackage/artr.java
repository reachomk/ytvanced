package defpackage;

/* renamed from: artr */
public final class artr extends anxl implements anzf {
    public static final artr j;
    private static volatile anzq l;
    public int a;
    public artt b;
    public boolean c;
    public arwf d;
    public arml e;
    public apxu f;
    public apxu g;
    public aodx h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private artr() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0003\u0001\t\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007\t\u0006\t\n\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new artr();
            case 4:
                return new artu();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (artr.class) {
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
        artr artr = new artr();
        j = artr;
        anxl.registerDefaultInstance(artr.class, artr);
    }
}
