package defpackage;

/* renamed from: arwp */
public final class arwp extends anxl implements anzf {
    public static final arwp i;
    private static volatile anzq k;
    public int a;
    public aygk b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public apdx e;
    public apxu f;
    public anvu g = anvu.a;
    public anyd h = anxl.emptyProtobufList();
    private byte j = (byte) 2;

    private arwp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0005\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004Љ\u0002\u0005Љ\u0003\u0007\n\u0005\b\u001b", new Object[]{"a", "b", "c", "d", arml.class, "e", "f", "g", "h", aule.class});
            case 3:
                return new arwp();
            case 4:
                return new arws();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arwp.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arwp arwp = new arwp();
        i = arwp;
        anxl.registerDefaultInstance(arwp.class, arwp);
    }
}
