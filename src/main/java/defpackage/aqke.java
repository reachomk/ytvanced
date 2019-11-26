package defpackage;

/* renamed from: aqke */
public final class aqke extends anxl implements anzf {
    public static final aqke f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public String c;
    public aqtk d;
    public String e;
    private byte g = (byte) 2;

    private aqke() {
        String str = "";
        this.c = str;
        this.e = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002\u0006\b\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqke();
            case 4:
                return new aqkd();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aqke.class) {
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
        aqke aqke = new aqke();
        f = aqke;
        anxl.registerDefaultInstance(aqke.class, aqke);
    }
}
