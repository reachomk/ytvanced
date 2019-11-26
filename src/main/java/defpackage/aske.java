package defpackage;

/* renamed from: aske */
public final class aske extends anxl implements anzf {
    public static final aske g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public String c = "";
    public anyd d = anxl.emptyProtobufList();
    public askm e;
    public askg f;
    private byte h = (byte) 2;

    private aske() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u001a\u0004\t\u0002\u0005\t\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aske();
            case 4:
                return new askh();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aske.class) {
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
        aske aske = new aske();
        g = aske;
        anxl.registerDefaultInstance(aske.class, aske);
    }
}
