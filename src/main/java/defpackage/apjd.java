package defpackage;

/* renamed from: apjd */
public final class apjd extends anxl implements anzf {
    public static final apjd f;
    private static volatile anzq h;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public apxu e;
    private byte g = (byte) 2;

    private apjd() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0003Љ\u0001\bЉ\u0004\nЉ\u0002", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new apjd();
            case 4:
                return new apjc();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apjd.class) {
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
        apjd apjd = new apjd();
        f = apjd;
        anxl.registerDefaultInstance(apjd.class, apjd);
    }
}
