package defpackage;

/* renamed from: arzh */
public final class arzh extends anxl implements anzf {
    public static final arzh h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public anvu f = anvu.a;
    public arzg g;
    private byte i = (byte) 2;

    private arzh() {
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
                return anxl.newMessageInfo(h, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001Љ\u0000\u0002\f\u0001\u0004Л\u0005Љ\u0004", new Object[]{"a", "b", "c", arzl.a, "d", aofq.class, "e"});
            case 3:
                return new arzh();
            case 4:
                return new arzi();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arzh.class) {
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
        arzh arzh = new arzh();
        h = arzh;
        anxl.registerDefaultInstance(arzh.class, arzh);
    }
}
