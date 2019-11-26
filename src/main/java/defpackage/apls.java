package defpackage;

/* renamed from: apls */
public final class apls extends anxl implements anzf {
    public static final apls h;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public String d;
    public aygk e;
    public int f;
    public int g;
    private byte i = (byte) 2;

    private apls() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new apls();
            case 4:
                return new aplv();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apls.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apls apls = new apls();
        h = apls;
        anxl.registerDefaultInstance(apls.class, apls);
    }
}
