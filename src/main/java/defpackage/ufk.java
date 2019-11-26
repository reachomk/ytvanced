package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.google.android.youtube.R;

/* renamed from: ufk */
public class ufk implements ufg {
    public final String b;
    public ColorStateList c = null;
    public Drawable d = null;
    public Drawable e = null;

    public ufk(String str) {
        this.b = str;
    }

    public final boolean b() {
        return true;
    }

    public int c() {
        return R.layout.bottom_sheet_list_item;
    }

    public final ufk a(int i) {
        this.c = ColorStateList.valueOf(i);
        return this;
    }
}
