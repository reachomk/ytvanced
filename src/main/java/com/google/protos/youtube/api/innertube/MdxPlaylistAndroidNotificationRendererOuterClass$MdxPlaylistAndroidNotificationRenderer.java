package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.autv;
import defpackage.autw;
import defpackage.auty;
import defpackage.axak;

public final class MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer extends anxl implements anzf {
    public static final MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer e;
    private static volatile anzq g;
    public static final anxr mdxPlaylistAndroidNotificationRenderer;
    public int a;
    public autv b;
    public autw c;
    public apxu d;
    private byte f = (byte) 2;

    private MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer();
            case 4:
                return new auty();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer.class) {
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
        MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer = new MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer();
        e = mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer;
        anxl.registerDefaultInstance(MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer.class, mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer);
        axak axak = axak.a;
        MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer2 = e;
        mdxPlaylistAndroidNotificationRenderer = anxl.newSingularGeneratedExtension(axak, mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer2, mdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer2, null, 160719978, aobm.MESSAGE, MdxPlaylistAndroidNotificationRendererOuterClass$MdxPlaylistAndroidNotificationRenderer.class);
    }
}
