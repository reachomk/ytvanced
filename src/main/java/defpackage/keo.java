package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: keo */
public final class keo implements akot {
    public final DisplayMetrics a;
    private final View b;
    private final int c;
    private final int d;

    public keo(Context context) {
        this.b = new View(context);
        this.a = context.getResources().getDisplayMetrics();
        this.c = xwe.a(context, R.attr.ytSeparator, 0);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.line_separator_height);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        kes kes = (kes) obj;
        int intValue = ((Integer) kes.a.a(new ker(this)).a(Integer.valueOf(this.d))).intValue();
        amqp a = kes.b.a(new keq(this));
        Object valueOf = Integer.valueOf(0);
        int intValue2 = ((Integer) a.a(valueOf)).intValue();
        int intValue3 = ((Integer) kes.c.a(new ket(this)).a(valueOf)).intValue();
        this.b.setMinimumHeight((intValue + intValue2) + intValue3);
        this.b.setBackground(new InsetDrawable(new ColorDrawable(this.c), this.b.getPaddingLeft(), intValue2, this.b.getPaddingRight(), intValue3));
    }
}
