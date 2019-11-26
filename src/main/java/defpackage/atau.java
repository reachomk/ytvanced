package defpackage;

/* renamed from: atau */
public final class atau extends anxl implements anzf {
    public static final atau f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public boolean e;
    private byte g = (byte) 2;

    private atau() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001Љ\u0000\u0002\u001a\u0003\u001a\u0004\u0007\u0001", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new atau();
            case 4:
                return new atat();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atau.class) {
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
        atau atau = new atau();
        f = atau;
        anxl.registerDefaultInstance(atau.class, atau);
    }
}
