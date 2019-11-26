package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: akne */
public abstract class akne {
    private final Context a;
    private final akpb b;
    private final Queue c = new LinkedList();
    private final Queue d = new LinkedList();

    public akne(Context context, akpb akpb) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akpb) amqw.a((Object) akpb);
    }

    public abstract ViewGroup a(Context context);

    public final akor a(akor akor) {
        akor akor2 = (akor) this.d.poll();
        if (akor2 == null) {
            return new akor(akor);
        }
        akor2.a(akor);
        return akor2;
    }

    public final View a(akor akor, Object obj) {
        ViewGroup viewGroup = (ViewGroup) this.c.poll();
        if (viewGroup == null) {
            viewGroup = a(this.a);
        }
        if (obj != null) {
            int a = this.b.a(obj);
            View view = null;
            akot a2 = this.b.a(a, null);
            if (a2 != null) {
                a2.a_(akor, obj);
                view = a2.K_();
                akoz.a(view, a2, a);
                akoz.a(view, akor);
            }
            if (view != null) {
                viewGroup.addView(view, -1, -2);
            }
        }
        return viewGroup;
    }

    public final void a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i);
            View childAt = viewGroup2.getChildAt(0);
            if (childAt != null) {
                viewGroup2.removeAllViews();
                akor c = akoz.c(childAt);
                if (c != null) {
                    c.a();
                    this.d.add(c);
                    akoz.a(childAt, null);
                }
                this.b.a(childAt);
            }
            this.c.add(viewGroup2);
        }
        viewGroup.removeAllViews();
    }
}
