package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.MediaStore;
import android.provider.MediaStore.Video.Media;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: agnt */
public final class agnt implements agnv {
    private final Context a;
    private final bcaa b;
    private final bcaa c;

    public agnt(Context context, bcaa bcaa, bcaa bcaa2) {
        this.a = context;
        this.b = bcaa;
        this.c = bcaa2;
    }

    public final /* synthetic */ agnw b(Uri uri, int i) {
        return new agnu(this.a, this.b, uri);
    }

    public final /* synthetic */ agnw a(int i, azqt azqt) {
        xtl.c("MediaStoreYtbDownloadTarget", "Creating mediastore download target.");
        agpi agpi = (agpi) amqw.a(((agwc) this.c.get()).b().i());
        ContentResolver contentResolver = this.a.getContentResolver();
        StorageVolume storageVolume = ((StorageManager) this.a.getSystemService("storage")).getStorageVolume(agpi.a(i));
        String str = null;
        CharSequence uuid = storageVolume != null ? storageVolume.getUuid() : null;
        if (uuid != null && !TextUtils.isEmpty(uuid)) {
            for (String str2 : MediaStore.getExternalVolumeNames(this.a)) {
                if (ampq.a(uuid, str2)) {
                    str = str2;
                    break;
                }
            }
        }
        if (str == null) {
            xtl.e("No matching media store volume found, defaulting to external_primary.");
            str = "external_primary";
        }
        Uri contentUri = Media.getContentUri(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("mime_type", agmn.a());
        contentValues.put("title", azqt.b);
        String a = agnd.a(azqt.b, azqt.c);
        String str22 = "_display_name";
        contentValues.put(str22, a);
        contentValues.put("is_pending", Integer.valueOf(1));
        Uri insert = contentResolver.insert(contentUri, contentValues);
        if (insert == null) {
            try {
                String str3 = ((azqf) anxl.parseFrom(azqf.d, azqt.e, anxa.c())).b;
                String str4 = azqt.c;
                StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str3).length() + 1) + String.valueOf(a).length()) + String.valueOf(str4).length());
                stringBuilder.append(str3);
                stringBuilder.append("_");
                stringBuilder.append(a);
                stringBuilder.append(str4);
                contentValues.put(str22, stringBuilder.toString());
                insert = contentResolver.insert(contentUri, contentValues);
            } catch (IOException e) {
                xtl.a("Error de-serializing YTOF proto for new MediaStore download", e);
            }
            if (insert == null) {
                throw new agnx(7, "Failed to insert URI into MediaStore, check logcat for reason.");
            }
        }
        return new agnu(this.a, this.b, insert);
    }
}
