package com.google.vr.ndk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import com.google.vr.sdk.proto.SdkConfiguration.SdkConfigurationRequest.Builder;
import defpackage.anex;
import defpackage.anfa;
import defpackage.anfb;
import defpackage.anfc;
import defpackage.anfi;
import defpackage.anxl;
import defpackage.bahi;
import defpackage.bahk;

public class SdkConfigurationReader {
    public static final anex DEFAULT_PARAMS;
    public static final anex REQUESTED_PARAMS;
    public static anex sParams;

    public static anex getParams(Context context) {
        Class cls = SdkConfigurationReader.class;
        synchronized (cls) {
            if (sParams != null) {
                anex anex = sParams;
                return anex;
            }
            bahi a = bahk.a(context);
            anex readParamsFromProvider = readParamsFromProvider(a);
            synchronized (cls) {
                sParams = readParamsFromProvider;
            }
            a.e();
            return sParams;
        }
    }

    private static anex readParamsFromProvider(bahi bahi) {
        Builder newBuilder = SdkConfiguration$SdkConfigurationRequest.newBuilder();
        newBuilder.setRequestedParams(REQUESTED_PARAMS);
        newBuilder.setSdkVersion("1.212.0");
        anex a = bahi.a((SdkConfiguration$SdkConfigurationRequest) ((anxl) newBuilder.build()));
        if (a == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            return DEFAULT_PARAMS;
        }
        String.valueOf(a).length();
        return a;
    }

    static {
        anfc anfc = (anfc) anex.DEFAULT_INSTANCE.createBuilder();
        anfc.a(true);
        anfc.b(true);
        anfc.g(true);
        anfc.c(true);
        anfc.d(true);
        anfc.a(anfb.DISABLED);
        anfa anfa = anfa.DEFAULT_INSTANCE;
        anfc.copyOnWrite();
        anex anex = (anex) anfc.instance;
        if (anfa != null) {
            anex.asyncReprojectionConfig_ = anfa;
            anex.bitField0_ |= 64;
            anfc.e(true);
            anfc.f(true);
            anfc.h(true);
            anfc.i(true);
            anfc.l(true);
            anfc.j(true);
            anfc.k(true);
            anfi anfi = anfi.DEFAULT_INSTANCE;
            anfc.copyOnWrite();
            anex = (anex) anfc.instance;
            if (anfi != null) {
                anex.screenCaptureConfig_ = anfi;
                anex.bitField0_ |= 65536;
                anfc.n(true);
                anfc.m(true);
                anfc.o(true);
                anfc.p(true);
                anfc.a();
                REQUESTED_PARAMS = (anex) ((anxl) anfc.build());
                anfc = (anfc) anex.DEFAULT_INSTANCE.createBuilder();
                anfc.a(false);
                anfc.b(false);
                anfc.g(false);
                anfc.c(false);
                anfc.d(false);
                anfc.a(anfb.ENABLED_WITH_MEDIAN_FILTER);
                anfc.e(false);
                anfc.f(false);
                anfc.h(false);
                anfc.i(false);
                anfc.l(false);
                anfc.j(false);
                anfc.k(false);
                anfc.n(false);
                anfc.m(false);
                anfc.o(false);
                anfc.p(false);
                anfc.a();
                DEFAULT_PARAMS = (anex) ((anxl) anfc.build());
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
