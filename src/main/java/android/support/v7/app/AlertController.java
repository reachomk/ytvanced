package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.ady;
import defpackage.aed;
import defpackage.afe;
import defpackage.afy;

public final class AlertController {
    public ListAdapter A;
    public int B = -1;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final boolean H;
    public final Handler I;
    public final OnClickListener J = new ady(this);
    public final Context a;
    public final afe b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public ListView g;
    public View h;
    public int i;
    public boolean j = false;
    public Button k;
    public CharSequence l;
    public Message m;
    public Drawable n;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public NestedScrollView t;
    public int u = 0;
    public Drawable v;
    public ImageView w;
    public TextView x;
    public TextView y;
    public View z;

    public class RecycleListView extends ListView {
        public final int a;
        public final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, afy.bJ);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(afy.bK, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(afy.bL, -1);
        }
    }

    public AlertController(Context context, afe afe, Window window) {
        this.a = context;
        this.b = afe;
        this.c = window;
        this.I = new aed(afe);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, afy.D, R.attr.alertDialogStyle, 0);
        this.C = obtainStyledAttributes.getResourceId(afy.E, 0);
        this.D = obtainStyledAttributes.getResourceId(afy.G, 0);
        this.E = obtainStyledAttributes.getResourceId(afy.I, 0);
        obtainStyledAttributes.getResourceId(afy.J, 0);
        this.F = obtainStyledAttributes.getResourceId(afy.L, 0);
        this.G = obtainStyledAttributes.getResourceId(afy.H, 0);
        this.H = obtainStyledAttributes.getBoolean(afy.K, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(afy.F, 0);
        obtainStyledAttributes.recycle();
        afe.a();
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.e = charSequence;
        TextView textView = this.x;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void b(View view) {
        this.h = view;
        this.i = 0;
        this.j = false;
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.I.obtainMessage(i, onClickListener) : null;
        if (i != -2) {
            this.l = charSequence;
            this.m = obtainMessage;
            this.n = null;
            return;
        }
        this.p = charSequence;
        this.q = obtainMessage;
        this.r = null;
    }

    public static ViewGroup a(View view, View view2) {
        if (view != null) {
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(view2);
                }
            }
            if (view instanceof ViewStub) {
                view = ((ViewStub) view).inflate();
            }
            return (ViewGroup) view;
        }
        if (view2 instanceof ViewStub) {
            view2 = ((ViewStub) view2).inflate();
        }
        return (ViewGroup) view2;
    }

    public static void a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(!view.canScrollVertically(-1) ? 4 : 0);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    public static void a(Button button) {
        LayoutParams layoutParams = (LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
