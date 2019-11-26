package defpackage;

/* renamed from: awvz */
public final class awvz extends anxl implements anzf {
    public static final awvz j;
    private static volatile anzq l;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public apxu e;
    public anyd f = anxl.emptyProtobufList();
    public anvu g = anvu.a;
    public awvx h;
    public auvr i;
    private byte k = (byte) 2;

    private awvz() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Л\u0007\n\u0005\bЉ\u0006\nЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", awvv.class, "g", "h", "i"});
            case 3:
                return new awvz();
            case 4:
                return new awvy();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awvz.class) {
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
        awvz awvz = new awvz();
        j = awvz;
        anxl.registerDefaultInstance(awvz.class, awvz);
    }
}
