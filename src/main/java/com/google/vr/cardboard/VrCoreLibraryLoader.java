package com.google.vr.cardboard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.Log;
import com.google.vr.ndk.base.Version;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.bahp;
import defpackage.bakd;
import defpackage.bakg;

public class VrCoreLibraryLoader {
    public static long loadNativeGvrLibrary(Context context) {
        return loadNativeGvrLibrary(context, Version.MIN, Version.CURRENT);
    }

    public static long loadNativeGvrLibrary(Context context, Version version, Version version2) {
        Object e;
        String valueOf;
        StringBuilder stringBuilder;
        String str = "VrCoreLibraryLoader";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.vr.vrcore", 128);
            if (applicationInfo == null) {
                throw new bahp(8);
            } else if (!applicationInfo.enabled) {
                throw new bahp(2);
            } else if (applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("com.google.vr.vrcore.SdkLibraryVersion", "");
                if (string.isEmpty()) {
                    throw new bahp(4);
                }
                Version parse = Version.parse(string.substring(1));
                if (parse == null) {
                    throw new bahp(4);
                } else if (parse.isAtLeast(version)) {
                    Context b = bakg.b(context);
                    bakg.b(context);
                    int i = bakg.a;
                    bakd a = bakg.a(context).a(ObjectWrapper.a(b), ObjectWrapper.a(context));
                    if (a == null) {
                        Log.e(str, "Failed to load native GVR library from VrCore: no library loader available.");
                        return 0;
                    } else if (i < 19) {
                        return a.a(version2.majorVersion, version2.minorVersion, version2.patchVersion);
                    } else {
                        return a.a(version.toString(), version2.toString());
                    }
                } else {
                    Log.w(str, String.format("VrCore GVR library version obsolete; VrCore supports %s but client min is %s", new Object[]{string, version.toString()}));
                    throw new bahp(4);
                }
            } else {
                throw new bahp(4);
            }
        } catch (NameNotFoundException unused) {
            throw new bahp(VrCoreUtils.a(context));
        } catch (bahp e2) {
            e = e2;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        } catch (IllegalArgumentException e3) {
            e = e3;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        } catch (IllegalStateException e4) {
            e = e4;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        } catch (SecurityException e5) {
            e = e5;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        } catch (UnsatisfiedLinkError e6) {
            e = e6;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        } catch (RemoteException e7) {
            e = e7;
            valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Failed to load native GVR library from VrCore:\n  ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
            return 0;
        }
    }

    public static long loadNativeDlsymMethod(Context context) {
        String str = "VrCoreLibraryLoader";
        if (VERSION.SDK_INT <= 23) {
            try {
                if (VrCoreUtils.getVrCoreClientApiVersion(context) < 14) {
                    return 0;
                }
                bakd a = bakg.a(context).a(ObjectWrapper.a(bakg.b(context)), ObjectWrapper.a(context));
                if (a != null) {
                    return a.a();
                }
                Log.e(str, "Failed to load native dlsym handle from VrCore: no library loader available.");
                return 0;
            } catch (RemoteException | bahp | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 50);
                stringBuilder.append("Failed to load native dlsym handle from VrCore:\n  ");
                stringBuilder.append(valueOf);
                Log.e(str, stringBuilder.toString());
            }
        }
        return 0;
    }
}
