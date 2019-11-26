package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.vr.ndk.base.SdkConfigurationReader;
import com.google.vr.sdk.proto.Display$DisplayParams;
import com.google.vr.sdk.proto.Preferences$UserPrefs;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParams;
import com.google.vr.sdk.proto.nano.CardboardDevice$DeviceParamsList;

/* renamed from: bafd */
public final class bafd implements bahi {
    private static final String a = bafd.class.getSimpleName();
    private final ContentProviderClient b;
    private final Uri c;
    private final Uri d;
    private final Uri e;
    private final Uri f;
    private final Uri g;

    public bafd(ContentProviderClient contentProviderClient, String str) {
        if (contentProviderClient == null) {
            throw new IllegalArgumentException("ContentProviderClient must not be null");
        } else if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Authority key must be non-null and non-empty");
        } else {
            this.b = contentProviderClient;
            this.c = bahl.a(str, "device_params");
            this.d = bahl.a(str, "user_prefs");
            this.e = bahl.a(str, "phone_params");
            this.f = bahl.a(str, "sdk_configuration_params");
            this.g = bahl.a(str, "recent_headsets");
        }
    }

    public final CardboardDevice$DeviceParams a() {
        return (CardboardDevice$DeviceParams) a(new CardboardDevice$DeviceParams(), this.c);
    }

    public final boolean a(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        int delete;
        Uri uri = this.c;
        if (cardboardDevice$DeviceParams == null) {
            try {
                delete = this.b.delete(uri, null, null);
            } catch (RemoteException e) {
                Log.e(a, "Failed to write params to ContentProvider", e);
            } catch (SecurityException e2) {
                Log.e(a, "Insufficient permissions to write params to ContentProvider", e2);
            }
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", aocf.toByteArray(cardboardDevice$DeviceParams));
            delete = this.b.update(uri, contentValues, null, null);
        }
        if (delete > 0) {
            return true;
        }
        return false;
    }

    public final CardboardDevice$DeviceParamsList b() {
        return (CardboardDevice$DeviceParamsList) a(new CardboardDevice$DeviceParamsList(), this.g);
    }

    public final Display$DisplayParams c() {
        return (Display$DisplayParams) a(Display$DisplayParams.newBuilder(), this.e, null);
    }

    public final anex a(SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest) {
        return (anex) a((anxo) SdkConfigurationReader.DEFAULT_PARAMS.toBuilder(), this.f, Base64.encodeToString(sdkConfiguration$SdkConfigurationRequest.toByteArray(), 0));
    }

    public final Preferences$UserPrefs d() {
        return (Preferences$UserPrefs) a(Preferences$UserPrefs.newBuilder(), this.d, null);
    }

    public final void e() {
        if (VERSION.SDK_INT >= 24) {
            this.b.close();
        } else {
            this.b.release();
        }
    }

    private final anze a(anzd anzd, Uri uri, String str) {
        byte[] a = a(uri, str);
        if (a != null) {
            try {
                return anzd.mergeFrom(a).build();
            } catch (anyg e) {
                Log.e(a, "Error reading params from ContentProvider", e);
            }
        }
        return null;
    }

    private final aocf a(aocf aocf, Uri uri) {
        byte[] a = a(uri, null);
        if (a != null) {
            try {
                return aocf.mergeFrom(aocf, a);
            } catch (aocg e) {
                Log.e(a, "Error reading params from ContentProvider", e);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069  */
    private final byte[] a(android.net.Uri r8, java.lang.String r9) {
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.b;	 Catch:{ CursorIndexOutOfBoundsException -> 0x0058, IllegalArgumentException -> 0x0056, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x0054, all -> 0x0051 }
        r3 = 0;
        r5 = 0;
        r6 = 0;
        r2 = r8;
        r4 = r9;
        r9 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ CursorIndexOutOfBoundsException -> 0x0058, IllegalArgumentException -> 0x0056, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x0054, all -> 0x0051 }
        if (r9 == 0) goto L_0x0023;
    L_0x000e:
        r1 = r9.moveToFirst();	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        if (r1 == 0) goto L_0x0023;
    L_0x0014:
        r8 = 0;
        r8 = r9.getBlob(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        if (r8 != 0) goto L_0x001f;
    L_0x001b:
        r9.close();
        return r0;
    L_0x001f:
        r9.close();
        return r8;
    L_0x0023:
        r1 = a;	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r2 = r8.length();	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r2 = r2 + 50;
        r3 = new java.lang.StringBuilder;	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r3.<init>(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r2 = "Invalid params result from ContentProvider query: ";
        r3.append(r2);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r3.append(r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        r8 = r3.toString();	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        android.util.Log.e(r1, r8);	 Catch:{ CursorIndexOutOfBoundsException -> 0x004f, IllegalArgumentException -> 0x004d, CursorIndexOutOfBoundsException | RemoteException | IllegalArgumentException -> 0x004b }
        if (r9 == 0) goto L_0x0048;
    L_0x0045:
        r9.close();
    L_0x0048:
        return r0;
    L_0x0049:
        r8 = move-exception;
        goto L_0x0067;
    L_0x004b:
        r8 = move-exception;
        goto L_0x005a;
    L_0x004d:
        r8 = move-exception;
        goto L_0x005a;
    L_0x004f:
        r8 = move-exception;
        goto L_0x005a;
    L_0x0051:
        r8 = move-exception;
        r9 = r0;
        goto L_0x0067;
    L_0x0054:
        r8 = move-exception;
        goto L_0x0059;
    L_0x0056:
        r8 = move-exception;
        goto L_0x0059;
    L_0x0058:
        r8 = move-exception;
    L_0x0059:
        r9 = r0;
    L_0x005a:
        r1 = a;	 Catch:{ all -> 0x0049 }
        r2 = "Error reading params from ContentProvider";
        android.util.Log.e(r1, r2, r8);	 Catch:{ all -> 0x0049 }
        if (r9 == 0) goto L_0x0066;
    L_0x0063:
        r9.close();
    L_0x0066:
        return r0;
    L_0x0067:
        if (r9 == 0) goto L_0x006c;
    L_0x0069:
        r9.close();
    L_0x006c:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bafd.a(android.net.Uri, java.lang.String):byte[]");
    }
}
