package defpackage;

/* renamed from: atqa */
public final class atqa extends anxl implements anzf {
    public static final atqa n;
    private static volatile anzq p;
    public int a;
    public ashy b;
    public String c;
    public anvu d;
    public String e;
    public String f;
    public anvu g;
    public String h;
    public asgd i;
    public anvu j;
    public anvu k;
    public String l;
    public apvq m;
    private byte o = (byte) 2;

    private atqa() {
        String str = "";
        this.c = str;
        this.d = anvu.a;
        this.e = str;
        this.f = str;
        this.g = anvu.a;
        this.h = str;
        this.j = anvu.a;
        this.k = anvu.a;
        this.l = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0003\u0004\b\u0004\u0005Љ\u0007\u0006\n\b\u0007\n\t\b\n\u0002\t\b\n\n\n\u0005\u000b\b\u0006\f\t\u000b", new Object[]{"a", "b", "c", "e", "f", "i", "j", "k", "d", "l", "g", "h", "m"});
            case 3:
                return new atqa();
            case 4:
                return new atpz();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (atqa.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atqa atqa = new atqa();
        n = atqa;
        anxl.registerDefaultInstance(atqa.class, atqa);
    }
}
