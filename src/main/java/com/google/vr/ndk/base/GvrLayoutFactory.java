package com.google.vr.ndk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.anex;
import defpackage.bahh;
import defpackage.bahp;
import defpackage.baju;
import defpackage.bakg;

public class GvrLayoutFactory {
    public static baju create(Context context) {
        baju tryCreateFromVrCorePackage = tryCreateFromVrCorePackage(context);
        if (tryCreateFromVrCorePackage != null) {
            return tryCreateFromVrCorePackage;
        }
        if (!GvrApi.usingShimLibrary()) {
            return createFromCurrentPackage(context);
        }
        throw new IllegalStateException("Client shim failed to load GvrLayout from VrCore.");
    }

    private static baju createFromCurrentPackage(Context context) {
        return new GvrLayoutImplWrapper(new GvrLayoutImpl(context));
    }

    private static baju tryCreateFromVrCorePackage(Context context) {
        String str = "GvrLayoutFactory";
        if ("com.google.vr.vrcore".equalsIgnoreCase(context.getPackageName())) {
            return createFromCurrentPackage(context);
        }
        if (context instanceof bahh) {
            throw new IllegalArgumentException("VrContextWrapper only supported within VrCore.");
        }
        if (GvrApi.usingDynamicLibrary(context)) {
            anex params = SdkConfigurationReader.getParams(context);
            if (((params.bitField0_ & 1024) == 0 || !params.allowDynamicJavaLibraryLoading_) && !GvrApi.usingShimLibrary()) {
                return null;
            }
            try {
                if (VrCoreUtils.getVrCoreClientApiVersion(context) >= 17) {
                    try {
                        baju b = bakg.a(context).b(ObjectWrapper.a(bakg.b(context)), ObjectWrapper.a(context));
                        if (b == null) {
                            Log.w(str, "GvrLayout creation from VrCore failed.");
                        }
                        return b;
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 40);
                        stringBuilder.append("Failed to load GvrLayout from VrCore:\n  ");
                        stringBuilder.append(valueOf);
                        Log.e(str, stringBuilder.toString());
                    }
                }
            } catch (bahp unused) {
            }
        }
        return null;
    }
}
