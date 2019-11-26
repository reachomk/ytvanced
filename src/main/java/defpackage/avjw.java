package defpackage;

/* renamed from: avjw */
public final class avjw extends anxl implements anzf {
    public static final avjw n;
    private static volatile anzq p;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public apdx l;
    public ayri m;
    private byte o = (byte) 2;

    private avjw() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0004\u0012\f\u0000\u0000\f\u0004Љ\u0004\u0005Љ\u0006\u0006Љ\u0007\u0007Љ\b\bЉ\n\tЉ\u000b\nЉ\u0001\u000bЉ\u0003\fЉ\u0005\u000eЉ\r\u0011Љ\t\u0012Љ\f", new Object[]{"a", "d", "f", "g", "h", "j", "k", "b", "c", "e", "m", "i", "l"});
            case 3:
                return new avjw();
            case 4:
                return new avjv();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (avjw.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avjw avjw = new avjw();
        n = avjw;
        anxl.registerDefaultInstance(avjw.class, avjw);
    }
}
