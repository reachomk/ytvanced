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
import defpackage.arwf;
import defpackage.awyl;
import defpackage.axak;

public final class ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer extends anxl implements anzf {
    public static final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer g;
    private static volatile anzq i;
    public static final anxr reelShelfCreationRenderer;
    public int a;
    public apxu b;
    public arwf c;
    public arml d;
    public aodx e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001Љ\u0000\u0002\t\u0001\u0003Љ\u0002\u0004\t\u0004\u0005\n\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
            case 4:
                return new awyl();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
        g = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
        anxl.registerDefaultInstance(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        axak axak = axak.a;
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2 = g;
        reelShelfCreationRenderer = anxl.newSingularGeneratedExtension(axak, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer2, null, 231434348, aobm.MESSAGE, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class);
    }
}
