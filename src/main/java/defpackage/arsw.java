package defpackage;

/* renamed from: arsw */
public final class arsw extends anxl implements anzf {
    public static final arsw f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public arsy d;
    public String e = "";
    private byte g = (byte) 2;

    private arsw() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\n\u0013\u0004\u0000\u0000\u0003\nЉ\u0002\u000bЉ\u0004\fЉ\f\u0013\b\u0012", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new arsw();
            case 4:
                return new arsz();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arsw.class) {
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
        arsw arsw = new arsw();
        f = arsw;
        anxl.registerDefaultInstance(arsw.class, arsw);
    }
}
