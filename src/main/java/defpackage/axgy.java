package defpackage;

/* renamed from: axgy */
public final class axgy extends anxl implements anzf {
    public static final axgy j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public apxu i;
    private byte k = (byte) 2;

    private axgy() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\b\u0001Љ\u0001\u0002Љ\u0004\u0003Љ\u0002\u0004Љ\u0007\u0005Љ\b\u0007Љ\u0003\u000bЉ\u0005\fЉ\u0006", new Object[]{"a", "b", "e", "c", "h", "i", "d", "f", "g"});
            case 3:
                return new axgy();
            case 4:
                return new axhb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (axgy.class) {
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
        axgy axgy = new axgy();
        j = axgy;
        anxl.registerDefaultInstance(axgy.class, axgy);
    }
}
