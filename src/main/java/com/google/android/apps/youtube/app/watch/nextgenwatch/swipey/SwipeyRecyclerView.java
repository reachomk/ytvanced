package com.google.android.apps.youtube.app.watch.nextgenwatch.swipey;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.aaz;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.akot;
import defpackage.akoz;
import defpackage.aqj;
import defpackage.ffs;
import defpackage.lmf;
import defpackage.lmh;
import defpackage.xtl;
import java.util.ArrayList;
import java.util.List;

public class SwipeyRecyclerView extends RecyclerView implements aaz {
    public List T;
    private boolean U;

    public SwipeyRecyclerView(Context context) {
        super(context);
        s();
    }

    public final void a(View view, int i) {
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public final void a(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void b(View view, View view2, int i, int i2) {
    }

    public SwipeyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s();
    }

    public SwipeyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s();
    }

    private final void s() {
        this.T = new ArrayList();
        lmf lmf = new lmf();
        ffs ffs = new ffs();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.U) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        try {
            this.U = true;
            int i = 0;
            while (i < this.T.size()) {
                int a = ((lmh) this.T.get(i)).a(this, motionEvent);
                if (a == 1) {
                    this.U = false;
                    a(motionEvent);
                    return true;
                } else if (a == 2) {
                    return false;
                } else {
                    i++;
                }
            }
            this.U = false;
            a(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } finally {
            this.U = false;
            a(motionEvent);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.U) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.U = true;
            int i = 0;
            while (i < this.T.size()) {
                int b = ((lmh) this.T.get(i)).b(this, motionEvent);
                if (b == 1) {
                    this.U = false;
                    a(motionEvent);
                    return true;
                } else if (b == 2) {
                    return false;
                } else {
                    i++;
                }
            }
            this.U = false;
            a(motionEvent);
            return super.onTouchEvent(motionEvent);
        } finally {
            this.U = false;
            a(motionEvent);
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            t();
        }
    }

    public final boolean b(int i, int i2) {
        return super.b(Math.round(((float) i) * 0.25f), Math.round(((float) i2) * 0.25f));
    }

    public final boolean a(View view, View view2, int i, int i2) {
        for (int i3 = 0; i3 < this.T.size(); i3++) {
            ((lmh) this.T.get(i3)).a(view2, i, i2);
        }
        return false;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean onNestedPreFling = super.onNestedPreFling(view, f, f2);
        for (int i = 0; i < this.T.size(); i++) {
            if (((lmh) this.T.get(i)).a(view, f, f2)) {
                return true;
            }
        }
        return onNestedPreFling;
    }

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            t();
        }
    }

    private final void t() {
        for (int i = 0; i < this.T.size(); i++) {
            ((lmh) this.T.get(i)).a();
        }
    }

    public final void requestChildFocus(View view, View view2) {
        String str = "SwipeyRecyclerView.requestChildFocus!";
        try {
            super.requestChildFocus(view, view2);
        } catch (Exception unused) {
            StringBuilder stringBuilder = new StringBuilder(2048);
            try {
                stringBuilder.append("FOCUSED VIEW: ");
                stringBuilder.append(view2);
                stringBuilder.append(10);
                stringBuilder.append("CHILD   VIEW: ");
                stringBuilder.append(view);
                stringBuilder.append(10);
                stringBuilder.append("THIS    VIEW: ");
                stringBuilder.append(this);
                stringBuilder.append(10);
                stringBuilder.append("VIEW  HOLDER: ");
                if (view != null) {
                    aqj c = c(view);
                    if (c != null) {
                        stringBuilder.append(c);
                        stringBuilder.append(10);
                        stringBuilder.append("\nEXTRA FOCUSED INFO:\n");
                        a(stringBuilder, view2);
                        b(stringBuilder, view2);
                        stringBuilder.append("\nEXTRA CHILD INFO:\n");
                        a(stringBuilder, view);
                        b(stringBuilder, view);
                        super.requestChildFocus(view, null);
                    }
                }
                stringBuilder.append("NONE\n");
                stringBuilder.append("\nEXTRA FOCUSED INFO:\n");
                a(stringBuilder, view2);
                b(stringBuilder, view2);
                stringBuilder.append("\nEXTRA CHILD INFO:\n");
                a(stringBuilder, view);
                b(stringBuilder, view);
            } catch (Exception e) {
                stringBuilder.append("Crashed....");
                stringBuilder.append(e);
                stringBuilder.append(10);
                super.requestChildFocus(view, null);
            } finally {
                Throwable illegalStateException = new IllegalStateException(str, new Exception(stringBuilder.toString()));
                xtl.a(getClass().getName(), illegalStateException);
                afpc.a(2, afpf.crash, illegalStateException.getMessage(), illegalStateException);
            }
            super.requestChildFocus(view, null);
        }
    }

    private static void a(StringBuilder stringBuilder, View view) {
        stringBuilder.append("  CHILDREN:\n");
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        int childCount = viewGroup != null ? viewGroup.getChildCount() : 0;
        if (childCount > 0) {
            for (int i = 0; i < childCount; i += 2) {
                View childAt = viewGroup.getChildAt(i);
                stringBuilder.append("    `- #");
                stringBuilder.append(i);
                stringBuilder.append(' ');
                stringBuilder.append(childAt);
                stringBuilder.append(10);
                c(stringBuilder, childAt);
            }
        }
    }

    private static void b(StringBuilder stringBuilder, View view) {
        stringBuilder.append("  PARENTS:\n");
        if (view != null) {
            Object parent = view.getParent();
            int i = 0;
            while (parent instanceof View) {
                stringBuilder.append("    `- #");
                int i2 = i + 1;
                stringBuilder.append(i);
                stringBuilder.append(' ');
                stringBuilder.append(parent);
                stringBuilder.append(10);
                c(stringBuilder, (View) parent);
                parent = parent.getParent();
                i = i2;
            }
        }
    }

    private static void c(StringBuilder stringBuilder, View view) {
        if (view != null) {
            akot a = akoz.a(view);
            if (a != null) {
                stringBuilder.append("     `- P: ");
                stringBuilder.append(a);
                stringBuilder.append(10);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
