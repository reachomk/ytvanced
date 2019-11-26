package defpackage;

/* renamed from: axqu */
public final class axqu extends anxl implements anzf {
    public static final axqu m;
    private static volatile anzq o;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public String f = "";
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public axqw i;
    public axqy j;
    public boolean k;
    public boolean l;
    private byte n = (byte) 2;

    private axqu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001䞂\u000b\u0000\u0002\u0001\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005\b\u0004\b\u001b\tЛ\n\u0007\t\f\u0007\u000b㳬\t\u0006䞂\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", axrc.class, "h", atwo.class, "k", "l", "i", "j"});
            case 3:
                return new axqu();
            case 4:
                return new axqx();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (axqu.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axqu axqu = new axqu();
        m = axqu;
        anxl.registerDefaultInstance(axqu.class, axqu);
    }
}
