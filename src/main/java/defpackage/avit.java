package defpackage;

/* renamed from: avit */
public final class avit extends anxl implements anzf {
    public static final avit f;
    private static volatile anzq h;
    public int a;
    public int b = 0;
    public Object c;
    public anyd d = anxl.emptyProtobufList();
    public avir e;
    private byte g = (byte) 2;

    private avit() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0001\u0004\u0001м\u0000\u0002Л\u0005Љ\u0002\u0006м\u0000", new Object[]{"c", "b", "a", arml.class, "d", aphj.class, "e", aviv.class});
            case 3:
                return new avit();
            case 4:
                return new aviw();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avit.class) {
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
        avit avit = new avit();
        f = avit;
        anxl.registerDefaultInstance(avit.class, avit);
    }
}
