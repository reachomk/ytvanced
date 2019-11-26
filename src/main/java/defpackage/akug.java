package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: akug */
public abstract class akug {
    public abstract akug a();

    public abstract akug a(int i);

    public abstract akug a(ColorStateList colorStateList);

    public abstract akug a(View view);

    public abstract akug a(TextView textView);

    public abstract akue b();

    public abstract akug b(int i);

    public abstract akug b(ColorStateList colorStateList);

    public abstract akug b(TextView textView);

    public abstract akug c(int i);

    public abstract akug c(ColorStateList colorStateList);

    public final akug c() {
        a(null);
        a(0);
        c(null);
        b(null);
        b(0);
        b(null);
        c(0);
        c(null);
        a(null);
        a();
        return this;
    }
}
