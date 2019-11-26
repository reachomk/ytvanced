package defpackage;

/* renamed from: arry */
public final class arry extends anxl implements anzf {
    public static final arry p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public int e;
    public auvr f;
    public apxu g;
    public arml h;
    public arml i;
    public arml j;
    public apdx k;
    public apdx l;
    public apdx m;
    public aphj n;
    public anvu o;
    private byte q = (byte) 2;

    private arry() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.o = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0002\u0012\u000e\u0000\u0001\f\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006\u0004\u0003\u0007Љ\u0006\bЉ\b\tЛ\u000b\n\u000e\fЉ\f\rЉ\u0007\u0010Љ\t\u0011Љ\n\u0012Љ\u000b", new Object[]{"a", "b", "d", "f", "g", "e", "h", "j", "c", ayfu.class, "o", "n", "i", "k", "l", "m"});
            case 3:
                return new arry();
            case 4:
                return new arsb();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (arry.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arry arry = new arry();
        p = arry;
        anxl.registerDefaultInstance(arry.class, arry);
    }
}
