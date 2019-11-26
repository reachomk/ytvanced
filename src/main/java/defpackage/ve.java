package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: ve */
public final class ve implements Parcelable {
    public static final Creator CREATOR = new vh();
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;
    public final Uri d;
    private final String e;
    private final CharSequence f;
    private final Bundle g;
    private final Uri h;
    private MediaDescription i;

    ve(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.e = str;
        this.a = charSequence;
        this.b = charSequence2;
        this.f = charSequence3;
        this.c = bitmap;
        this.d = uri;
        this.g = bundle;
        this.h = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    ve(Parcel parcel) {
        this.e = parcel.readString();
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = getClass().getClassLoader();
        this.c = (Bitmap) parcel.readParcelable(classLoader);
        this.d = (Uri) parcel.readParcelable(classLoader);
        this.g = parcel.readBundle(classLoader);
        this.h = (Uri) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.e);
            TextUtils.writeToParcel(this.a, parcel, i);
            TextUtils.writeToParcel(this.b, parcel, i);
            TextUtils.writeToParcel(this.f, parcel, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeBundle(this.g);
            parcel.writeParcelable(this.h, i);
            return;
        }
        MediaDescription mediaDescription;
        if (this.i != null || VERSION.SDK_INT < 21) {
            mediaDescription = this.i;
        } else {
            Builder builder = new Builder();
            builder.setMediaId(this.e);
            builder.setTitle(this.a);
            builder.setSubtitle(this.b);
            builder.setDescription(this.f);
            builder.setIconBitmap(this.c);
            builder.setIconUri(this.d);
            Bundle bundle = this.g;
            if (VERSION.SDK_INT < 23 && this.h != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.h);
            }
            builder.setExtras(bundle);
            if (VERSION.SDK_INT >= 23) {
                builder.setMediaUri(this.h);
            }
            this.i = builder.build();
            mediaDescription = this.i;
        }
        mediaDescription.writeToParcel(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        stringBuilder.append(this.f);
        return stringBuilder.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0067  */
    public static defpackage.ve a(java.lang.Object r8) {
        /*
        r0 = 0;
        if (r8 != 0) goto L_0x0005;
    L_0x0003:
        goto L_0x007c;
    L_0x0005:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r1 < r2) goto L_0x007c;
    L_0x000b:
        r1 = new vg;
        r1.<init>();
        r8 = (android.media.MediaDescription) r8;
        r2 = r8.getMediaId();
        r1.a = r2;
        r2 = r8.getTitle();
        r1.b = r2;
        r2 = r8.getSubtitle();
        r1.c = r2;
        r2 = r8.getDescription();
        r1.d = r2;
        r2 = r8.getIconBitmap();
        r1.e = r2;
        r2 = r8.getIconUri();
        r1.f = r2;
        r2 = r8.getExtras();
        r3 = "android.support.v4.media.description.MEDIA_URI";
        if (r2 == 0) goto L_0x0048;
    L_0x003e:
        defpackage.wq.a(r2);
        r4 = r2.getParcelable(r3);
        r4 = (android.net.Uri) r4;
        goto L_0x0049;
    L_0x0048:
        r4 = r0;
    L_0x0049:
        if (r4 == 0) goto L_0x0062;
    L_0x004b:
        r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
        r6 = r2.containsKey(r5);
        if (r6 != 0) goto L_0x0054;
    L_0x0053:
        goto L_0x005c;
    L_0x0054:
        r6 = r2.size();
        r7 = 2;
        if (r6 != r7) goto L_0x005c;
    L_0x005b:
        goto L_0x0063;
    L_0x005c:
        r2.remove(r3);
        r2.remove(r5);
    L_0x0062:
        r0 = r2;
    L_0x0063:
        r1.g = r0;
        if (r4 == 0) goto L_0x006a;
    L_0x0067:
        r1.h = r4;
        goto L_0x0076;
    L_0x006a:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 23;
        if (r0 < r2) goto L_0x0076;
    L_0x0070:
        r0 = r8.getMediaUri();
        r1.h = r0;
    L_0x0076:
        r0 = r1.a();
        r0.i = r8;
    L_0x007c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ve.a(java.lang.Object):ve");
    }
}
