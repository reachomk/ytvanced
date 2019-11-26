package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: wrx */
public final class wrx implements akou {
    public View a;
    private final wsh b;
    private OnClickListener c;
    private boolean d;

    public wrx(Context context) {
        amqw.a((Object) context);
        TypedValue typedValue = new TypedValue();
        this.b = new wsh(context.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true) ? ra.a(context, typedValue.resourceId) : null, xwe.a(context, R.attr.cmtDivider, 0), context.getResources().getDimensionPixelSize(R.dimen.separator_height));
    }

    public final void a(View view) {
        amqw.a((Object) view);
        this.a = view;
        this.a.setOnClickListener(this.c);
        this.a.setClickable(this.d);
    }

    public final View a() {
        return this.a;
    }

    public final void a(OnClickListener onClickListener) {
        this.c = onClickListener;
        View view = this.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void a(boolean z) {
        this.d = z;
        View view = this.a;
        if (view != null) {
            view.setClickable(z);
        }
    }

    public final View a(akor akor) {
        amqw.a(this.a);
        akno a = akno.a(akor);
        boolean z = false;
        boolean a2 = akor.a("showLineSeparator", false);
        wsh wsh = this.b;
        if (a.a() && a2) {
            z = true;
        }
        if (wsh.a != z) {
            wsh.a = z;
            wsh.invalidateSelf();
        }
        xpv.a(this.a, this.b);
        return this.a;
    }
}
