package defpackage;

/* renamed from: axtd */
public final class axtd extends anxl implements anzf {
    public static final axtd f;
    private static volatile anzq h;
    public int a;
    public axak b;
    public anvu c = anvu.a;
    public axak d;
    public axak e;
    private byte g = (byte) 2;

    private axtd() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0003\n\u0002\u0004Љ\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new axtd();
            case 4:
                return new axtc();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axtd.class) {
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
        axtd axtd = new axtd();
        f = axtd;
        anxl.registerDefaultInstance(axtd.class, axtd);
    }
}
