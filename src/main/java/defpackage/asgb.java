package defpackage;

/* renamed from: asgb */
public final class asgb extends anxl implements anzf {
    public static final asgb h;
    private static volatile anzq j;
    public int a;
    public int b = 0;
    public Object c;
    public ashy d;
    public String e;
    public String f;
    public String g;
    private byte i = (byte) 2;

    private asgb() {
        String str = "";
        this.e = str;
        this.f = str;
        this.g = str;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0006<\u0000\u0007<\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", asfj.class, asfl.class});
            case 3:
                return new asgb();
            case 4:
                return new asga();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (asgb.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asgb asgb = new asgb();
        h = asgb;
        anxl.registerDefaultInstance(asgb.class, asgb);
    }
}
