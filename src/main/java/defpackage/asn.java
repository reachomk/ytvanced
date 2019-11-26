package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;

/* renamed from: asn */
final class asn implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {
    public static asn b;
    public static asn c;
    public final View a;
    private final CharSequence d;
    private final int e;
    private final Runnable f = new asm(this);
    private final Runnable g = new asp(this);
    private int h;
    private int i;
    private aso j;
    private boolean k;

    public asn(View view, CharSequence charSequence) {
        this.a = view;
        this.d = charSequence;
        this.e = abp.a(ViewConfiguration.get(this.a.getContext()));
        b();
        this.a.setOnLongClickListener(this);
        this.a.setOnHoverListener(this);
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final boolean onLongClick(View view) {
        this.h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                a();
            }
        } else if (this.a.isEnabled() && this.j == null) {
            action = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(action - this.h) > this.e || Math.abs(y - this.i) > this.e) {
                this.h = action;
                this.i = y;
                asn.a(this);
            }
        }
        return false;
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (abe.H(this.a)) {
            int i;
            long j;
            asn.a(null);
            asn asn = c;
            if (asn != null) {
                asn.a();
            }
            c = this;
            this.k = z;
            this.j = new aso(this.a.getContext());
            aso aso = this.j;
            View view = this.a;
            int i2 = this.h;
            int i3 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.d;
            if (aso.b()) {
                aso.a();
            }
            aso.c.setText(charSequence);
            LayoutParams layoutParams = aso.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = aso.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                dimensionPixelOffset = aso.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i3 + dimensionPixelOffset;
                i3 -= dimensionPixelOffset;
            } else {
                i = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            dimensionPixelOffset = aso.a.getResources().getDimensionPixelOffset(!z2 ? R.dimen.tooltip_y_offset_non_touch : R.dimen.tooltip_y_offset_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof LayoutParams) || ((LayoutParams) layoutParams2).type != 2) {
                for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                int identifier;
                rootView.getWindowVisibleDisplayFrame(aso.e);
                if (aso.e.left < 0 && aso.e.top < 0) {
                    Resources resources = aso.a.getResources();
                    identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    identifier = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    aso.e.set(0, identifier, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(aso.g);
                view.getLocationOnScreen(aso.f);
                int[] iArr = aso.f;
                identifier = iArr[0];
                int[] iArr2 = aso.g;
                iArr[0] = identifier - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                aso.b.measure(makeMeasureSpec, makeMeasureSpec);
                makeMeasureSpec = aso.b.getMeasuredHeight();
                i2 = aso.f[1];
                i3 = ((i3 + i2) - dimensionPixelOffset) - makeMeasureSpec;
                i2 = (i2 + i) + dimensionPixelOffset;
                if (z2) {
                    if (i3 < 0) {
                        layoutParams.y = i2;
                    } else {
                        layoutParams.y = i3;
                    }
                } else if (makeMeasureSpec + i2 <= aso.e.height()) {
                    layoutParams.y = i2;
                } else {
                    layoutParams.y = i3;
                }
            }
            ((WindowManager) aso.a.getSystemService("window")).addView(aso.b, aso.d);
            this.a.addOnAttachStateChangeListener(this);
            if (this.k) {
                j = 2500;
            } else {
                if ((abe.t(this.a) & 1) == 1) {
                    j = 3000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    i2 = ViewConfiguration.getLongPressTimeout();
                }
                j -= (long) i2;
            }
            this.a.removeCallbacks(this.g);
            this.a.postDelayed(this.g, j);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (c == this) {
            c = null;
            aso aso = this.j;
            if (aso != null) {
                aso.a();
                this.j = null;
                b();
                this.a.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (b == this) {
            asn.a(null);
        }
        this.a.removeCallbacks(this.g);
    }

    public static void a(asn asn) {
        asn asn2 = b;
        if (asn2 != null) {
            asn2.a.removeCallbacks(asn2.f);
        }
        b = asn;
        if (asn != null) {
            asn = b;
            asn.a.postDelayed(asn.f, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    private final void b() {
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }
}
