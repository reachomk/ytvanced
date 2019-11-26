package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Map;

/* renamed from: mug */
public final class mug extends aiua implements aibb, aifc, aigc, aihv, aiub, OnClickListener, muz {
    private static final mtj b = new mtj();
    public msk a;
    private mvt c;
    private aigf d;
    private aihy e;
    private aiff f;
    private muy g;
    private final mub h;
    private final mte i;
    private final TouchImageView j;
    private final Drawable k = this.i.findViewById(R.id.bottom_bar_background).getBackground();

    public mug(Context context, mub mub, nic nic) {
        super(context);
        this.h = (mub) amqw.a((Object) mub);
        this.i = new mte(context, nic);
        this.j = (TouchImageView) LayoutInflater.from(context).inflate(R.layout.api_watch_in_youtube_button, (ViewGroup) this.i.findViewById(R.id.bottom_end_container), false);
        this.j.setOnClickListener(this);
        mte mte = this.i;
        TouchImageView touchImageView = this.j;
        ViewGroup viewGroup = mte.i;
        viewGroup.addView(touchImageView, Math.max(0, viewGroup.getChildCount() - 1));
        addView(this.i);
    }

    public final View a() {
        return this;
    }

    public final void g() {
    }

    public final void a(int i) {
        if (i != 0) {
            mte mte = this.i;
            mte.n = b;
            mte.findViewById(R.id.bottom_bar_background).setBackgroundColor(i);
            return;
        }
        mte mte2 = this.i;
        mte2.n = null;
        mte2.findViewById(R.id.bottom_bar_background).setBackground(this.k);
    }

    public final LayoutParams b() {
        return this.i.b();
    }

    public final void a(aibe aibe) {
        this.c = new mvt(aibe, new mvr(this.h));
        aigf aigf = this.d;
        if (aigf != null) {
            this.c.a = aigf;
        }
        aihy aihy = this.e;
        if (aihy != null) {
            this.c.b = aihy;
        }
        aiff aiff = this.f;
        if (aiff != null) {
            this.c.c = aiff;
        }
        muy muy = this.g;
        if (muy != null) {
            this.c.d = muy;
        }
        this.i.b = this.c;
    }

    public final void a(aigf aigf) {
        this.d = aigf;
        this.i.d = aigf;
        mvt mvt = this.c;
        if (mvt != null) {
            mvt.a = aigf;
        }
    }

    public final void a(aihy aihy) {
        this.e = aihy;
        this.i.e = aihy;
        mvt mvt = this.c;
        if (mvt != null) {
            mvt.b = aihy;
        }
    }

    public final void a(aiff aiff) {
        this.f = aiff;
        this.i.f = aiff;
        mvt mvt = this.c;
        if (mvt != null) {
            mvt.c = aiff;
        }
    }

    public final void a(muy muy) {
        this.g = muy;
        mvt mvt = this.c;
        if (mvt != null) {
            mvt.d = muy;
        }
    }

    public final void f(boolean z) {
        this.i.o = z;
    }

    public final aitp c() {
        mte mte = this.i;
        if (mte.l == null) {
            mte.l = new aitp((TextView) mte.findViewById(R.id.player_learn_more_button));
        }
        return mte.l;
    }

    public final void a(String str) {
        this.i.j.setText(str);
    }

    public final int d() {
        return this.i.g.b;
    }

    public final void a(aich aich) {
        this.i.a(aich);
    }

    public final void a(String str, boolean z) {
        this.i.a(str, z);
    }

    public final void g(boolean z) {
        this.i.g(z);
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        this.i.a(aajqArr, i, z);
    }

    public final void b(boolean z) {
        this.i.b(z);
    }

    public final void b_(boolean z) {
        this.i.b_(z);
    }

    public final void h_(boolean z) {
        this.i.h_(z);
    }

    public final void c_(boolean z) {
        this.i.c_(z);
    }

    public final void au_() {
        this.i.a(0, 0, 0, 0);
    }

    public final void c(boolean z) {
        this.i.c(z);
    }

    public final void a(long j, long j2, long j3, long j4) {
        this.i.a(j, j2, j3, j4);
    }

    public final void a(aicd aicd) {
        this.i.a(aicd);
    }

    public final void e() {
        this.i.e();
    }

    public final void a(Map map) {
        this.i.a(map);
    }

    public final void d_(boolean z) {
        this.i.d_(z);
    }

    public final void a(CharSequence charSequence) {
        this.i.a(charSequence);
    }

    public final void f() {
        this.i.f();
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        mvt mvt = this.c;
        boolean z = true;
        if ((motionEvent.getFlags() & 1) == 0) {
            z = false;
        }
        mvt.a(z);
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    public final void onClick(View view) {
        if (view == this.j) {
            msk msk = this.a;
            if (msk == null) {
                xtl.d("Failed to set a Play in YouTube verifyingListener.");
                return;
            } else {
                msk.a();
                return;
            }
        }
        this.i.onClick(view);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.i.onKeyDown(i, keyEvent);
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.i.onKeyUp(i, keyEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.i.onTouchEvent(motionEvent);
    }

    public final void d(boolean z) {
        this.i.d(z);
    }

    public final void e(boolean z) {
        this.i.e(z);
    }

    public final void a(ajis ajis) {
        this.i.a(ajis);
    }

    public final void i() {
        this.i.i();
    }

    public final void a(List list) {
        this.i.a(list);
    }

    public final void h() {
        this.i.h();
    }
}
