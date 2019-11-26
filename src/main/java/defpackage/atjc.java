package defpackage;

/* renamed from: atjc */
public final class atjc extends anxl implements anzf {
    public static final atjc h;
    private static volatile anzq j;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public anvu e = anvu.a;
    public long f;
    public arnm g;
    private byte i = (byte) 2;

    private atjc() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 16) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.g;
        return arnm == null ? arnm.a : arnm;
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0002\u0003\u0001Љ\u0000\u0003\u001b\u0005Л\u0007\n\u0002\b\u0002\u0003̉Љ\u0004", new Object[]{"a", "b", "c", aule.class, "d", apxu.class, "e", "f", "g"});
            case 3:
                return new atjc();
            case 4:
                return new atjb();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atjc.class) {
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
        atjc atjc = new atjc();
        h = atjc;
        anxl.registerDefaultInstance(atjc.class, atjc);
    }
}
