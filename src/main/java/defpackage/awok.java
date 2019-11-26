package defpackage;

/* renamed from: awok */
public final class awok extends anxl implements anzf {
    public static final awok f;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public anyd c = anxl.emptyProtobufList();
    public apxu d;
    public apxu e;
    private byte g = (byte) 2;

    private awok() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0003\u0002\u0007\u0001\u0003Л\u0004Љ\u0002\u0005Љ\u0003", new Object[]{"a", "b", "c", apxu.class, "d", "e"});
            case 3:
                return new awok();
            case 4:
                return new awon();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awok.class) {
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
        awok awok = new awok();
        f = awok;
        anxl.registerDefaultInstance(awok.class, awok);
    }
}
