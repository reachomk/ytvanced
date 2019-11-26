package defpackage;

/* renamed from: aszw */
public final class aszw extends anxl implements anzf {
    public static final aszw j;
    private static volatile anzq l;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public aphj d;
    public aszm e;
    public String f = "";
    public long g;
    public anvu h = anvu.a;
    public arnm i;
    private byte k = (byte) 2;

    private aszw() {
    }

    public final boolean hasFrameworkUpdates() {
        return (this.a & 256) != 0;
    }

    public final arnm getFrameworkUpdates() {
        arnm arnm = this.i;
        return arnm == null ? arnm.a : arnm;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001̉\b\u0000\u0001\u0005\u0001Љ\u0000\u0003Л\u0004Љ\u0001\u0006\b\u0004\u0007Љ\u0002\t\u0002\u0005\u000b\n\u0007̉Љ\b", new Object[]{"a", "b", "c", apxu.class, "d", "f", "e", "g", "h", "i"});
            case 3:
                return new aszw();
            case 4:
                return new aszv();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aszw.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aszw aszw = new aszw();
        j = aszw;
        anxl.registerDefaultInstance(aszw.class, aszw);
    }
}
