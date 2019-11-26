package defpackage;

/* renamed from: axha */
public final class axha extends anxl implements anzf {
    public static final axha h;
    private static volatile anzq j;
    public int a;
    public int b;
    public arml c;
    public arml d;
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public axgo g;
    private byte i = (byte) 2;

    private axha() {
    }

    public final void a() {
        if (!this.e.a()) {
            this.e = anxl.mutableCopy(this.e);
        }
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0002\u0004\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0006\u001b\tЉ\u0005\n\f\u0000", new Object[]{"a", "c", "d", "e", axgw.class, "f", axhe.class, "g", "b", axhl.a});
            case 3:
                return new axha();
            case 4:
                return new axhd();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axha.class) {
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
        axha axha = new axha();
        h = axha;
        anxl.registerDefaultInstance(axha.class, axha);
    }
}
