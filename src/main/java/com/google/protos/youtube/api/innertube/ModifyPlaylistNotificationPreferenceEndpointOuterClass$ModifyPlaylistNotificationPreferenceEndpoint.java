package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avcq;

public final class ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint extends anxl implements anzf {
    public static final ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint c;
    private static volatile anzq e;
    public static final anxr modifyPlaylistNotificationPreferenceEndpoint;
    public int a;
    public String b = "";
    private byte d = (byte) 2;

    private ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint();
            case 4:
                return new avcq();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint.class) {
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
        ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint = new ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint();
        c = modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint;
        anxl.registerDefaultInstance(ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint.class, modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint);
        apxu apxu = apxu.d;
        ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint2 = c;
        modifyPlaylistNotificationPreferenceEndpoint = anxl.newSingularGeneratedExtension(apxu, modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint2, modifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint2, null, 113369051, aobm.MESSAGE, ModifyPlaylistNotificationPreferenceEndpointOuterClass$ModifyPlaylistNotificationPreferenceEndpoint.class);
    }
}
