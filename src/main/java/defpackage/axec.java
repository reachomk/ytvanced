package defpackage;

/* renamed from: axec */
public final class axec extends anxl implements anzf {
    public static final axec o;
    private static volatile anzq q;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 0;
    public Object e;
    public int f;
    public arml g;
    public arml h;
    public anvu i = anvu.a;
    public aodx j;
    public boolean k;
    public arwf l;
    public axea m;
    public boolean n;
    private byte p = (byte) 2;

    private axec() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0002\u0001\u0001\u000e\r\u0000\u0000\u0006\u0001м\u0000\u0002;\u0000\u0003\f\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006м\u0001\b\n\b\t\t\t\n\u0007\n\u000bм\u0001\f\t\u000b\rЉ\f\u000e\u0007\r", new Object[]{"c", "b", "e", "d", "a", aygk.class, "f", apnd.a, "g", "h", apxu.class, "i", "j", "k", axee.class, "l", "m", "n"});
            case 3:
                return new axec();
            case 4:
                return new axef();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (axec.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axec axec = new axec();
        o = axec;
        anxl.registerDefaultInstance(axec.class, axec);
    }
}
