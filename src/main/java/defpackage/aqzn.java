package defpackage;

/* renamed from: aqzn */
public final class aqzn extends anxl implements anzf {
    public static final aqzn j;
    private static volatile anzq l;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public auvr e;
    public arml f;
    public arml g;
    public apxu h;
    public arup i;
    private byte k = (byte) 2;

    private aqzn() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\b\u0012\b\u0000\u0000\b\bЉ\f\tЉ\r\nЉ\u000e\u000bЉ\u0010\u000fЉ\u0007\u0010Љ\u000f\u0011Љ\b\u0012Љ\u0002", new Object[]{"a", "e", "f", "g", "i", "c", "h", "d", "b"});
            case 3:
                return new aqzn();
            case 4:
                return new aqzm();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqzn.class) {
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
        aqzn aqzn = new aqzn();
        j = aqzn;
        anxl.registerDefaultInstance(aqzn.class, aqzn);
    }
}
