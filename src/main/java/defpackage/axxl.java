package defpackage;

/* renamed from: axxl */
public final class axxl extends anxl implements anzf {
    public static final axxl k;
    private static volatile anzq m;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    public arml e;
    public arwf f;
    public aphj g;
    public aphj h;
    public axxj i;
    public aodx j;
    private byte l = (byte) 2;

    private axxl() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0006\u0001Л\u0002Л\u0004\n\u0002\u0005Љ\u0003\u0006\t\u0004\u0007Љ\u0005\bЉ\u0006\t\t\b\fЉ\u0007", new Object[]{"a", "b", axxn.class, "c", axxp.class, "d", "e", "f", "g", "h", "j", "i"});
            case 3:
                return new axxl();
            case 4:
                return new axxk();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (axxl.class) {
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
        axxl axxl = new axxl();
        k = axxl;
        anxl.registerDefaultInstance(axxl.class, axxl);
    }
}
