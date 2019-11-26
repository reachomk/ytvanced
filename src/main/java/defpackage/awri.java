package defpackage;

/* renamed from: awri */
public final class awri extends anxl implements anzf {
    public static final awri i;
    private static volatile anzq k;
    public int a;
    public awra b;
    public anyd c = anxl.emptyProtobufList();
    public axak d;
    public aojc e;
    public anvu f = anvu.a;
    public axak g;
    public String h = "";
    private byte j = (byte) 2;

    private awri() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001Љ\u0000\u0002\u001b\u0003Љ\u0001\u0004Љ\u0002\u0006\n\u0004\u0007Љ\u0005\b\b\u0006", new Object[]{"a", "b", "c", awqo.class, "d", "e", "f", "g", "h"});
            case 3:
                return new awri();
            case 4:
                return new awrl();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awri.class) {
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

    public static anzq a() {
        return i.getParserForType();
    }

    static {
        awri awri = new awri();
        i = awri;
        anxl.registerDefaultInstance(awri.class, awri);
    }
}
