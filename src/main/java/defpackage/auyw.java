package defpackage;

/* renamed from: auyw */
public final class auyw extends anxl implements anzf {
    private static volatile anzq A;
    public static final auyw y;
    public int a;
    public arml b;
    public arml c;
    public auyy d;
    public auyy e;
    public auza f;
    public auys g;
    public axak h;
    public axak i;
    public auyu j;
    public axak k;
    public axak l;
    public axak m;
    public axak n;
    public aygk o;
    public arml p;
    public arml q;
    public arml r;
    public arwf s;
    public boolean t;
    public avdk u;
    public arml v;
    public boolean w;
    public axak x;
    private byte z = (byte) 2;

    private auyw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.z);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.z = b;
                return null;
            case 2:
                return anxl.newMessageInfo(y, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0014\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\b\u0006Љ\u0005\u0007Љ\t\bЉ\n\tЉ\r\nЉ\u0006\u000bЉ\u0007\fЉ\f\rЉ\u000e\u000eЉ\u000f\u0010Љ\u000b\u0011Љ\u0001\u0012Љ\u0010\u0013\t\u0011\u0015\u0007\u0013\u0016Љ\u0014\u0017Љ\u0015\u0019\u0007\u0017\u001aЉ\u0018", new Object[]{"a", "b", "d", "e", "f", "j", "g", "k", "l", "o", "h", "i", "n", "p", "q", "m", "c", "r", "s", "t", "u", "v", "w", "x"});
            case 3:
                return new auyw();
            case 4:
                return new auyv();
            case 5:
                return y;
            case 6:
                Object obj3 = A;
                if (obj3 == null) {
                    synchronized (auyw.class) {
                        obj3 = A;
                        if (obj3 == null) {
                            obj3 = new anxn(y);
                            A = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auyw auyw = new auyw();
        y = auyw;
        anxl.registerDefaultInstance(auyw.class, auyw);
    }
}
