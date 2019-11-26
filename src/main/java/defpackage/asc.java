package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;

/* renamed from: asc */
public final class asc implements ajj {
    public aja a;
    private aiw b;
    private final /* synthetic */ Toolbar c;

    public asc(Toolbar toolbar) {
        this.c = toolbar;
    }

    public final void a(aiw aiw, boolean z) {
    }

    public final void a(ajm ajm) {
    }

    public final boolean a(aju aju) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public final void a(Context context, aiw aiw) {
        aiw aiw2 = this.b;
        if (aiw2 != null) {
            aja aja = this.a;
            if (aja != null) {
                aiw2.b(aja);
            }
        }
        this.b = aiw;
    }

    public final void a() {
        if (this.a != null) {
            aiw aiw = this.b;
            if (aiw != null) {
                int size = aiw.size();
                int i = 0;
                while (i < size) {
                    if (this.b.getItem(i) != this.a) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            b(this.a);
        }
    }

    public final boolean a(aja aja) {
        Toolbar toolbar = this.c;
        if (toolbar.d == null) {
            toolbar.d = new AppCompatImageButton(toolbar.getContext(), null, R.attr.toolbarNavigationButtonStyle);
            toolbar.d.setImageDrawable(toolbar.b);
            toolbar.d.setContentDescription(toolbar.c);
            asf i = Toolbar.i();
            i.a = (toolbar.h & 112) | 8388611;
            i.b = 2;
            toolbar.d.setLayoutParams(i);
            toolbar.d.setOnClickListener(new asd(toolbar));
        }
        ViewParent parent = this.c.d.getParent();
        ViewParent viewParent = this.c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.d);
            }
            toolbar = this.c;
            toolbar.addView(toolbar.d);
        }
        this.c.e = aja.getActionView();
        this.a = aja;
        parent = this.c.e.getParent();
        viewParent = this.c;
        if (parent != viewParent) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(viewParent.e);
            }
            asf i2 = Toolbar.i();
            Toolbar toolbar2 = this.c;
            i2.a = 8388611 | (toolbar2.h & 112);
            i2.b = 2;
            toolbar2.e.setLayoutParams(i2);
            toolbar = this.c;
            toolbar.addView(toolbar.e);
        }
        toolbar = this.c;
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((asf) childAt.getLayoutParams()).b != 2) {
                if (childAt != toolbar.a) {
                    toolbar.removeViewAt(childCount);
                    toolbar.p.add(childAt);
                }
            }
        }
        this.c.requestLayout();
        aja.d(true);
        View view = this.c.e;
        if (view instanceof ahx) {
            ((ahx) view).onActionViewExpanded();
        }
        return true;
    }

    public final boolean b(aja aja) {
        View view = this.c.e;
        if (view instanceof ahx) {
            ((ahx) view).onActionViewCollapsed();
        }
        Toolbar toolbar = this.c;
        toolbar.removeView(toolbar.e);
        toolbar = this.c;
        toolbar.removeView(toolbar.d);
        toolbar = this.c;
        toolbar.e = null;
        int size = toolbar.p.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) toolbar.p.get(size));
            } else {
                toolbar.p.clear();
                this.a = null;
                this.c.requestLayout();
                aja.d(false);
                return true;
            }
        }
    }
}
