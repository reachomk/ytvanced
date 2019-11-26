package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;

/* renamed from: amjn */
public final class amjn {
    public static Intent a(Activity activity, Intent intent) {
        Uri data = intent.getData();
        String valueOf;
        StringBuilder stringBuilder;
        if (data == null) {
            valueOf = String.valueOf(intent);
            stringBuilder = new StringBuilder(valueOf.length() + 30);
            stringBuilder.append("No Uri on upload video intent:");
            stringBuilder.append(valueOf);
            xtl.d(stringBuilder.toString());
            return null;
        }
        CharSequence type = activity.getContentResolver().getType(data);
        if (TextUtils.isEmpty(type)) {
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(data.toString());
            if (fileExtensionFromUrl != null) {
                type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            }
        }
        if (!TextUtils.isEmpty(type)) {
            return new Intent("com.google.android.youtube.intent.action.UPLOAD", data);
        }
        valueOf = String.valueOf(intent);
        stringBuilder = new StringBuilder(valueOf.length() + 36);
        stringBuilder.append("No mime-type on upload video intent:");
        stringBuilder.append(valueOf);
        xtl.d(stringBuilder.toString());
        return null;
    }
}
