package defpackage;

/* renamed from: arnc */
public final class arnc extends anxl implements anzf {
    public static final arnc j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public String c;
    public arml d;
    public String e;
    public arml f;
    public apxu g;
    public arml h;
    public aywl i;
    private byte k = (byte) 2;

    private arnc() {
        String str = "";
        this.c = str;
        this.e = str;
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0006\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004\b\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new arnc();
            case 4:
                return new arnd();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (arnc.class) {
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
        arnc arnc = new arnc();
        j = arnc;
        anxl.registerDefaultInstance(arnc.class, arnc);
    }
}
