package defpackage;

/* renamed from: ayjh */
public final class ayjh extends anxl implements anzf {
    public static final ayjh d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axak c;
    private byte e = (byte) 2;

    private ayjh() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002Љ\u0000", new Object[]{"a", "b", axak.class, "c"});
            case 3:
                return new ayjh();
            case 4:
                return new ayjk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayjh.class) {
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
        ayjh ayjh = new ayjh();
        d = ayjh;
        anxl.registerDefaultInstance(ayjh.class, ayjh);
    }
}
