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
import defpackage.axmj;

public final class ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand extends anxl implements anzf {
    public static final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand c;
    private static volatile anzq e;
    public static final anxr showReelsCommentsOverlayCommand;
    public int a;
    public axak b;
    private byte d = (byte) 2;

    private ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
            case 4:
                return new axmj();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand = new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
        c = showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
        anxl.registerDefaultInstance(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand);
        apxu apxu = apxu.d;
        ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand2 = c;
        showReelsCommentsOverlayCommand = anxl.newSingularGeneratedExtension(apxu, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand2, showReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand2, null, 206635851, aobm.MESSAGE, ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class);
    }
}
