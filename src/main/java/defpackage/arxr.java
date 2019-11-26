package defpackage;

/* renamed from: arxr */
public final class arxr extends anxl implements anzf {
    public static final arxr h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private arxr() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\u000e\u0006\u0000\u0004\u0001\u0002Љ\u0000\u0005\n\u0003\t\u001b\n\u001b\u000b\u001b\u000e\u001b", new Object[]{"a", "b", "g", "c", aule.class, "d", aule.class, "e", aule.class, "f", aule.class});
            case 3:
                return new arxr();
            case 4:
                return new arxu();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arxr.class) {
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
        arxr arxr = new arxr();
        h = arxr;
        anxl.registerDefaultInstance(arxr.class, arxr);
    }
}
