package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.axak;
import defpackage.axhq;

public final class ShareGroupCommandOuterClass$ShareGroupCommand extends anxl implements anzf {
    public static final ShareGroupCommandOuterClass$ShareGroupCommand e;
    private static volatile anzq g;
    public static final anxr shareGroupCommand;
    public int a;
    public axak b;
    public String c = "";
    public boolean d;
    private byte f = (byte) 2;

    private ShareGroupCommandOuterClass$ShareGroupCommand() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ShareGroupCommandOuterClass$ShareGroupCommand();
            case 4:
                return new axhq();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (ShareGroupCommandOuterClass$ShareGroupCommand.class) {
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
        ShareGroupCommandOuterClass$ShareGroupCommand shareGroupCommandOuterClass$ShareGroupCommand = new ShareGroupCommandOuterClass$ShareGroupCommand();
        e = shareGroupCommandOuterClass$ShareGroupCommand;
        anxl.registerDefaultInstance(ShareGroupCommandOuterClass$ShareGroupCommand.class, shareGroupCommandOuterClass$ShareGroupCommand);
        apxu apxu = apxu.d;
        ShareGroupCommandOuterClass$ShareGroupCommand shareGroupCommandOuterClass$ShareGroupCommand2 = e;
        shareGroupCommand = anxl.newSingularGeneratedExtension(apxu, shareGroupCommandOuterClass$ShareGroupCommand2, shareGroupCommandOuterClass$ShareGroupCommand2, null, 183727817, aobm.MESSAGE, ShareGroupCommandOuterClass$ShareGroupCommand.class);
    }
}
