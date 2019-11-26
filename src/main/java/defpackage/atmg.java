package defpackage;

/* renamed from: atmg */
public final class atmg extends anxl implements anzf {
    public static final atmg g;
    private static volatile anzq i;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public String d = "";
    public axak e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private atmg() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0002Л\u0004\n\u0005\u0005\b\u0001\u0006Љ\u0002", new Object[]{"a", "b", "c", axak.class, "f", "d", "e"});
            case 3:
                return new atmg();
            case 4:
                return new atmf();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atmg.class) {
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

    static {
        atmg atmg = new atmg();
        g = atmg;
        anxl.registerDefaultInstance(atmg.class, atmg);
    }
}
