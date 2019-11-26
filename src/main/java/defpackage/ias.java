package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: ias */
public final class ias implements ibs {
    public final View a;
    public final xqc b;
    public final xqc c;
    public final ails d;
    public final int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final aics i;
    private final ImageView j;
    private final ibq k;
    private final boolean l;

    ias(View view, ibq ibq, ief ief, ails ails, zyw zyw) {
        this.k = ibq;
        this.d = ails;
        this.l = foh.b(zyw);
        Resources resources = view.getResources();
        int integer = resources.getInteger(R.integer.fade_duration_fast);
        this.a = view.findViewById(R.id.bottom_ui_container);
        long j = (long) integer;
        this.b = new xnz(view.findViewById(R.id.bottom_start_container), j, 8);
        this.c = new xnz((ViewGroup) view.findViewById(R.id.bottom_end_container), j, 8);
        this.e = resources.getDimensionPixelOffset(R.dimen.related_end_screen_height);
        this.j = (ImageView) view.findViewById(R.id.player_control_bottom_play_pause_replay_button);
        this.j.setOnClickListener(new iav(ief));
        this.i = new aics(this.j, view.getContext());
        c(false);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.f) {
            this.f = false;
            c(z);
        }
    }

    public final void b(boolean z) {
        int dimensionPixelOffset = (z ^ 1) != 0 ? this.a.getResources().getDimensionPixelOffset(R.dimen.controls_overlay_bottom_ui_text_side_margin) : 0;
        View view = this.a;
        abe.a(view, abe.j(view), this.a.getPaddingTop(), dimensionPixelOffset, this.a.getPaddingBottom());
        c(false);
    }

    public final void c(boolean z) {
        xqc xqc = this.b;
        boolean z2 = false;
        boolean z3 = this.f && this.g && !this.l && !this.h && (!this.d.d.a() || this.d.d.f());
        xqc.a(z3, z);
        xqc = this.c;
        if (this.f && this.k.b() && !(this.g && this.l)) {
            z2 = true;
        }
        xqc.a(z2, z);
    }
}
