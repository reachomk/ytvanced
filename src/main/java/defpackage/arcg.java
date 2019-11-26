package defpackage;

/* renamed from: arcg */
public final class arcg extends anxl implements anzf {
    public static final arcg b;
    public static final anxr c;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private arcg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", arce.class});
            case 3:
                return new arcg();
            case 4:
                return new arcj();
            case 5:
                return b;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (arcg.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arcg arcg = new arcg();
        b = arcg;
        anxl.registerDefaultInstance(arcg.class, arcg);
        arnm arnm = arnm.a;
        arcg arcg2 = b;
        c = anxl.newSingularGeneratedExtension(arnm, arcg2, arcg2, null, 2, aobm.MESSAGE, arcg.class);
    }
}
