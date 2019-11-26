package defpackage;

/* renamed from: atuf */
public final class atuf extends anxp implements anzf {
    public static final atuf j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public aphj d;
    public aphj e;
    public arml f;
    public apxu g;
    public atuh i;
    private byte k = (byte) 2;

    private atuf() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0007\u0001Љ\u0001\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0005\nЉ\u0004\u000bЉ\u000e\u000fЉ\u0010", new Object[]{"a", "b", "c", "d", "f", "e", "g", "i"});
            case 3:
                return new atuf();
            case 4:
                return new atue();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atuf.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atuf atuf = new atuf();
        j = atuf;
        anxl.registerDefaultInstance(atuf.class, atuf);
    }
}
