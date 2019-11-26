package defpackage;

/* renamed from: atgr */
public final class atgr extends anxl implements anzf {
    public static final atgr m;
    private static volatile anzq o;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    public int f;
    public atgj g;
    public atgl h;
    public ateh i;
    public arkl j;
    public atgy k;
    public String l;
    private byte n = (byte) 2;

    private atgr() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\u0002\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\f\u0004\b\b\u0003\u000b\t\u0005\fЉ\u0007\r\t\b\u0010\t\n\u0011\b\u000b\u0014\t\u0006", new Object[]{"a", "b", "c", "d", "f", atgt.a, "e", "g", "i", "j", "k", "l", "h"});
            case 3:
                return new atgr();
            case 4:
                return new atgu();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (atgr.class) {
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
        atgr atgr = new atgr();
        m = atgr;
        anxl.registerDefaultInstance(atgr.class, atgr);
    }
}
