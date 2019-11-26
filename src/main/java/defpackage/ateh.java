package defpackage;

/* renamed from: ateh */
public final class ateh extends anxl implements anzf {
    public static final ateh n;
    private static volatile anzq p;
    public int a;
    public ashy b;
    public String c;
    public boolean d;
    public boolean e;
    public awat f;
    public boolean g;
    public String h;
    public int i;
    public String j;
    public anvu k;
    public anxz l;
    public String m;
    private byte o = (byte) 2;

    private ateh() {
        String str = "";
        this.c = str;
        this.h = str;
        this.j = str;
        this.k = anvu.a;
        this.l = anxl.emptyIntList();
        this.m = str;
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
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0001\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\t\u0004\u0005\u0007\u0003\b\u0007\u0005\t\b\b\n\u0004\t\f\b\u000b\u000e\n\f\u000f\u0016\u0013\b\u0010", new Object[]{"a", "b", "c", "d", "f", "e", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new ateh();
            case 4:
                return new atek();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (ateh.class) {
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
        ateh ateh = new ateh();
        n = ateh;
        anxl.registerDefaultInstance(ateh.class, ateh);
    }
}
