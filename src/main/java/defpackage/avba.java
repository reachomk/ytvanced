package defpackage;

/* renamed from: avba */
public final class avba extends anxl implements anzf {
    public static final avba j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arwf d;
    public boolean e;
    public apxu f;
    public apxu g;
    public avbc h;
    public anyd i = anxl.emptyProtobufList();
    private byte k = (byte) 2;

    private avba() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\u0007\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\t\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", avca.class});
            case 3:
                return new avba();
            case 4:
                return new avaz();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avba.class) {
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
        avba avba = new avba();
        j = avba;
        anxl.registerDefaultInstance(avba.class, avba);
    }
}
