package defpackage;

/* renamed from: aocr */
public final class aocr extends anxl implements anzf {
    public static final aocr f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public int c;
    public long d;
    public int e;
    private byte g = (byte) 2;

    private aocr() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0003\u0001Ԉ\u0000\u0002ԋ\u0001\u0003ԃ\u0002\u0006\u000b\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aocr();
            case 4:
                return new aocu();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aocr.class) {
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
        aocr aocr = new aocr();
        f = aocr;
        anxl.registerDefaultInstance(aocr.class, aocr);
    }
}
