package defpackage;

/* renamed from: aqkc */
public final class aqkc extends anxl implements anzf {
    public static final aqkc h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public String c;
    public aqtk d;
    public apxu e;
    public String f;
    public anvu g;
    private byte i = (byte) 2;

    private aqkc() {
        String str = "";
        this.c = str;
        this.f = str;
        this.g = anvu.a;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0006\u0007\b\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "f"});
            case 3:
                return new aqkc();
            case 4:
                return new aqkb();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqkc.class) {
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
        aqkc aqkc = new aqkc();
        h = aqkc;
        anxl.registerDefaultInstance(aqkc.class, aqkc);
    }
}
