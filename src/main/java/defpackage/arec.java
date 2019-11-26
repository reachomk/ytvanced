package defpackage;

/* renamed from: arec */
public final class arec extends anxl implements anzf {
    public static final arec f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public arml c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private arec() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0004\u0002Л\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003", new Object[]{"a", "b", area.class, "c", "d", "e"});
            case 3:
                return new arec();
            case 4:
                return new areb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arec.class) {
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
        arec arec = new arec();
        f = arec;
        anxl.registerDefaultInstance(arec.class, arec);
    }
}
