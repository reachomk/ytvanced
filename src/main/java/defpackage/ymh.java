package defpackage;

/* renamed from: ymh */
public final class ymh extends anxl implements anzf {
    public static final ymh d;
    private static volatile anzq f;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private ymh() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\f\u0000\u0002Л", new Object[]{"a", "b", ymm.a, "c", ymr.class});
            case 3:
                return new ymh();
            case 4:
                return new ymk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ymh.class) {
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
        ymh ymh = new ymh();
        d = ymh;
        anxl.registerDefaultInstance(ymh.class, ymh);
    }
}
