package defpackage;

/* renamed from: axmk */
public final class axmk extends anxl implements anzf {
    public static final axmk l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public axmx c;
    public anyd d = anxl.emptyProtobufList();
    public appu e;
    public apxu f;
    public arml g;
    public arml h;
    public apdx i;
    public auvr j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private axmk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\t\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0006\tЉ\u0007\u000b\n\t\fЛ\rЉ\u0002", new Object[]{"a", "b", "c", "f", "g", "h", "i", "j", "k", "d", ayfu.class, "e"});
            case 3:
                return new axmk();
            case 4:
                return new axmm();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axmk.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axmk axmk = new axmk();
        l = axmk;
        anxl.registerDefaultInstance(axmk.class, axmk);
    }
}
