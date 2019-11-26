package defpackage;

import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import java.util.Locale;

/* renamed from: ajji */
public final class ajji implements Parcelable {
    public static final Creator CREATOR = new ajjk();
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public ajji(CaptionStyle captionStyle) {
        this.a = captionStyle.backgroundColor;
        this.c = captionStyle.edgeColor;
        if (VERSION.SDK_INT >= 26) {
            this.d = 0;
        } else {
            this.d = captionStyle.edgeType;
        }
        this.e = captionStyle.foregroundColor;
        if (VERSION.SDK_INT >= 21) {
            this.b = captionStyle.windowColor;
        } else {
            this.b = 0;
        }
        this.f = 7;
    }

    public final int describeContents() {
        return 0;
    }

    public ajji(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public static final String a(int i) {
        return String.format(Locale.US, "#%06X", new Object[]{Integer.valueOf(i & 16777215)});
    }

    public static final String b(int i) {
        double alpha = (double) Color.alpha(i);
        Double.isNaN(alpha);
        if (alpha / 255.0d < 0.0d) {
            return "0.0";
        }
        return String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(alpha)});
    }
}
