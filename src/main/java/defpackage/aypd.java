package defpackage;

/* renamed from: aypd */
public final class aypd extends anxl implements anzf {
    public static final aypd t;
    private static volatile anzq v;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public apdh l;
    public apdh m;
    public apxu n;
    public apxu o;
    public apxu p;
    public axak q;
    public apdh r;
    public axak s;
    private byte u = (byte) 2;

    private aypd() {
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
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u0003\u001f\u0012\u0000\u0000\u0012\u0003Љ\b\u0004Љ\n\u0005Љ\u000b\u0006Љ\f\u0007Љ\r\bЉ\u0014\tЉ\u0010\u000eЉ\u0012\u000fЉ\u0005\u0010Љ\u0006\u0013Љ\u0015\u0014Љ\u0007\u0018Љ\u0018\u0019Љ\t\u001aЉ\u0019\u001cЉ\u001b\u001eЉ\u001a\u001fЉ\u0013", new Object[]{"a", "e", "g", "h", "i", "j", "n", "k", "l", "b", "c", "o", "d", "p", "f", "q", "s", "r", "m"});
            case 3:
                return new aypd();
            case 4:
                return new aypg();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (aypd.class) {
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
        aypd aypd = new aypd();
        t = aypd;
        anxl.registerDefaultInstance(aypd.class, aypd);
    }
}
