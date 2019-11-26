package defpackage;

import android.content.res.ColorStateList;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: ior */
public final class ior extends apa {
    public final ArrayList c = new ArrayList();
    private final OnClickListener d;
    private final ColorStateList e;
    private final ColorStateList f;

    public ior(OnClickListener onClickListener, ColorStateList colorStateList, ColorStateList colorStateList2) {
        this.d = onClickListener;
        this.e = (ColorStateList) amqw.a((Object) colorStateList);
        this.f = (ColorStateList) amqw.a((Object) colorStateList2);
    }

    public final int a() {
        return this.c.size();
    }
}
