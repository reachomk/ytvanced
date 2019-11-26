package defpackage;

/* renamed from: ausu */
public final class ausu extends anxl implements anzf {
    public static final ausu l;
    private static volatile anzq m;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public auta e;
    public auta f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public anyd i = anxl.emptyProtobufList();
    public anyd j = anxl.emptyProtobufList();
    public anyd k = anxl.emptyProtobufList();

    private ausu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\f\u0000\u0004\t\u0001\b\t\u0005\u000b\u001b\f\u001b\r\u001a\u000e\u001a\u000f\u001b", new Object[]{"a", "b", autc.class, "c", autc.class, "d", ausx.a, "e", "f", "g", auth.class, "h", aute.class, "i", "j", "k", ausw.class});
            case 3:
                return new ausu();
            case 4:
                return new aust();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (ausu.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ausu ausu = new ausu();
        l = ausu;
        anxl.registerDefaultInstance(ausu.class, ausu);
    }
}
