package defpackage;

import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;

/* renamed from: atpm */
public final class atpm extends anxl implements anzf {
    public static final atpm e;
    private static volatile anzq g;
    public int a;
    public int b = 0;
    public Object c;
    public asic d;
    private byte f = (byte) 2;

    private atpm() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002м\u0000\u0003м\u0000", new Object[]{"c", "b", "a", "d", CompleteTransactionActionOuterClass$CompleteTransactionAction.class, axnd.class});
            case 3:
                return new atpm();
            case 4:
                return new atpl();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atpm.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        atpm atpm = new atpm();
        e = atpm;
        anxl.registerDefaultInstance(atpm.class, atpm);
    }
}
