package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: cow */
public final class cow {
    public final List a = new ArrayList(2);
    private final ComponentTree b;

    public cow(ComponentTree componentTree) {
        this.b = componentTree;
    }

    public final void a(cpq cpq) {
        if (this.b.k) {
            for (ViewParent parent = cpq.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof ViewPager) {
                    View view = (ViewPager) parent;
                    biw coy = new coy(this.b, view);
                    try {
                        view.b(coy);
                    } catch (ConcurrentModificationException unused) {
                        abe.a(view, new cov(view, coy));
                    }
                    this.a.add(coy);
                }
            }
        }
    }
}
