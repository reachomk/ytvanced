package defpackage;

/* renamed from: awly */
public final class awly extends anxl implements anzf {
    public static final awly j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    public anyd e = anxl.emptyProtobufList();
    public arml f;
    public arml g;
    public awlu h;
    public long i;
    private byte k = (byte) 2;

    private awly() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0002\u0005\u0001Љ\u0000\u0002Л\u0004\u001b\u0005\n\u0002\u0006Љ\u0003\u0007Љ\u0004\tЉ\u0005\n\u0002\u0006", new Object[]{"a", "b", "c", awlw.class, "e", aule.class, "d", "f", "g", "h", "i"});
            case 3:
                return new awly();
            case 4:
                return new awmb();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (awly.class) {
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
        awly awly = new awly();
        j = awly;
        anxl.registerDefaultInstance(awly.class, awly);
    }
}
