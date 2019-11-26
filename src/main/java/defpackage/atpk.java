package defpackage;

/* renamed from: atpk */
public final class atpk extends anxl implements anzf {
    public static final atpk j;
    private static volatile anzq l;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    public String f;
    public anvu g;
    public anvu h;
    public ayin i;
    private byte k = (byte) 2;

    private atpk() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.f = str;
        this.g = anvu.a;
        this.h = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0006\n\u0005\u0007\n\u0006\b\b\u0003\t\b\u0004\r\t\b", new Object[]{"a", "b", "c", "d", "g", "h", "e", "f", "i"});
            case 3:
                return new atpk();
            case 4:
                return new atpj();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atpk.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atpk atpk = new atpk();
        j = atpk;
        anxl.registerDefaultInstance(atpk.class, atpk);
    }
}
