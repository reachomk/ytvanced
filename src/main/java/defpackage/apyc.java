package defpackage;

/* renamed from: apyc */
public final class apyc extends anxl implements anzf {
    public static final apyc f;
    private static volatile anzq h;
    public int a;
    public arwf b;
    public apye c;
    public arml d;
    public apxu e;
    private byte g = (byte) 2;

    private apyc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\t\u0000\u0002\t\u0002\u0003Љ\u0003\u0004Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new apyc();
            case 4:
                return new apyf();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apyc.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apyc apyc = new apyc();
        f = apyc;
        anxl.registerDefaultInstance(apyc.class, apyc);
    }
}
