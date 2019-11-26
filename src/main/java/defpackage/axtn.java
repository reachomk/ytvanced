package defpackage;

/* renamed from: axtn */
public final class axtn extends anxl implements anzf {
    public static final axtn h;
    private static volatile anzq j;
    public int a;
    public aygk b;
    public apxu c;
    public axtp d;
    public arml e;
    public anyd f = anxl.emptyProtobufList();
    public anvu g = anvu.a;
    private byte i = (byte) 2;

    private axtn() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006\n\u0005\u0007Л", new Object[]{"a", "b", "c", "d", "e", "g", "f", ayfu.class});
            case 3:
                return new axtn();
            case 4:
                return new axtm();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axtn.class) {
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
        axtn axtn = new axtn();
        h = axtn;
        anxl.registerDefaultInstance(axtn.class, axtn);
    }
}
