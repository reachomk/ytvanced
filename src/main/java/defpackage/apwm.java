package defpackage;

/* renamed from: apwm */
public final class apwm extends anxl implements anzf {
    public static final apwm h;
    private static volatile anzq j;
    public int a;
    public apwa b;
    public apwk c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public anyd f;
    public anvu g;
    private byte i = (byte) 2;

    private apwm() {
        anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        this.g = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0002\u0001Љ\u0001\u0002Л\u0004\u000b\u0002\u0006\n\u0004\u0007\t\u0000\b\u001a", new Object[]{"a", "c", "d", apws.class, "e", "g", "b", "f"});
            case 3:
                return new apwm();
            case 4:
                return new apwl();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apwm.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apwm apwm = new apwm();
        h = apwm;
        anxl.registerDefaultInstance(apwm.class, apwm);
    }
}
