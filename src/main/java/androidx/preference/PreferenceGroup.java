package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.aac;
import defpackage.bdz;
import defpackage.bed;
import defpackage.sd;
import java.util.ArrayList;
import java.util.List;

public abstract class PreferenceGroup extends Preference {
    public final aac a;
    private List b;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new aac();
        Handler handler = new Handler();
        bdz bdz = new bdz(this);
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bed.G, i, 0);
        sd.a(obtainStyledAttributes, bed.I, bed.I, true);
        if (obtainStyledAttributes.hasValue(bed.H) && sd.a(obtainStyledAttributes, bed.H, bed.H) != Integer.MAX_VALUE && (TextUtils.isEmpty(this.g) ^ 1) == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getSimpleName());
            stringBuilder.append(" should have a key defined if it contains an expandable preference");
            Log.e("PreferenceGroup", stringBuilder.toString());
        }
        obtainStyledAttributes.recycle();
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, byte b) {
        this(context, attributeSet, i);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int e() {
        return this.b.size();
    }

    public final void a(boolean z) {
        int e = e();
        for (int i = 0; i < e; i++) {
            Preference preference = (Preference) this.b.get(i);
            if (preference.i == z) {
                preference.i = z ^ 1;
                preference.a(preference.c());
                preference.b();
            }
        }
    }
}
