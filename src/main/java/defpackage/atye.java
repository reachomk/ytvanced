package defpackage;

/* renamed from: atye */
public final class atye extends anxl implements anzf {
    public static final atye j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public axak d;
    public axak e;
    public arml f;
    public apxu g;
    public apxu h;
    public apxu i;
    private byte k = (byte) 2;

    private atye() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\t\b\u0000\u0000\b\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\tЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new atye();
            case 4:
                return new atyh();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (atye.class) {
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
        atye atye = new atye();
        j = atye;
        anxl.registerDefaultInstance(atye.class, atye);
    }
}
