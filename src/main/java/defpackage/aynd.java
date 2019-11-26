package defpackage;

/* renamed from: aynd */
public final class aynd extends anxl implements anzf {
    public static final aynd g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public aphj d;
    public aphj e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private aynd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Љ\u0002\u0007\n\u0005", new Object[]{"a", "b", "c", arml.class, "d", "e", "f"});
            case 3:
                return new aynd();
            case 4:
                return new ayng();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aynd.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return g.getParserForType();
    }

    static {
        aynd aynd = new aynd();
        g = aynd;
        anxl.registerDefaultInstance(aynd.class, aynd);
    }
}
