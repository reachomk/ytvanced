package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;

/* renamed from: cdj */
public final class cdj implements bsp {
    private final Context a;

    public cdj(Context context) {
        this.a = context.getApplicationContext();
    }

    public final bvw a(Uri uri) {
        Context context;
        String valueOf;
        int parseInt;
        String authority = uri.getAuthority();
        if (authority.equals(this.a.getPackageName())) {
            context = this.a;
        } else {
            try {
                context = this.a.createPackageContext(authority, 0);
            } catch (NameNotFoundException e) {
                if (authority.contains(this.a.getPackageName())) {
                    context = this.a;
                } else {
                    valueOf = String.valueOf(uri);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 57);
                    stringBuilder.append("Failed to obtain context or unrecognized Uri format for: ");
                    stringBuilder.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder.toString(), e);
                }
            }
        }
        List pathSegments = uri.getPathSegments();
        StringBuilder stringBuilder2;
        if (pathSegments.size() != 2) {
            String str = "Unrecognized Uri format: ";
            if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt((String) uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    valueOf = String.valueOf(uri);
                    StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 25);
                    stringBuilder3.append(str);
                    stringBuilder3.append(valueOf);
                    throw new IllegalArgumentException(stringBuilder3.toString(), e2);
                }
            }
            valueOf = String.valueOf(uri);
            stringBuilder2 = new StringBuilder(valueOf.length() + 25);
            stringBuilder2.append(str);
            stringBuilder2.append(valueOf);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        pathSegments = uri.getPathSegments();
        String str2 = (String) pathSegments.get(0);
        String str3 = (String) pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str3, str2, uri.getAuthority());
        int identifier2 = identifier == 0 ? Resources.getSystem().getIdentifier(str3, str2, "android") : identifier;
        if (identifier2 != 0) {
            parseInt = identifier2;
        } else {
            valueOf = String.valueOf(uri);
            stringBuilder2 = new StringBuilder(valueOf.length() + 32);
            stringBuilder2.append("Failed to find resource id for: ");
            stringBuilder2.append(valueOf);
            throw new IllegalArgumentException(stringBuilder2.toString());
        }
        return cdk.a(cdf.a(this.a, context, parseInt, null));
    }

    public final /* bridge */ /* synthetic */ bvw a(Object obj, int i, int i2, bsq bsq) {
        return a((Uri) obj);
    }

    public final /* synthetic */ boolean a(Object obj, bsq bsq) {
        return ((Uri) obj).getScheme().equals("android.resource");
    }
}
