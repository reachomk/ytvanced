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
import defpackage.arml;
import defpackage.avuy;
import defpackage.axak;

public final class PasswordAuthRendererOuterClass$PasswordAuthRenderer extends anxl implements anzf {
    public static final PasswordAuthRendererOuterClass$PasswordAuthRenderer i;
    private static volatile anzq k;
    public static final anxr passwordAuthRenderer;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public boolean e;
    public arml f;
    public arml g;
    public anvu h = anvu.a;
    private byte j = (byte) 2;

    private PasswordAuthRendererOuterClass$PasswordAuthRenderer() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0003\u0004\u0001\u0004\u0007\u0002\u0005Љ\u0003\u0006Љ\u0004\b\n\u0006", new Object[]{"a", "b", "c", arml.class, "d", "e", "f", "g", "h"});
            case 3:
                return new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
            case 4:
                return new avuy();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (PasswordAuthRendererOuterClass$PasswordAuthRenderer.class) {
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

    static {
        PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer = new PasswordAuthRendererOuterClass$PasswordAuthRenderer();
        i = passwordAuthRendererOuterClass$PasswordAuthRenderer;
        anxl.registerDefaultInstance(PasswordAuthRendererOuterClass$PasswordAuthRenderer.class, passwordAuthRendererOuterClass$PasswordAuthRenderer);
        axak axak = axak.a;
        PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer2 = i;
        passwordAuthRenderer = anxl.newSingularGeneratedExtension(axak, passwordAuthRendererOuterClass$PasswordAuthRenderer2, passwordAuthRendererOuterClass$PasswordAuthRenderer2, null, 196176225, aobm.MESSAGE, PasswordAuthRendererOuterClass$PasswordAuthRenderer.class);
    }
}
