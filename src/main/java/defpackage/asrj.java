package defpackage;

/* renamed from: asrj */
public final class asrj extends anxl implements anzf {
    public static final asrj i;
    private static volatile anzq k;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public String h;
    private byte j = (byte) 2;

    private asrj() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0007\u0004\u0006\b\u0005\u0007\b\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new asrj();
            case 4:
                return new asrm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (asrj.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asrj asrj = new asrj();
        i = asrj;
        anxl.registerDefaultInstance(asrj.class, asrj);
    }
}
