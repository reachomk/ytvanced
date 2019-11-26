package defpackage;

/* renamed from: ayfu */
public final class ayfu extends anxl implements anzf {
    public static final ayfu q;
    private static volatile anzq s;
    public int a;
    public ayfc b;
    public ayfe c;
    public ayfw d;
    public ayfi e;
    public aygc f;
    public ayfg g;
    public ayfq h;
    public ayfs i;
    public awkn j;
    public ayfk k;
    public apdn l;
    public ayfy m;
    public ayfo n;
    public ayge o;
    public ayfm p;
    private byte r = (byte) 2;

    private ayfu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.r = b;
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001ￆᡇ波\u000f\u0000\u0000\fￆᡇЉ\nㅃ\t\u0002㌙Љ\u0007㌤Љ\u0003㑇Љ\u0001㒖\t\u0006ﷁ㔾Љ\b㛸Љ\u0000㨊Љ\f㴥Љ\u0004︧䷧\t\r乴Љ\t僅Љ\u000e幥Љ\u0005波Љ\u000f", new Object[]{"a", "l", "d", "i", "e", "c", "h", "j", "b", "m", "f", "n", "k", "o", "g", "p"});
            case 3:
                return new ayfu();
            case 4:
                return new ayft();
            case 5:
                return q;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (ayfu.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayfu ayfu = new ayfu();
        q = ayfu;
        anxl.registerDefaultInstance(ayfu.class, ayfu);
    }
}
