package defpackage;

/* renamed from: arbs */
public final class arbs extends anxp implements anzf {
    public static final arbs g;
    private static volatile anzq j;
    public int a;
    public arbm b;
    public anyd c = anxl.emptyProtobufList();
    public arbw d;
    public arbu e;
    public anvu f;
    private byte i = (byte) 2;

    private arbs() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.f = anvu.a;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0002Л\u0003Љ\u0002\u0005\n\u0004\t\t\u0001", new Object[]{"a", "b", "c", arbg.class, "e", "f", "d"});
            case 3:
                return new arbs();
            case 4:
                return new arbr();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arbs.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return g.getParserForType();
    }

    static {
        arbs arbs = new arbs();
        g = arbs;
        anxl.registerDefaultInstance(arbs.class, arbs);
    }
}
