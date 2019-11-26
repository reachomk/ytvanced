package defpackage;

/* renamed from: atke */
public final class atke extends anxl implements anzf {
    public static final atke g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public String c;
    public int d;
    public String e;
    public String f;
    private byte h = (byte) 2;

    private atke() {
        String str = "";
        this.c = str;
        this.e = str;
        this.f = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\f\u0002\u0004\b\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", azmm.a, "e", "f"});
            case 3:
                return new atke();
            case 4:
                return new atkd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atke.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        atke atke = new atke();
        g = atke;
        anxl.registerDefaultInstance(atke.class, atke);
    }
}
