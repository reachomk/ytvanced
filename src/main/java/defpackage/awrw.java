package defpackage;

/* renamed from: awrw */
public final class awrw extends anxl implements anzf {
    public static final awrw k;
    private static volatile anzq m;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public axak h;
    public apxu i;
    public axak j;
    private byte l = (byte) 2;

    private awrw() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0002\u0014\t\u0000\u0000\t\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0007\bЉ\b\tЉ\t\u000bЉ\n\u0014Љ\u0006", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "j", "f"});
            case 3:
                return new awrw();
            case 4:
                return new awrz();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (awrw.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awrw awrw = new awrw();
        k = awrw;
        anxl.registerDefaultInstance(awrw.class, awrw);
    }
}
