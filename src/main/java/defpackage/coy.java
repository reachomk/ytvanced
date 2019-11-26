package defpackage;

import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;

/* renamed from: coy */
public final class coy extends biz {
    public final WeakReference a;
    private final WeakReference b;

    public final void a(int i, float f, int i2) {
        ComponentTree componentTree = (ComponentTree) this.b.get();
        if (componentTree != null) {
            componentTree.e();
        }
    }

    /* synthetic */ coy(ComponentTree componentTree, ViewPager viewPager) {
        this.b = new WeakReference(componentTree);
        this.a = new WeakReference(viewPager);
    }
}
