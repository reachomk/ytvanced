package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: bgk */
final class bgk extends FrameLayout {
    public final ViewGroup a;
    public boolean b = true;

    bgk(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.a = viewGroup;
        this.a.setTag(R.id.ghost_view_holder, this);
        bhr.a(this.a).a(this);
    }

    public final void onViewAdded(View view) {
        if (this.b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.a.setTag(R.id.ghost_view_holder, null);
            bhr.a(this.a).b(this);
            this.b = false;
        }
    }

    public static void a(View view, ArrayList arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            bgk.a((View) parent, arrayList);
        }
        arrayList.add(view);
    }
}
