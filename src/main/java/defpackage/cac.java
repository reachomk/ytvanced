package defpackage;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.util.Log;

/* renamed from: cac */
public final class cac implements bzq {
    private final bzq a;
    private final Resources b;

    public cac(Resources resources, bzq bzq) {
        this.b = resources;
        this.a = bzq;
    }

    private final Uri a(Integer num) {
        String resourceEntryName;
        Object num2;
        try {
            String resourcePackageName = this.b.getResourcePackageName(num2.intValue());
            String resourceTypeName = this.b.getResourceTypeName(num2.intValue());
            resourceEntryName = this.b.getResourceEntryName(num2.intValue());
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(resourcePackageName).length() + 21) + String.valueOf(resourceTypeName).length()) + String.valueOf(resourceEntryName).length());
            stringBuilder.append("android.resource://");
            stringBuilder.append(resourcePackageName);
            stringBuilder.append('/');
            stringBuilder.append(resourceTypeName);
            stringBuilder.append('/');
            stringBuilder.append(resourceEntryName);
            num2 = Uri.parse(stringBuilder.toString());
            return num2;
        } catch (NotFoundException e) {
            resourceEntryName = "ResourceLoader";
            if (Log.isLoggable(resourceEntryName, 5)) {
                String valueOf = String.valueOf(num2);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 30);
                stringBuilder2.append("Received invalid resource id: ");
                stringBuilder2.append(valueOf);
                Log.w(resourceEntryName, stringBuilder2.toString(), e);
            }
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        Uri a = a((Integer) obj);
        return a != null ? this.a.a(a, i, i2, bsq) : null;
    }
}
