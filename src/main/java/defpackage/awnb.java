package defpackage;

/* renamed from: awnb */
public final class awnb extends anxl implements anzf {
    public static final awnb k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public aygk c;
    public apxu d;
    public int e;
    public int f;
    public axak g;
    public arml h;
    public anvu i = anvu.a;
    public anyd j = anxl.emptyProtobufList();
    private byte l = (byte) 2;

    private awnb() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\u000b\u0003\u0005\u000b\u0004\u0006Љ\u0005\u0007Љ\u0006\t\n\b\nЛ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", apxu.class});
            case 3:
                return new awnb();
            case 4:
                return new awnd();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (awnb.class) {
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
        awnb awnb = new awnb();
        k = awnb;
        anxl.registerDefaultInstance(awnb.class, awnb);
    }
}
