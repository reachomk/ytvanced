package defpackage;

/* renamed from: arqb */
public final class arqb extends anxl implements anzf {
    public static final arqb h;
    private static volatile anzq j;
    public int a;
    public axak b;
    public axak c;
    public axak d;
    public axak e;
    public axak f;
    public arml g;
    private byte i = (byte) 2;

    private arqb() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0003\u000b\u0006\u0000\u0000\u0006\u0003Љ\u0000\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003\nЉ\u0006\u000bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new arqb();
            case 4:
                return new arqa();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (arqb.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arqb arqb = new arqb();
        h = arqb;
        anxl.registerDefaultInstance(arqb.class, arqb);
    }
}
