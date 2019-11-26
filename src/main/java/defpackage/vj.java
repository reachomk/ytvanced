package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: vj */
public final class vj implements Parcelable {
    public static final Creator CREATOR = new vi();
    public static final zj a;
    private static final String[] d;
    private static final String[] e = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] f;
    public final Bundle b;
    public MediaMetadata c;
    private ve g;

    vj(Bundle bundle) {
        this.b = new Bundle(bundle);
        wq.a(this.b);
    }

    public final int describeContents() {
        return 0;
    }

    vj(Parcel parcel) {
        this.b = parcel.readBundle(wq.class.getClassLoader());
    }

    private final CharSequence b(String str) {
        return this.b.getCharSequence(str);
    }

    private final String c(String str) {
        CharSequence charSequence = this.b.getCharSequence(str);
        return charSequence != null ? charSequence.toString() : null;
    }

    public final long a(String str) {
        return this.b.getLong(str, 0);
    }

    public final ve a() {
        ve veVar = this.g;
        if (veVar != null) {
            return veVar;
        }
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        String c;
        String c2 = c("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence b = b("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(b)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = d;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence b2 = b(strArr[i2]);
                if (!TextUtils.isEmpty(b2)) {
                    int i4 = i + 1;
                    charSequenceArr[i] = b2;
                    i = i4;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = b;
            charSequenceArr[1] = b("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = b("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i5 = 0;
        while (true) {
            String[] strArr2 = e;
            uri = null;
            if (i5 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) this.b.getParcelable(strArr2[i5]);
            } catch (Exception e) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i5++;
        }
        i5 = 0;
        while (true) {
            String[] strArr3 = f;
            if (i5 >= strArr3.length) {
                uri2 = null;
                break;
            }
            c = c(strArr3[i5]);
            if (!TextUtils.isEmpty(c)) {
                uri2 = Uri.parse(c);
                break;
            }
            i5++;
        }
        c = c("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(c)) {
            uri = Uri.parse(c);
        }
        vg vgVar = new vg();
        vgVar.a = c2;
        vgVar.b = charSequenceArr[0];
        vgVar.c = charSequenceArr[1];
        vgVar.d = charSequenceArr[2];
        vgVar.e = bitmap;
        vgVar.f = uri2;
        vgVar.h = uri;
        Bundle bundle = new Bundle();
        String str = "android.media.metadata.BT_FOLDER_TYPE";
        if (this.b.containsKey(str)) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", a(str));
        }
        str = "android.media.metadata.DOWNLOAD_STATUS";
        if (this.b.containsKey(str)) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", a(str));
        }
        if (!bundle.isEmpty()) {
            vgVar.g = bundle;
        }
        this.g = vgVar.a();
        return this.g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }

    public static vj a(Object obj) {
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        vj vjVar = (vj) CREATOR.createFromParcel(obtain);
        obtain.recycle();
        vjVar.c = mediaMetadata;
        return vjVar;
    }

    static {
        zj zjVar = new zj();
        a = zjVar;
        Integer valueOf = Integer.valueOf(1);
        zjVar.put("android.media.metadata.TITLE", valueOf);
        a.put("android.media.metadata.ARTIST", valueOf);
        zjVar = a;
        Integer valueOf2 = Integer.valueOf(0);
        zjVar.put("android.media.metadata.DURATION", valueOf2);
        a.put("android.media.metadata.ALBUM", valueOf);
        a.put("android.media.metadata.AUTHOR", valueOf);
        a.put("android.media.metadata.WRITER", valueOf);
        a.put("android.media.metadata.COMPOSER", valueOf);
        a.put("android.media.metadata.COMPILATION", valueOf);
        a.put("android.media.metadata.DATE", valueOf);
        a.put("android.media.metadata.YEAR", valueOf2);
        a.put("android.media.metadata.GENRE", valueOf);
        a.put("android.media.metadata.TRACK_NUMBER", valueOf2);
        a.put("android.media.metadata.NUM_TRACKS", valueOf2);
        a.put("android.media.metadata.DISC_NUMBER", valueOf2);
        a.put("android.media.metadata.ALBUM_ARTIST", valueOf);
        zjVar = a;
        Integer valueOf3 = Integer.valueOf(2);
        zjVar.put("android.media.metadata.ART", valueOf3);
        a.put("android.media.metadata.ART_URI", valueOf);
        a.put("android.media.metadata.ALBUM_ART", valueOf3);
        String str = "android.media.metadata.ALBUM_ART_URI";
        a.put(str, valueOf);
        zjVar = a;
        String str2 = str;
        Integer valueOf4 = Integer.valueOf(3);
        zjVar.put("android.media.metadata.USER_RATING", valueOf4);
        a.put("android.media.metadata.RATING", valueOf4);
        a.put("android.media.metadata.DISPLAY_TITLE", valueOf);
        a.put("android.media.metadata.DISPLAY_SUBTITLE", valueOf);
        a.put("android.media.metadata.DISPLAY_DESCRIPTION", valueOf);
        a.put("android.media.metadata.DISPLAY_ICON", valueOf3);
        a.put("android.media.metadata.DISPLAY_ICON_URI", valueOf);
        a.put("android.media.metadata.MEDIA_ID", valueOf);
        a.put("android.media.metadata.BT_FOLDER_TYPE", valueOf2);
        a.put("android.media.metadata.MEDIA_URI", valueOf);
        a.put("android.media.metadata.ADVERTISEMENT", valueOf2);
        a.put("android.media.metadata.DOWNLOAD_STATUS", valueOf2);
        d = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", r11, r9, "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", str2};
    }
}
