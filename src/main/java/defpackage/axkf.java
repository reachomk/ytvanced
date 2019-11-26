package defpackage;

/* renamed from: axkf */
public final class axkf extends anxp implements anzf {
    public static final axkf u;
    private static volatile anzq w;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public arml e;
    public arml f;
    public axjl g;
    public apxu i;
    public apxu j;
    public axkb k;
    public axak l;
    public axwa m;
    public axkh n;
    public arjm o;
    public axjz p;
    public axkj q;
    public apxu r;
    public axkd s;
    public arqc t;
    private byte v = (byte) 2;

    private axkf() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.v);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.v = b;
                return null;
            case 2:
                return anxl.newMessageInfo(u, "\u0001\u0012\u0000\u0001\u0001'\u0012\u0000\u0000\u0012\u0001Љ\u0000\u0003Љ\f\u0004Љ\r\u0005Љ\u0015\u0006Љ\u0010\tЉ\u0005\fЉ\u0001\u000eЉ\u0004\u0011Љ\u0017\u0013Љ\u0014\u0015Љ\u0013\u0018Љ\u001c\u0019Љ\u001d\u001dЉ\u0011\u001eЉ\u000b\u001fЉ\u000e$Љ\u0003'Љ\u000f", new Object[]{"a", "b", "i", "j", "q", "m", "f", "c", "e", "r", "p", "o", "s", "t", "n", "g", "k", "d", "l"});
            case 3:
                return new axkf();
            case 4:
                return new axki();
            case 5:
                return u;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (axkf.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(u);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axkf axkf = new axkf();
        u = axkf;
        anxl.registerDefaultInstance(axkf.class, axkf);
    }
}
