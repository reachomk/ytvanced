package defpackage;

/* renamed from: auwb */
public final class auwb extends anxl implements anzf {
    public static final auwb l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public apxu e;
    public arml f;
    public arml g;
    public arwf h;
    public apxu i;
    public boolean j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private auwb() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0006\u0001Љ\u0000\u0002\t\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005\t\u0006\u0006Љ\u0007\b\n\n\u000b\u0007\b\fЉ\u0001\rЉ\u0005", new Object[]{"a", "b", "d", "e", "f", "h", "i", "k", "j", "c", "g"});
            case 3:
                return new auwb();
            case 4:
                return new auwe();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (auwb.class) {
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
        auwb auwb = new auwb();
        l = auwb;
        anxl.registerDefaultInstance(auwb.class, auwb);
    }
}
