package defpackage;

/* renamed from: arsg */
public final class arsg extends anxl implements anzf {
    public static final arsg p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public arml c;
    public apxu d;
    public apxu e;
    public apxu f;
    public auvr g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public auma l;
    public anvu m;
    public arml n;
    public anyd o;
    private byte q = (byte) 2;

    private arsg() {
        anxl.emptyProtobufList();
        this.m = anvu.a;
        this.o = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0002\u0014\u000e\u0000\u0001\f\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0004\u0007Љ\t\tЉ\u0006\nЉ\u000b\u000bЉ\f\f\n\u0010\u000eЉ\u0011\u000fЉ\n\u0010Љ\u0007\u0012Л\u0013\t\u000e\u0014Љ\u0005", new Object[]{"a", "b", "c", "d", "h", "f", "j", "k", "m", "n", "i", "g", "o", ayfu.class, "l", "e"});
            case 3:
                return new arsg();
            case 4:
                return new arsj();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (arsg.class) {
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
        arsg arsg = new arsg();
        p = arsg;
        anxl.registerDefaultInstance(arsg.class, arsg);
    }
}
