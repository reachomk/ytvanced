package defpackage;

/* renamed from: ayms */
public final class ayms extends anxl implements anzf {
    public static final ayms k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public arml e;
    public aphj f;
    public arml g;
    public arml h;
    public aphj i;
    public aphj j;
    private byte l = (byte) 2;

    private ayms() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\t\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005\bЉ\u0006\tЉ\u0007", new Object[]{"a", "b", "c", aygk.class, "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new ayms();
            case 4:
                return new aymu();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (ayms.class) {
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
        ayms ayms = new ayms();
        k = ayms;
        anxl.registerDefaultInstance(ayms.class, ayms);
    }
}
