package defpackage;

/* renamed from: atyi */
public final class atyi extends anxl implements anzf {
    public static final atyi l;
    private static volatile anzq m;
    public int a;
    public int b;
    public int c;
    public String d;
    public String e;
    public String f;
    public int g;
    public String h;
    public boolean i;
    public atyk j;
    public atyq k;

    private atyi() {
        String str = "";
        this.d = str;
        this.e = str;
        this.f = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\t\u0000\u0002\u00016\t\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0003\b\b\n\u000f\u0004\u0014\u0013\b\u0016\u0016\t% \u0007\u001d6\t1", new Object[]{"a", "b", "c", atyw.a(), "d", "e", "f", "g", "h", "j", "i", "k"});
            case 3:
                return new atyi();
            case 4:
                return new atyl();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (atyi.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atyi atyi = new atyi();
        l = atyi;
        anxl.registerDefaultInstance(atyi.class, atyi);
    }
}
