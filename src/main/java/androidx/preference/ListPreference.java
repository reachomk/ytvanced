package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.youtube.R;
import defpackage.bdw;
import defpackage.bdy;
import defpackage.bed;
import defpackage.sd;

public class ListPreference extends DialogPreference {
    public CharSequence[] a;
    public CharSequence[] b;
    public String c;
    public boolean d;
    private String k;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.u, i, 0);
        this.a = sd.d(obtainStyledAttributes, bed.x, bed.v);
        this.b = sd.d(obtainStyledAttributes, bed.y, bed.w);
        if (sd.a(obtainStyledAttributes, bed.z, bed.z, false)) {
            if (bdw.a == null) {
                bdw.a = new bdw();
            }
            a(bdw.a);
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, bed.F, i, 0);
        this.k = sd.b(obtainStyledAttributes2, bed.at, bed.ab);
        obtainStyledAttributes2.recycle();
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sd.a(context, (int) R.attr.dialogPreferenceStyle, 16842897));
    }

    public final CharSequence d() {
        bdy bdy = this.j;
        if (bdy != null) {
            return bdy.a(this);
        }
        CharSequence e = e();
        CharSequence d = super.d();
        String str = this.k;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (e == null) {
                e = "";
            }
            objArr[0] = e;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, d)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return d;
    }

    public final CharSequence e() {
        String str = this.c;
        int i = -1;
        if (str != null) {
            CharSequence[] charSequenceArr = this.b;
            if (charSequenceArr != null) {
                for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                    if (this.b[length].equals(str)) {
                        i = length;
                        break;
                    }
                }
            }
        }
        if (i >= 0) {
            CharSequence[] charSequenceArr2 = this.a;
            if (charSequenceArr2 != null) {
                return charSequenceArr2[i];
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object a(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }
}
