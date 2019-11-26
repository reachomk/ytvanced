package defpackage;

/* renamed from: arss */
public final class arss extends anxp implements anzf {
    public static final arss C;
    private static volatile anzq E;
    public ayym A;
    public anvu B;
    private byte D = (byte) 2;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public armh f;
    public aygk g;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public apxu m;
    public apxu n;
    public ayri o;
    public anyd p = anxl.emptyProtobufList();
    public apdx q;
    public apdx r;
    public apdx s;
    public apxu t;
    public arsu u;
    public boolean v;
    public anyd w;
    public auvr x;
    public arqc y;
    public auma z;

    private arss() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.w = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.B = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.D);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.D = b;
                return null;
            case 2:
                return anxl.newMessageInfo(C, "\u0001\u001a\u0000\u0001\u0002&\u001a\u0000\u0002\u0015\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0007\u0006Љ\b\u0007Љ\n\bЉ\u000b\nЉ\u0004\fЉ\r\rЛ\u000eЉ\u0006\u0011\n\u001c\u0014Љ\u0012\u0016Љ\t\u0017\u0007\u0014\u0018Љ\u0016\u0019Љ\u000f\u001aЉ\u0017\u001cЛ\u001dЉ\u000e\u001eЉ\u0010\u001fЉ\u0011\"\t\u0019$\t\u0005%\t\u001a&Љ\f", new Object[]{"a", "b", "c", "d", "i", "j", "l", "m", "e", "o", "p", apdh.class, "g", "B", "u", "k", "v", "x", "r", "y", "w", ayfu.class, "q", "s", "t", "z", "f", "A", "n"});
            case 3:
                return new arss();
            case 4:
                return new arsv();
            case 5:
                return C;
            case 6:
                Object obj3 = E;
                if (obj3 == null) {
                    synchronized (arss.class) {
                        obj3 = E;
                        if (obj3 == null) {
                            obj3 = new anxn(C);
                            E = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arss arss = new arss();
        C = arss;
        anxl.registerDefaultInstance(arss.class, arss);
    }
}
