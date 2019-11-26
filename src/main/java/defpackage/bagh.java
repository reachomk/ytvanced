package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: bagh */
public final class bagh extends FrameLayout implements OnTouchListener {
    public int a = -1;
    public boolean b;
    public Runnable c;
    public Runnable d;
    private OrientationEventListener e;
    private ImageButton f;

    public bagh(Context context) {
        super(context);
        setOnTouchListener(this);
        setBackground(new ColorDrawable(-12232092));
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.transition_view, this, true);
        findViewById(R.id.transition_switch_action).setOnClickListener(new bagk(this));
        ((ImageView) findViewById(R.id.transition_icon)).setOnClickListener(new bagj(this));
        c();
        if (getResources().getConfiguration().orientation == 2) {
            findViewById(R.id.transition_bottom_frame).setVisibility(8);
        }
        super.setVisibility(8);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }

    public final void a(String str) {
        TextView textView = (TextView) findViewById(R.id.transition_text);
        if (str != null) {
            textView.setText(getContext().getString(R.string.place_your_viewer_into_viewer_format, new Object[]{str}));
            return;
        }
        textView.setText(getContext().getString(R.string.place_your_phone_into_cardboard));
    }

    public final void a(Runnable runnable) {
        this.d = runnable;
        c();
    }

    public final void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (visibility == i) {
            return;
        }
        if (i != 0) {
            b();
        } else if (this.e == null) {
            this.e = new bagm(this, getContext());
            this.e.enable();
        }
    }

    private final void b() {
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            this.a = -1;
            orientationEventListener.disable();
            this.e = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            orientationEventListener.enable();
        }
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        OrientationEventListener orientationEventListener = this.e;
        if (orientationEventListener != null) {
            this.a = -1;
            orientationEventListener.disable();
        }
        super.onDetachedFromWindow();
    }

    public final void a() {
        if (getWidth() > 0 && getHeight() > 0 && this.a != -1 && this.e != null && !this.b) {
            int width = getWidth();
            int height = getHeight();
            Object obj = width >= height ? null : 1;
            int abs = Math.abs(this.a - 180);
            if (obj != (abs <= 135 ? null : 1)) {
                View findViewById = findViewById(R.id.transition_frame);
                int width2 = findViewById.getWidth();
                int height2 = findViewById.getHeight();
                if (getLayoutDirection() == 1) {
                    findViewById.setPivotX(((float) height2) - findViewById.getPivotX());
                    findViewById.setPivotY(((float) width2) - findViewById.getPivotY());
                }
                if (width < height) {
                    findViewById.setRotation(90.0f);
                } else {
                    findViewById.setRotation(-90.0f);
                }
                findViewById.setTranslationX((float) ((width2 - height2) / 2));
                findViewById.setTranslationY((float) ((height2 - width2) / 2));
                LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = width2;
                layoutParams.width = height2;
                findViewById.requestLayout();
            }
            if (abs <= 135) {
                findViewById(R.id.transition_bottom_frame).setVisibility(8);
            } else {
                findViewById(R.id.transition_bottom_frame).setVisibility(0);
            }
            this.b = true;
            if (bagh.a(this.a)) {
                a(true);
            }
        }
    }

    private final void a(boolean z) {
        b();
        Animation animation = getAnimation();
        if (animation != null) {
            if (!z && animation.getStartOffset() != 0) {
                animation.setAnimationListener(null);
                clearAnimation();
            } else {
                return;
            }
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setRepeatCount(0);
        alphaAnimation.setDuration(500);
        if (z) {
            alphaAnimation.setStartOffset(2000);
        }
        alphaAnimation.setAnimationListener(new bagl(this));
        startAnimation(alphaAnimation);
    }

    private final void c() {
        this.f = (ImageButton) ((ViewGroup) findViewById(R.id.transition_frame)).findViewById(R.id.back_button);
        Runnable runnable = this.d;
        if (runnable == null) {
            this.f.setVisibility(8);
            this.f.setTag(null);
            this.f.setOnClickListener(null);
            return;
        }
        this.f.setTag(runnable);
        this.f.setVisibility(0);
        this.f.setOnClickListener(new bago(this));
    }

    public static boolean a(int i) {
        return Math.abs(i + -270) < 5;
    }
}
