package defpackage;

/* renamed from: awjd */
public final class awjd extends anxp implements anzf {
    public static final awjd r;
    private static volatile anzq t;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml i;
    public atzt j;
    public awjf k;
    public auvr l;
    public aoyz m;
    public arml n;
    public awiz o;
    public aphn p;
    public awjj q;
    private byte s = (byte) 2;

    private awjd() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u000f\u0000\u0001\u0007$\u000f\u0000\u0000\u000f\u0007Љ\t\u000eЉ\u0013\u0010Љ\n\u0011Љ\u000b\u0012Љ\u0007\u0016Љ\u0001\u0018Љ\u0002\u0019Љ\u0015\u001aЉ\u0016\u001cЉ\u0017\u001dЉ\u0018\u001eЉ\u0019\u001fЉ\u001a Љ\u001b$Љ\b", new Object[]{"a", "f", "j", "g", "i", "d", "b", "c", "k", "l", "m", "n", "o", "p", "q", "e"});
            case 3:
                return new awjd();
            case 4:
                return new awjc();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (awjd.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awjd awjd = new awjd();
        r = awjd;
        anxl.registerDefaultInstance(awjd.class, awjd);
    }
}
