package defpackage;

import android.content.Context;
import android.support.design.internal.CheckableImageButton;
import android.support.design.textfield.TextInputLayout;

/* renamed from: ks */
public abstract class ks {
    public final TextInputLayout g;
    public final Context h;
    public final CheckableImageButton i;

    ks(TextInputLayout textInputLayout) {
        this.g = textInputLayout;
        this.h = textInputLayout.getContext();
        this.i = textInputLayout.i;
    }

    public abstract void a();

    public boolean a(int i) {
        return true;
    }

    public boolean b() {
        return false;
    }
}
