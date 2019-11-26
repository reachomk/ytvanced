package defpackage;

/* renamed from: axrp */
public final class axrp extends anxl implements anzf {
    public static final axrp h;
    private static volatile anzq i;
    public int a;
    public axrh b;
    public int c;
    public String d;
    public String e;
    public int f;
    public anyd g = anxl.emptyProtobufList();

    private axrp() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0000\u0002\f\u0001\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004\u0006\u001b", new Object[]{"a", "b", "c", axry.a, "d", "e", "f", axrx.a, "g", axrn.class});
            case 3:
                return new axrp();
            case 4:
                return new axro();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axrp.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        axrp axrp = new axrp();
        h = axrp;
        anxl.registerDefaultInstance(axrp.class, axrp);
    }
}
