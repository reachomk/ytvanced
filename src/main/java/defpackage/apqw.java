package defpackage;

/* renamed from: apqw */
public final class apqw extends anxl implements anzf {
    public static final apqw m;
    private static volatile anzq n;
    public int a;
    public String b;
    public anyd c = anxl.emptyProtobufList();
    public String d;
    public String e;
    public String f;
    public String g;
    public anvu h;
    public String i;
    public String j;
    public atun k;
    public String l;

    private apqw() {
        String str = "";
        this.b = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = str;
        this.h = anvu.a;
        this.i = str;
        this.j = str;
        this.l = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001\b\u0000\u0003\b\u0001\u0005\b\u0002\u0006\b\u0003\u0007\b\u0004\b\n\u0005\t\b\u0006\n\b\u0007\f\t\b\r\b\t\u000f\u001b", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "c", apre.class});
            case 3:
                return new apqw();
            case 4:
                return new apqz();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (apqw.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apqw apqw = new apqw();
        m = apqw;
        anxl.registerDefaultInstance(apqw.class, apqw);
    }
}
