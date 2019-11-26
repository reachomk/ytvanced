package defpackage;

/* renamed from: ayqx */
public final class ayqx extends anxl implements anzf {
    public static final ayqx t;
    private static volatile anzq v;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    public apxu q;
    public ayqn r;
    public auvr s;
    private byte u = (byte) 2;

    private ayqx() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.u = b;
                return null;
            case 2:
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u0002\u001d\u0012\u0000\u0000\u0012\u0002Љ\u0004\u0003Љ\u0007\u0004Љ\b\u0005Љ\t\u0006Љ\n\u0007Љ\u000b\bЉ\f\tЉ\u000e\fЉ\u001a\rЉ\u001b\u000eЉ\r\u0014Љ\u0005\u0016Љ\u000f\u0017Љ\u0010\u0018Љ\u0011\u0019Љ\u0012\u001aЉ\u0015\u001dЉ\u0014", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "k", "r", "s", "j", "c", "l", "m", "n", "o", "q", "p"});
            case 3:
                return new ayqx();
            case 4:
                return new ayqw();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (ayqx.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(t);
                            v = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayqx ayqx = new ayqx();
        t = ayqx;
        anxl.registerDefaultInstance(ayqx.class, ayqx);
    }
}
