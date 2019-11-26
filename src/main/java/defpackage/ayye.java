package defpackage;

/* renamed from: ayye */
public final class ayye extends anxp implements anzf {
    public static final ayye s;
    private static volatile anzq u;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public apdx i;
    public apdx j;
    public apdx k;
    public ayri l;
    public ayyg m;
    public anyd n;
    public auvr o;
    public ayyi p;
    public ayym q;
    public anvu r;
    private byte t = (byte) 2;

    private ayye() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.n = anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.r = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.t);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.t = b;
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0010\u0000\u0001\u0002\u0015\u0010\u0000\u0001\r\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\u000bЉ\u000b\fЛ\u000eЉ\r\u0011\n\u0012\u0012Љ\n\u0014\t\u000e\u0015\t\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "m", "n", ayfu.class, "o", "r", "l", "p", "q"});
            case 3:
                return new ayye();
            case 4:
                return new ayyd();
            case 5:
                return s;
            case 6:
                Object obj3 = u;
                if (obj3 == null) {
                    synchronized (ayye.class) {
                        obj3 = u;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            u = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayye ayye = new ayye();
        s = ayye;
        anxl.registerDefaultInstance(ayye.class, ayye);
    }
}
