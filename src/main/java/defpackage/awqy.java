package defpackage;

/* renamed from: awqy */
public final class awqy extends anxl implements anzf {
    public static final awqy j;
    private static volatile anzq l;
    public int a;
    public axak b;
    public arml c;
    public arml d;
    public arml e;
    public axak f;
    public arml g;
    public apxu h;
    public axak i;
    private byte k = (byte) 2;

    private awqy() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0007\bЉ\b\nЉ\t\u000fЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new awqy();
            case 4:
                return new awrb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awqy.class) {
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
        awqy awqy = new awqy();
        j = awqy;
        anxl.registerDefaultInstance(awqy.class, awqy);
    }
}
