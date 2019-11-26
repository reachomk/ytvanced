package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: mss */
public final class mss extends ViewGroup implements OnClickListener, AnimationListener {
    public final ImageButton a;
    public final ImageButton b;
    public final TextView c;
    public final AnimationSet d;
    public final AnimationSet e;
    public aajq[] f;
    public int g;
    public final msu h;
    public aibe i;
    private final ImageButton j;
    private final StateListDrawable k = new StateListDrawable();
    private final StateListDrawable l;
    private final Builder m;

    public mss(Context context, msu msu) {
        Context context2 = context;
        super((Context) amqw.a((Object) context));
        this.h = (msu) amqw.a((Object) msu);
        int i = (int) (getResources().getDisplayMetrics().density * 10.0f);
        this.a = new ImageButton(context2);
        this.b = new ImageButton(context2);
        this.j = new ImageButton(context2);
        this.c = new TextView(context2);
        this.m = new Builder(context2).setTitle(context2.getString(R.string.quality_title)).setNegativeButton(R.string.cancel, new msr());
        this.k.addState(View.SELECTED_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_hq_on));
        this.k.addState(View.EMPTY_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_hq_off));
        this.l = new StateListDrawable();
        this.l.addState(View.SELECTED_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_hd_on));
        this.l.addState(View.EMPTY_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_hd_off));
        this.a.setImageDrawable(this.k);
        this.a.setBackground(null);
        this.a.setPadding(i, i, 0, i);
        this.a.setContentDescription(context2.getText(R.string.accessibility_quality));
        this.a.setOnClickListener(this);
        this.a.setVisibility(8);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.SELECTED_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_cc_on));
        stateListDrawable.addState(View.EMPTY_STATE_SET, ra.a(context2, (int) R.drawable.api_btn_cc_off));
        this.b.setImageDrawable(stateListDrawable);
        this.b.setBackground(null);
        this.b.setPadding(i, i, 0, i);
        this.b.setContentDescription(context2.getText(R.string.accessibility_closed_captions));
        this.b.setOnClickListener(this);
        this.b.setVisibility(8);
        this.j.setImageResource(R.drawable.api_play_on_you_tube);
        this.j.setBackground(null);
        this.j.setPadding(i, i, i, i);
        if (mrp.a(context)) {
            this.j.setContentDescription(context2.getText(R.string.accessibility_play_in_youtube));
            this.j.setOnClickListener(this);
        }
        this.c.setSingleLine();
        this.c.setTextSize(1, 18.0f);
        this.c.setEllipsize(TruncateAt.END);
        this.c.setTextColor(-1);
        this.c.setGravity(17);
        this.c.setPadding(i + i, i, i, i);
        this.d = new AnimationSet(true);
        this.d.setInterpolator(new DecelerateInterpolator());
        this.d.setDuration(200);
        this.d.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        this.d.addAnimation(new TranslateAnimation(1, 0.4f, 1, 0.0f, 1, 0.0f, 1, 0.0f));
        this.d.setAnimationListener(this);
        this.e = new AnimationSet(true);
        this.e.setInterpolator(new AccelerateInterpolator());
        this.e.setDuration(200);
        this.e.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        this.e.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.4f, 1, 0.0f, 1, 0.0f));
        this.e.setAnimationListener(this);
        addView(this.a);
        addView(this.b);
        addView(this.c);
        addView(this.j);
        setBackgroundResource(R.drawable.api_player_menu_bar);
        super.setVisibility(4);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        if (animation == this.e) {
            setVisibility(4);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.h.a(i == 0);
    }

    public final void onClick(View view) {
        if (view == this.a) {
            aajq[] aajqArr = this.f;
            if (aajqArr != null) {
                int length = aajqArr.length;
                if (length > 0) {
                    Builder builder = this.m;
                    String[] strArr = new String[length];
                    for (int i = 0; i < aajqArr.length; i++) {
                        strArr[i] = aajqArr[i].b;
                    }
                    builder.setSingleChoiceItems(strArr, this.g, new mst(this, this.f)).create().show();
                    this.h.b();
                }
            }
        }
        if (view == this.b) {
            this.i.f();
            this.h.b();
            return;
        }
        if (view == this.j) {
            this.h.a();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i = mss.getDefaultSize(0, i);
        i2 = mss.getDefaultSize(0, i2);
        setMeasuredDimension(i, i2);
        i2 = MeasureSpec.makeMeasureSpec(i2, aocf.UNSET_ENUM_VALUE);
        this.j.measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), i2);
        i -= this.j.getMeasuredWidth();
        if (this.a.getVisibility() != 8) {
            this.a.measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), i2);
            i -= this.a.getMeasuredWidth();
        }
        if (this.b.getVisibility() != 8) {
            this.b.measure(MeasureSpec.makeMeasureSpec(i, aocf.UNSET_ENUM_VALUE), i2);
            i -= this.b.getMeasuredWidth();
        }
        if (this.c.getVisibility() != 8) {
            this.c.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), i2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i4 -= i2;
        i3 -= i;
        i = 0;
        if (this.a.getVisibility() != 8) {
            i = mss.a(this.a, 0, i4);
        }
        if (this.b.getVisibility() != 8) {
            i += mss.a(this.b, i, i4);
        }
        if (this.c.getVisibility() != 8) {
            mss.a(this.c, i, i4);
        }
        ImageButton imageButton = this.j;
        mss.a(imageButton, i3 - imageButton.getMeasuredWidth(), i4);
    }

    private static int a(View view, int i, int i2) {
        i2 = (i2 - view.getMeasuredHeight()) / 2;
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
        return view.getMeasuredWidth();
    }
}
