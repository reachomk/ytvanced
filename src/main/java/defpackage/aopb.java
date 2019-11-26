package defpackage;

/* renamed from: aopb */
public final class aopb extends anxl implements anzf {
    public static final aopb r;
    private static volatile anzq s;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    private aopb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u000f\u0000\u0002\u0007-\u000f\u0000\u0000\u0000\u0007\u0007\u0007\u001d\u0007\u001d!\u0007!\"\u0007\"#\u0007#$\u0007$%\u000b%&\u000b&'\u0007'(\u0007()\u0007)*\u0007*+\u0007+,\u0007,-\u0007-", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"});
            case 3:
                return new aopb();
            case 4:
                return new aope();
            case 5:
                return r;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (aopb.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aopb aopb = new aopb();
        r = aopb;
        anxl.registerDefaultInstance(aopb.class, aopb);
    }
}
