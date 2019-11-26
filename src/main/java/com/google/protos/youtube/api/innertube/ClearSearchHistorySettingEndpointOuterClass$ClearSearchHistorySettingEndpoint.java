package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apue;
import defpackage.apxu;

public final class ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint extends anxl implements anzf {
    public static final ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint c;
    public static final anxr clearSearchHistorySettingEndpoint;
    private static volatile anzq d;
    public int a;
    public String b = "";

    private ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
            case 4:
                return new apue();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint = new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
        c = clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
        anxl.registerDefaultInstance(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint);
        apxu apxu = apxu.d;
        ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint2 = c;
        clearSearchHistorySettingEndpoint = anxl.newSingularGeneratedExtension(apxu, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint2, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint2, null, 86611299, aobm.MESSAGE, ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class);
    }
}
