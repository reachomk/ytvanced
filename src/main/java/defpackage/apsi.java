package defpackage;

/* renamed from: apsi */
public final class apsi extends anxl implements anzf {
    public static final apsi m;
    private static volatile anzq o;
    public int a;
    public String b;
    public String c;
    public aygk d;
    public anyd e;
    public String f;
    public anvu g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    private byte n = (byte) 2;

    private apsi() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = anxl.emptyProtobufList();
        this.f = str;
        this.g = anvu.a;
        this.h = str;
        this.i = str;
        this.j = str;
        this.k = str;
        this.l = str;
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0001\u0001\b\u0000\u0003\b\u0001\u0004Љ\u0002\u0005\u001b\u0006\b\u0003\u0007\n\u0004\b\b\u0005\t\b\u0006\n\b\u0007\u000b\b\b\f\b\t", new Object[]{"a", "b", "c", "d", "e", apru.class, "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new apsi();
            case 4:
                return new apsl();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (apsi.class) {
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
        apsi apsi = new apsi();
        m = apsi;
        anxl.registerDefaultInstance(apsi.class, apsi);
    }
}
