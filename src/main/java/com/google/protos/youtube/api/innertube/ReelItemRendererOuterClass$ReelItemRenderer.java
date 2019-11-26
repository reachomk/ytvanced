package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.aodx;
import defpackage.apxu;
import defpackage.arml;
import defpackage.auvr;
import defpackage.awwm;
import defpackage.awwo;
import defpackage.awxn;
import defpackage.awxo;
import defpackage.axak;
import defpackage.aygk;

public final class ReelItemRendererOuterClass$ReelItemRenderer extends anxl implements anzf {
    public static final ReelItemRendererOuterClass$ReelItemRenderer q;
    public static final anxr reelItemRenderer;
    private static volatile anzq s;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public aygk f;
    public arml g;
    public arml h;
    public arml i;
    public apxu j;
    public auvr k;
    public int l;
    public anvu m = anvu.a;
    public aodx n;
    public int o;
    public awxn p;
    private byte r = (byte) 2;

    private ReelItemRendererOuterClass$ReelItemRenderer() {
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
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001\u0002\u0013\u000f\u0000\u0000\n\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\b\bЉ\t\tЉ\n\f\n\u000e\r\t\u000f\u000e\f\u0010\u000fЉ\u0007\u0010\f\u000b\u0012Љ\u0001\u0013\t\u0012", new Object[]{"a", "c", "d", "e", "f", "g", "i", "j", "k", "m", "n", "o", awwo.a, "h", "l", awwm.a, "b", "p"});
            case 3:
                return new ReelItemRendererOuterClass$ReelItemRenderer();
            case 4:
                return new awxo();
            case 5:
                return q;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (ReelItemRendererOuterClass$ReelItemRenderer.class) {
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

    public static anzq a() {
        return q.getParserForType();
    }

    static {
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = new ReelItemRendererOuterClass$ReelItemRenderer();
        q = reelItemRendererOuterClass$ReelItemRenderer;
        anxl.registerDefaultInstance(ReelItemRendererOuterClass$ReelItemRenderer.class, reelItemRendererOuterClass$ReelItemRenderer);
        axak axak = axak.a;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = q;
        reelItemRenderer = anxl.newSingularGeneratedExtension(axak, reelItemRendererOuterClass$ReelItemRenderer2, reelItemRendererOuterClass$ReelItemRenderer2, null, 158884182, aobm.MESSAGE, ReelItemRendererOuterClass$ReelItemRenderer.class);
    }
}
