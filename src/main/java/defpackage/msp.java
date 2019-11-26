package defpackage;

import android.content.Context;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: msp */
public final class msp extends ViewGroup implements OnClickListener {
    public final int a;
    public final mss b;
    public final mum c;
    public final ImageButton d;
    public aibe e;
    public final TextView f;
    private final int g;
    private final int h;
    private final View i;
    private final ImageButton j;

    public msp(Context context, msu msu, mup mup) {
        super((Context) amqw.a((Object) context, (Object) "context cannot be null"));
        amqw.a((Object) msu, (Object) "optionsViewListener cannot be null");
        float f = getResources().getDisplayMetrics().density;
        this.a = (int) ((50.0f * f) + 0.5f);
        this.g = (int) ((45.0f * f) + 0.5f);
        this.h = (int) ((f * 7.0f) + 0.5f);
        this.b = new mss(context, msu);
        addView(this.b);
        this.i = new View(context);
        this.i.setBackgroundResource(R.drawable.api_player_bar);
        addView(this.i);
        this.c = new mum(context, mup);
        addView(this.c);
        this.f = new TextView(context);
        this.f.setBackgroundResource(R.drawable.api_ic_live);
        this.f.setText("LIVE");
        this.f.setTextSize(16.0f);
        this.f.setTextColor(-1);
        this.f.setGravity(16);
        addView(this.f);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_options_selected));
        stateListDrawable.addState(View.ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_options));
        this.j = new ImageButton(context);
        this.j.setBackground(null);
        this.j.setImageDrawable(stateListDrawable);
        ImageButton imageButton = this.j;
        int i = this.h;
        imageButton.setPadding(i, i, i, i);
        this.j.setOnClickListener(this);
        this.j.setContentDescription(context.getText(R.string.accessibility_show_options_menu));
        addView(this.j);
        stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(View.PRESSED_ENABLED_SELECTED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_small_screen_selected));
        stateListDrawable.addState(View.ENABLED_SELECTED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_small_screen));
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_full_screen_selected));
        stateListDrawable.addState(View.ENABLED_STATE_SET, ra.a(context, (int) R.drawable.api_ic_full_screen));
        this.d = new ImageButton(context);
        this.d.setBackground(null);
        this.d.setImageDrawable(stateListDrawable);
        imageButton = this.j;
        i = this.h;
        imageButton.setPadding(i, i, i, i);
        this.d.setOnClickListener(this);
        this.d.setContentDescription(context.getText(R.string.accessibility_enter_fullscreen));
        addView(this.d);
    }

    public final void a(long j, long j2, long j3) {
        this.c.a(j, j2, j3);
    }

    public final void a(boolean z) {
        this.d.setSelected(z);
        this.d.setContentDescription(getContext().getText(!z ? R.string.accessibility_enter_fullscreen : R.string.accessibility_exit_fullscreen));
    }

    public final int a() {
        return (this.a + this.g) - 2;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        i = msp.getDefaultSize(0, i);
        setMeasuredDimension(i, msp.resolveSize(a(), i2));
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.b.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(this.g, 1073741824));
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(this.a, 1073741824);
        int makeMeasureSpec3 = MeasureSpec.makeMeasureSpec(this.a, aocf.UNSET_ENUM_VALUE);
        this.i.measure(makeMeasureSpec, makeMeasureSpec2);
        this.j.measure(makeMeasureSpec3, makeMeasureSpec3);
        makeMeasureSpec = this.h;
        i = (i - (makeMeasureSpec + makeMeasureSpec)) - this.j.getMeasuredWidth();
        if (this.d.getVisibility() != 8) {
            this.d.measure(makeMeasureSpec3, makeMeasureSpec3);
            i -= this.d.getMeasuredWidth();
        }
        i = MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.c.measure(i, makeMeasureSpec3);
        this.f.measure(i, makeMeasureSpec3);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        View view = this.i;
        view.layout(0, i4 - view.getMeasuredHeight(), i3, i4);
        int top = this.i.getTop() + 2;
        mss mss = this.b;
        mss.layout(0, top - mss.getMeasuredHeight(), i3, top);
        top = this.h;
        if (this.c.getVisibility() != 8) {
            i = a(this.c, top);
        } else {
            a(this.f, top);
            i = this.c.getMeasuredWidth();
        }
        top = (top + i) + this.h;
        top += a(this.j, top);
        if (this.d.getVisibility() != 8) {
            a(this.d, top);
        }
    }

    private final int a(View view, int i) {
        int height = (this.i.getHeight() - view.getMeasuredHeight()) / 2;
        view.layout(i, this.i.getTop() + height, view.getMeasuredWidth() + i, this.i.getBottom() - height);
        return view.getWidth();
    }

    public final void onClick(View view) {
        amqw.b(this.e != null, (Object) "listener not set for ControlsOverlay");
        View view2 = this.d;
        if (view == view2) {
            a(view2.isSelected() ^ 1);
            this.e.b(view.isSelected());
        } else if (view == this.j) {
            mss mss = this.b;
            if (mss.getVisibility() == 0) {
                mss.d.cancel();
                mss.e.reset();
                mss.startAnimation(mss.e);
                return;
            }
            mss.e.cancel();
            mss.d.reset();
            mss.startAnimation(mss.d);
            mss.setVisibility(0);
        }
    }

    public final boolean gatherTransparentRegion(Region region) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], (getRight() + i) - getLeft(), (iArr[1] + getBottom()) - getTop(), Op.DIFFERENCE);
        return true;
    }
}
