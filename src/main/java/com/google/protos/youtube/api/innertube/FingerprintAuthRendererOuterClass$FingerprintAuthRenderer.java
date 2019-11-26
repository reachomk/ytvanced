package com.google.protos.youtube.api.innertube;

import defpackage.anvu;
import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anyd;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.arkd;
import defpackage.arml;
import defpackage.axak;

public final class FingerprintAuthRendererOuterClass$FingerprintAuthRenderer extends anxl implements anzf {
    public static final anxr fingerprintAuthRenderer;
    public static final FingerprintAuthRendererOuterClass$FingerprintAuthRenderer g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public boolean e;
    public anvu f = anvu.a;
    private byte h = (byte) 2;

    private FingerprintAuthRendererOuterClass$FingerprintAuthRenderer() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0003\u0004\u0001\u0004\u0007\u0002\u0006\n\u0004", new Object[]{"a", "b", "c", arml.class, "d", "e", "f"});
            case 3:
                return new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
            case 4:
                return new arkd();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class) {
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
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
        g = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
        anxl.registerDefaultInstance(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
        axak axak = axak.a;
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer2 = g;
        fingerprintAuthRenderer = anxl.newSingularGeneratedExtension(axak, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer2, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer2, null, 196186429, aobm.MESSAGE, FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class);
    }
}
