package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;

/* renamed from: grf */
public final class grf implements grr {
    public final CoordinatorLayout a;
    public final EditText b;
    public final ViewGroup c;
    public final BottomSheetBehavior d;
    public final float e;
    public final float f;
    public final int g;
    public final grl h;
    public grj i;
    public boolean j;
    private final Context k;
    private final RecyclerView l = new RecyclerView(this.k);

    public grf(Context context, grq grq, CoordinatorLayout coordinatorLayout, EditText editText, ViewGroup viewGroup, apxu apxu, acvx acvx, ayvv ayvv) {
        this.k = context;
        this.a = (CoordinatorLayout) amqw.a((Object) coordinatorLayout);
        this.b = (EditText) amqw.a((Object) editText);
        this.c = (ViewGroup) amqw.a((Object) viewGroup);
        gre gre = new gre(this);
        grh grh = new grh(this);
        this.b.addTextChangedListener(gre);
        this.b.addTextChangedListener(new wlw());
        this.b.getText().setSpan(grh, 0, 0, 18);
        this.a.addOnLayoutChangeListener(new grg(this));
        this.l.setLayoutParams(new apr(-1, -2));
        this.c.addView(this.l);
        this.h = grq.a(this, this.l, apxu, acvx, ayvv);
        this.d = BottomSheetBehavior.b((View) viewGroup);
        this.d.b(5);
        Resources resources = context.getResources();
        this.e = resources.getDimension(R.dimen.user_mention_chip_corner_radius);
        this.f = resources.getDimension(R.dimen.user_mention_chip_horizontal_padding);
        this.g = xwe.a(context, R.attr.ytBadgeChipBackground, 0);
    }

    public final void a(aywd aywd) {
        if (this.i != null) {
            Editable text = this.b.getText();
            int spanStart = text.getSpanStart(this.i);
            int spanEnd = text.getSpanEnd(this.i);
            a();
            String str = aywd.c;
            String str2 = aywd.b;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 3);
            stringBuilder.append(" @");
            stringBuilder.append(str);
            stringBuilder.append(160);
            String stringBuilder2 = stringBuilder.toString();
            this.b.getText().replace(spanStart, spanEnd, stringBuilder2);
            int length = stringBuilder2.length() + spanStart;
            this.b.getText().setSpan(new wlr(str2, this.e, this.f, ((float) this.b.getMeasuredWidth()) * 0.9f, this.g), spanStart, length, 33);
            this.b.getText().setSpan(new wlt(), spanStart, length, 33);
            this.b.getText().insert(this.b.getSelectionStart(), " ");
        }
    }

    public final void a() {
        if (this.i != null) {
            this.b.getText().removeSpan(this.i);
            this.h.b();
        }
        this.i = null;
        c();
    }

    public final boolean b() {
        return this.b.getSelectionStart() == this.b.getSelectionEnd();
    }

    public final void a(boolean z) {
        if (z) {
            c();
        } else {
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior.k == 5) {
                bottomSheetBehavior.b(4);
            }
        }
        this.j = z;
    }

    public final void c() {
        this.d.b(5);
    }
}
