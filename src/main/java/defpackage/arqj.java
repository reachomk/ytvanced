package defpackage;

/* renamed from: arqj */
public final class arqj extends anxl implements anzf {
    public static final arqj n;
    private static volatile anzq p;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public apxu i;
    public ayri j;
    public auvr k;
    public arqc l;
    public arql m;
    private byte o = (byte) 2;

    private arqj() {
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
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0003\u0015\f\u0000\u0000\f\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007Љ\u0006\bЉ\u0007\tЉ\b\nЉ\t\u000bЉ\n\fЉ\u000b\u0010Љ\f\u0011Љ\r\u0015Љ\u000e", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new arqj();
            case 4:
                return new arqm();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (arqj.class) {
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
        arqj arqj = new arqj();
        n = arqj;
        anxl.registerDefaultInstance(arqj.class, arqj);
    }
}
