package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: akyk */
public class akyk extends ufk {
    private final Context a;
    public boolean f;
    public String g;

    public akyk(Context context, String str) {
        super(str);
        this.a = context;
    }

    public final int c() {
        return R.layout.bottom_sheet_list_checkmark_item;
    }

    public final void a(boolean z) {
        Drawable drawable;
        this.f = z;
        if (z) {
            drawable = this.a.getResources().getDrawable(R.drawable.quantum_ic_check_grey600_24);
        } else {
            drawable = null;
        }
        this.d = drawable;
    }
}
