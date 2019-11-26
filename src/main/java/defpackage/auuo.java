package defpackage;

/* renamed from: auuo */
public final class auuo extends anxl implements anzf {
    public static final auuo k;
    private static volatile anzq m;
    public int a;
    public arhf b;
    public avtg c;
    public apez d;
    public awtm e;
    public avwg f;
    public arhk g;
    public awtq h;
    public aorz i;
    public apex j;
    private byte l = (byte) 2;

    private auuo() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0002喠\t\u0000\u0000\u0001\u0002\t\u000b麗䉳\t\u0001䗄Љ\u0002ﺕ䠈\t\u0005䬕\t\u0007䭝\t\u0006冡\t\b勽\t\t喠\t\n", new Object[]{"a", "j", "b", "c", "d", "f", "e", "g", "h", "i"});
            case 3:
                return new auuo();
            case 4:
                return new auun();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (auuo.class) {
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
        auuo auuo = new auuo();
        k = auuo;
        anxl.registerDefaultInstance(auuo.class, auuo);
    }
}
