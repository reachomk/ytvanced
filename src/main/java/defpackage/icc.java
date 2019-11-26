package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: icc */
public final class icc extends aito implements aibb, enc, fgt {
    public Runnable a;
    public lq b;
    public FrameLayout c;
    private final bcaa d;
    private final aigy e;
    private icf f;
    private boolean g;
    private ProgressBar h;
    private TextView i;
    private View j;
    private ImageView k;
    private TextView l;
    private ice m;
    private icd n;

    public icc(Context context, aigy aigy, bcaa bcaa) {
        super(context);
        iam iam = new iam();
        iam.c = ejd.NONE;
        iam.a = aich.a();
        iam.a(0);
        iam.e = icg.a(0, 0, 0, 0);
        iam.f = null;
        this.m = iam.a();
        this.n = this.m.h();
        this.d = bcaa;
        this.e = aigy;
    }

    public final void a(aibe aibe) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(Map map) {
    }

    public final void c(boolean z) {
    }

    public final void c_(boolean z) {
    }

    public final void d_(boolean z) {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void h_(boolean z) {
    }

    public final void i() {
    }

    public final boolean c() {
        return this.n.a().d().j();
    }

    public final void a(aich aich) {
        this.n.a(aich);
        b(1);
    }

    public final void a(ffu ffu, int i, int i2) {
        this.n.a(ffu.b);
        this.n.a(i2);
        b(2);
    }

    public final void b(ejd ejd) {
        if (this.n.a().d() != ejd) {
            this.n.a(ejd);
            if (ejd.j()) {
                k();
            } else {
                l();
            }
            m();
        }
    }

    public final boolean a(ejd ejd) {
        return ejd.j();
    }

    public final aitx b(Context context) {
        aitx b = super.b(context);
        b.c();
        b.b();
        return b;
    }

    public final void a(aicd aicd) {
        this.n.a(aicd);
        b(8);
    }

    public final void a(String str, boolean z) {
        aich e;
        if (z) {
            e = aich.e();
        } else {
            e = aich.f();
        }
        this.n.a(str);
        this.n.a(e);
        b(1);
    }

    public final void a(long j, long j2, long j3, long j4) {
        if (j() && this.m.b().a == aicj.PLAYING && !this.m.b().b) {
            this.n.a(icg.a(j, j2, j3, j4));
            b(4);
        }
    }

    public final void au_() {
        if (j()) {
            this.f.a();
        }
    }

    public final LayoutParams b() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    private final void n() {
        if (VERSION.SDK_INT >= 21) {
            if (this.m.a() == 3 && this.m.b().a == aicj.PLAYING && !this.m.b().b) {
                this.k.setAlpha(0.0f);
                this.k.setVisibility(0);
                if (!this.g) {
                    this.b = lq.a(this.c.getContext(), R.drawable.audio_indicator_24dp_animation);
                    this.k.setImageDrawable(this.b);
                    this.a = new icb(this);
                    this.g = true;
                }
                this.b.start();
                this.c.postDelayed(this.a, 2140);
                this.k.animate().alpha(0.8f).start();
                return;
            }
            o();
        }
    }

    private final void o() {
        this.c.removeCallbacks(this.a);
        this.k.setVisibility(8);
        this.k.animate().cancel();
        this.k.setAlpha(0.0f);
        lq lqVar = this.b;
        if (lqVar != null) {
            lqVar.stop();
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.c.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.c.onKeyUp(i, keyEvent);
    }
}
