package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.bottomsheet.BottomSheetBehavior;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.youtube.R;

/* renamed from: ff */
public class ff extends afe {
    public boolean a;
    public boolean b;
    public boolean c;
    private BottomSheetBehavior d;
    private fb e;

    public ff(Context context) {
        this(context, 0);
    }

    public ff(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.f502Theme.Design.Light.BottomSheetDialog;
        }
        super(context, i);
        this.a = true;
        this.b = true;
        this.e = new fj(this);
        a();
    }

    public final void setContentView(int i) {
        super.setContentView(a(i, null, null));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(aocf.UNSET_ENUM_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setContentView(View view) {
        super.setContentView(a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.a != z) {
            this.a = z;
            BottomSheetBehavior bottomSheetBehavior = this.d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.a(z);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.k == 5) {
            bottomSheetBehavior.b(4);
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.a) {
            this.a = true;
        }
        this.b = z;
        this.c = true;
    }

    private final View a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        View view2 = (FrameLayout) coordinatorLayout.findViewById(R.id.design_bottom_sheet);
        this.d = BottomSheetBehavior.b(view2);
        BottomSheetBehavior bottomSheetBehavior = this.d;
        bottomSheetBehavior.p = this.e;
        bottomSheetBehavior.a(this.a);
        if (layoutParams == null) {
            view2.addView(view);
        } else {
            view2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new fe(this));
        abe.a(view2, new fh(this));
        view2.setOnTouchListener(new fg());
        return frameLayout;
    }
}
