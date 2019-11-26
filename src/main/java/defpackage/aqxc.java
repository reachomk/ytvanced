package defpackage;

/* renamed from: aqxc */
public final class aqxc extends anxl implements anzf {
    public static final aqxc d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public apxu b;
    public anyd c;
    private byte f = (byte) 2;

    private aqxc() {
        anxl.emptyProtobufList();
        this.c = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001Љ\u0000\u0003Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new aqxc();
            case 4:
                return new aqxb();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqxc.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqxc aqxc = new aqxc();
        d = aqxc;
        anxl.registerDefaultInstance(aqxc.class, aqxc);
        azsr azsr = azsr.a;
        aqxc aqxc2 = d;
        e = anxl.newSingularGeneratedExtension(azsr, aqxc2, aqxc2, null, 167732284, aobm.MESSAGE, aqxc.class);
    }
}
