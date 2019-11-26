package defpackage;

/* renamed from: aqjm */
public final class aqjm extends anxl implements anzf {
    public static final aqjm o;
    public static final anxr p;
    private static volatile anzq r;
    public int a;
    public String b;
    public arml c;
    public aygk d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public apxu m;
    public String n;
    private byte q = (byte) 2;

    private aqjm() {
        String str = "";
        this.b = str;
        this.f = str;
        this.g = str;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = str;
        this.n = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0003\u0001Љ\u0001\u0002Љ\u0002\u0003\f\u0003\u0004\b\u0004\u0005\b\u0005\u0007\b\u0007\b\b\t\t\b\n\nЉ\f\u000b\b\u0000\f\b\u000b\r\b\b\u000e\b\r", new Object[]{"a", "c", "d", "e", aqkr.a(), "f", "g", "h", "j", "k", "m", "b", "l", "i", "n"});
            case 3:
                return new aqjm();
            case 4:
                return new aqjl();
            case 5:
                return o;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aqjm.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqjm aqjm = new aqjm();
        o = aqjm;
        anxl.registerDefaultInstance(aqjm.class, aqjm);
        aqta aqta = aqta.d;
        aqjm aqjm2 = o;
        p = anxl.newSingularGeneratedExtension(aqta, aqjm2, aqjm2, null, 139735787, aobm.MESSAGE, aqjm.class);
    }
}
