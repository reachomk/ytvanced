package defpackage;

/* renamed from: avfo */
public final class avfo extends anxl implements anzf {
    public static final avfo d;
    private static volatile anzq f;
    public int a;
    public axak b;
    public axak c;
    private byte e = (byte) 2;

    private avfo() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0005Љ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new avfo();
            case 4:
                return new avfn();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avfo.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avfo avfo = new avfo();
        d = avfo;
        anxl.registerDefaultInstance(avfo.class, avfo);
    }
}
