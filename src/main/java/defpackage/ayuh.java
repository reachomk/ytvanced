package defpackage;

/* renamed from: ayuh */
public final class ayuh extends anxl implements anzf {
    public static final ayuh e;
    public static final anxr f;
    private static volatile anzq h;
    public int a;
    public ayuf b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private ayuh() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\t\u0000\u0002Л\u0003\u001b", new Object[]{"a", "b", "c", ayul.class, "d", ayuj.class});
            case 3:
                return new ayuh();
            case 4:
                return new ayuk();
            case 5:
                return e;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (ayuh.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        ayuh ayuh = new ayuh();
        e = ayuh;
        anxl.registerDefaultInstance(ayuh.class, ayuh);
        axai axai = axai.a;
        ayuh ayuh2 = e;
        f = anxl.newSingularGeneratedExtension(axai, ayuh2, ayuh2, null, 64128279, aobm.MESSAGE, ayuh.class);
    }
}
