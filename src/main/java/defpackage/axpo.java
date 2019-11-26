package defpackage;

/* renamed from: axpo */
public final class axpo extends anxp implements anzf {
    public static final axpo q;
    private static volatile anzq s;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apdx e;
    public apdx f;
    public arml g;
    public axpm i;
    public arml j;
    public arml k;
    public azcm l;
    public apxu m;
    public axpg n;
    public axpg o;
    public axak p;
    private byte r = (byte) 2;

    private axpo() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.r = b;
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000e\u0000\u0001\u0003\u0018\u000e\u0000\u0000\u000e\u0003Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\bЉ\b\tЉ\n\nЉ\u000b\fЉ\u0006\rЉ\u0005\u000fЉ\t\u0012Љ\f\u0014Љ\r\u0015Љ\u000e\u0016Љ\u000f\u0018Љ\u0007", new Object[]{"a", "b", "c", "d", "i", "k", "l", "f", "e", "j", "m", "n", "o", "p", "g"});
            case 3:
                return new axpo();
            case 4:
                return new axpn();
            case 5:
                return q;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (axpo.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axpo axpo = new axpo();
        q = axpo;
        anxl.registerDefaultInstance(axpo.class, axpo);
    }
}
