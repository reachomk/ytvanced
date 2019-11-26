package defpackage;

/* renamed from: azsv */
public final class azsv extends anxp implements anzf {
    public static final azsv l;
    private static volatile anzq n;
    public int a;
    public azsr b;
    public azsr c;
    public azsr d;
    public azsr e;
    public azsr f;
    public aztz g;
    public azsr i;
    public azsr j;
    public azsr k;
    private byte m = (byte) 2;

    private azsv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005\t\u0005\u0006Љ\u0003\u0007Љ\u0006\bЉ\u0007\tЉ\b", new Object[]{"a", "b", "c", "d", "f", "g", "e", "i", "j", "k"});
            case 3:
                return new azsv();
            case 4:
                return new azsu();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (azsv.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azsv azsv = new azsv();
        l = azsv;
        anxl.registerDefaultInstance(azsv.class, azsv);
    }
}
