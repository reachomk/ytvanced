package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.avvx;
import defpackage.avvy;
import defpackage.avwa;
import defpackage.avwc;

public final class PermissionEndpointOuterClass$PermissionEndpoint extends anxl implements anzf {
    public static final PermissionEndpointOuterClass$PermissionEndpoint j;
    private static volatile anzq l;
    public static final anxr permissionEndpoint;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 0;
    public Object e;
    public avwc f;
    public avwa g;
    public apxu h;
    public apxu i;
    private byte k = (byte) 2;

    private PermissionEndpointOuterClass$PermissionEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\t\u0002\u0001\u0001\n\t\u0000\u0000\b\u0001\t\u0000\u0003м\u0000\u0004Љ\u0006\u0005м\u0001\u0006м\u0000\u0007м\u0001\bЉ\u0007\tЉ\b\nм\u0000", new Object[]{"c", "b", "e", "d", "a", "f", apxu.class, "g", avvx.class, apxu.class, apxu.class, "h", "i", apxu.class});
            case 3:
                return new PermissionEndpointOuterClass$PermissionEndpoint();
            case 4:
                return new avvy();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (PermissionEndpointOuterClass$PermissionEndpoint.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint = new PermissionEndpointOuterClass$PermissionEndpoint();
        j = permissionEndpointOuterClass$PermissionEndpoint;
        anxl.registerDefaultInstance(PermissionEndpointOuterClass$PermissionEndpoint.class, permissionEndpointOuterClass$PermissionEndpoint);
        apxu apxu = apxu.d;
        PermissionEndpointOuterClass$PermissionEndpoint permissionEndpointOuterClass$PermissionEndpoint2 = j;
        permissionEndpoint = anxl.newSingularGeneratedExtension(apxu, permissionEndpointOuterClass$PermissionEndpoint2, permissionEndpointOuterClass$PermissionEndpoint2, null, 126857142, aobm.MESSAGE, PermissionEndpointOuterClass$PermissionEndpoint.class);
    }
}
