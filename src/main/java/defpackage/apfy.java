package defpackage;

/* renamed from: apfy */
public final class apfy extends anxl implements anzf {
    public static final apfy h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public anyd d;
    public axak e;
    public axak f;
    public anvu g;
    private byte i = (byte) 2;

    private apfy() {
        anxl.emptyProtobufList();
        this.d = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\b\u0014\u0006\u0000\u0001\u0005\bм\u0000\nЛ\rЉ\r\u000eЉ\u000e\u0010\n\u0010\u0014м\u0000", new Object[]{"c", "b", "a", aokm.class, "d", apxu.class, "e", "f", "g", axak.class});
            case 3:
                return new apfy();
            case 4:
                return new apfx();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apfy.class) {
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
        apfy apfy = new apfy();
        h = apfy;
        anxl.registerDefaultInstance(apfy.class, apfy);
    }
}
