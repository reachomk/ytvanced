package defpackage;

/* renamed from: awne */
public final class awne extends anxl implements anzf {
    public static final awne e;
    private static volatile anzq g;
    public int a;
    public axak b;
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    private byte f = (byte) 2;

    private awne() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0004\n\u0001", new Object[]{"a", "b", "c", axak.class, "d"});
            case 3:
                return new awne();
            case 4:
                return new awng();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awne.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awne awne = new awne();
        e = awne;
        anxl.registerDefaultInstance(awne.class, awne);
    }
}
