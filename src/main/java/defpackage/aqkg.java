package defpackage;

/* renamed from: aqkg */
public final class aqkg extends anxl implements anzf {
    public static final aqkg h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public String c;
    public aqtk d;
    public apxu e;
    public arml f;
    public String g;
    private byte i = (byte) 2;

    private aqkg() {
        String str = "";
        this.c = str;
        this.g = str;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0004\u0001Љ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\b\b\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqkg();
            case 4:
                return new aqkf();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqkg.class) {
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
        aqkg aqkg = new aqkg();
        h = aqkg;
        anxl.registerDefaultInstance(aqkg.class, aqkg);
    }
}
