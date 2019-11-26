package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avem;
import defpackage.axak;

public final class MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer extends anxl implements anzf {
    public static final anxr companionStateRenderer;
    public static final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public axak c;
    public apxu d;
    public boolean e;
    private byte g = (byte) 2;

    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
            case 4:
                return new avem();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
        f = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
        anxl.registerDefaultInstance(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer);
        axak axak = axak.a;
        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = f;
        companionStateRenderer = anxl.newSingularGeneratedExtension(axak, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2, null, 166494362, aobm.MESSAGE, MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class);
    }
}
