package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.PivotTabsBar;
import com.google.android.youtube.R;
import java.util.Locale;
import java.util.MissingFormatArgumentException;

/* renamed from: jlo */
public final class jlo {
    public final View a;
    public final TextView b;
    public final ImageView c;
    private final amro d;
    private final amro e;
    private View f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private final /* synthetic */ PivotTabsBar l;

    public final void a(boolean z, int i) {
        View view;
        boolean z2 = z && i == 0;
        z = z && i > 0;
        CharSequence text = this.b.getText();
        if (z2) {
            view = this.f;
            if (view instanceof ViewStub) {
                this.f = ((ViewStub) view).inflate();
                this.h = this.f.getBackground();
            }
            this.a.setContentDescription(String.format(this.l.l, new Object[]{text}));
        }
        view = this.f;
        if (view != null) {
            xpr.a(view, z2);
        }
        if (z) {
            CharSequence quantityString;
            view = this.g;
            if (view instanceof ViewStub) {
                this.g = ((ViewStub) view).inflate();
                this.i = this.g.getBackground();
            }
            if (this.g instanceof TextView) {
                CharSequence format;
                if (i <= 9) {
                    format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i)});
                } else {
                    format = String.format(Locale.getDefault(), "%d+", new Object[]{Integer.valueOf(9)});
                }
                ((TextView) this.g).setText(format);
            }
            if (i <= 9) {
                try {
                    quantityString = this.l.b.getQuantityString(R.plurals.tab_with_new_items, i, new Object[]{Integer.valueOf(i), text});
                } catch (MissingFormatArgumentException unused) {
                    quantityString = String.format(this.l.l, new Object[]{text});
                }
            } else {
                quantityString = String.format(this.l.m, new Object[]{text});
            }
            this.a.setContentDescription(quantityString);
        }
        View view2 = this.g;
        if (view2 != null) {
            xpr.a(view2, z);
        }
        if (!z2 && !z) {
            this.a.setContentDescription(text);
        }
    }

    public final void a(boolean z) {
        if (!(this.f instanceof ViewStub)) {
            if (z && this.j == null) {
                this.j = (Drawable) this.d.get();
            }
            this.f.setBackground(!z ? this.h : this.j);
        }
        if (!(this.g instanceof ViewStub)) {
            if (z && this.k == null) {
                this.k = (Drawable) this.e.get();
            }
            this.g.setBackground(!z ? this.i : this.k);
        }
        ImageView imageView;
        if (z) {
            imageView = this.c;
            imageView.setImageDrawable(xoe.a(imageView.getDrawable(), this.l.h));
            this.b.setTextColor(this.l.h);
        } else {
            PivotTabsBar pivotTabsBar = this.l;
            if (!(pivotTabsBar.g == null || pivotTabsBar.k == null)) {
                imageView = this.c;
                imageView.setImageDrawable(xoe.a(imageView.getDrawable(), this.l.g));
                this.b.setTextColor(this.l.k);
            }
        }
        if (VERSION.SDK_INT >= 21) {
            Drawable background = this.a.getBackground();
            if (background instanceof RippleDrawable) {
                ColorStateList colorStateList;
                RippleDrawable rippleDrawable = (RippleDrawable) background.mutate();
                if (z) {
                    colorStateList = this.l.j;
                } else {
                    colorStateList = this.l.i;
                }
                rippleDrawable.setColor(colorStateList);
                this.a.setBackground(rippleDrawable);
                return;
            }
        }
        Drawable background2 = this.a.getBackground();
        if (background2 != null) {
            ColorStateList colorStateList2;
            View view = this.a;
            background2 = background2.mutate();
            PivotTabsBar pivotTabsBar2 = this.l;
            if (pivotTabsBar2.p) {
                colorStateList2 = pivotTabsBar2.j;
            } else {
                colorStateList2 = pivotTabsBar2.i;
            }
            view.setBackground(xoe.a(background2, colorStateList2, Mode.SRC_IN));
        }
    }

    /* synthetic */ jlo(PivotTabsBar pivotTabsBar, View view, amro amro, amro amro2) {
        this.l = pivotTabsBar;
        this.a = view;
        this.b = (TextView) view.findViewById(R.id.text);
        this.c = (ImageView) view.findViewById(R.id.image);
        this.d = amro;
        this.e = amro2;
        this.f = view.findViewById(R.id.new_content_dot);
        this.g = view.findViewById(R.id.new_content_count);
    }
}
