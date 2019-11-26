package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: paz */
public final class paz extends MarginLayoutParams implements pat {
    public static final Creator CREATOR = new pbb();
    private int a = 1;
    private float b = 0.0f;
    private float c = 1.0f;
    private int d = -1;
    private float e = -1.0f;
    private int f;
    private int g;
    private int h = 16777215;
    private int i = 16777215;
    private boolean j;

    public paz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pba.b);
        this.a = obtainStyledAttributes.getInt(pba.k, 1);
        this.b = obtainStyledAttributes.getFloat(pba.e, 0.0f);
        this.c = obtainStyledAttributes.getFloat(pba.f, 1.0f);
        this.d = obtainStyledAttributes.getInt(pba.c, -1);
        this.e = obtainStyledAttributes.getFraction(pba.d, 1, 1, -1.0f);
        this.f = obtainStyledAttributes.getDimensionPixelSize(pba.j, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(pba.i, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(pba.h, 16777215);
        this.i = obtainStyledAttributes.getDimensionPixelSize(pba.g, 16777215);
        this.j = obtainStyledAttributes.getBoolean(pba.l, false);
        obtainStyledAttributes.recycle();
    }

    public final int describeContents() {
        return 0;
    }

    public paz(paz paz) {
        super(paz);
        this.a = paz.a;
        this.b = paz.b;
        this.c = paz.c;
        this.d = paz.d;
        this.e = paz.e;
        this.f = paz.f;
        this.g = paz.g;
        this.h = paz.h;
        this.i = paz.i;
        this.j = paz.j;
    }

    public paz(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public paz(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public final int a() {
        return this.width;
    }

    public final int b() {
        return this.height;
    }

    public final int c() {
        return this.a;
    }

    public final float d() {
        return this.b;
    }

    public final float e() {
        return this.c;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        return this.f;
    }

    public final int h() {
        return this.g;
    }

    public final int i() {
        return this.h;
    }

    public final int j() {
        return this.i;
    }

    public final boolean k() {
        return this.j;
    }

    public final float l() {
        return this.e;
    }

    public final int m() {
        return this.leftMargin;
    }

    public final int n() {
        return this.topMargin;
    }

    public final int o() {
        return this.rightMargin;
    }

    public final int p() {
        return this.bottomMargin;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeInt(this.d);
        parcel.writeFloat(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeByte(this.j);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    protected paz(Parcel parcel) {
        boolean z = false;
        super(0, 0);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readInt();
        this.e = parcel.readFloat();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.j = z;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
