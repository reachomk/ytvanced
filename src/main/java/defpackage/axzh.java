package defpackage;

/* renamed from: axzh */
public final class axzh extends anxl implements anzf {
    public static final axzh h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    public axak d;
    public apxu e;
    public boolean f;
    public aojz g;
    private byte i = (byte) 2;

    private axzh() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0004Љ\u0002\u0005\u0007\u0003\u0006Љ\u0004", new Object[]{"a", "b", axzl.class, "c", "d", "e", "f", "g"});
            case 3:
                return new axzh();
            case 4:
                return new axzg();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axzh.class) {
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
        axzh axzh = new axzh();
        h = axzh;
        anxl.registerDefaultInstance(axzh.class, axzh);
    }
}
