package defpackage;

/* renamed from: auzi */
public final class auzi extends anxl implements anzf {
    public static final auzi f;
    private static volatile anzq h;
    public int a;
    public axak b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    private byte g = (byte) 2;

    private auzi() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004\u0004\u0002", new Object[]{"a", "b", "c", "d", axak.class, "e"});
            case 3:
                return new auzi();
            case 4:
                return new auzl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (auzi.class) {
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
        auzi auzi = new auzi();
        f = auzi;
        anxl.registerDefaultInstance(auzi.class, auzi);
    }
}
